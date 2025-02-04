import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        PriorityQueue<Integer> maxPQ = new PriorityQueue<>(Comparator.reverseOrder()); //높은 숫자 우선순위
        PriorityQueue<Integer> minPQ = new PriorityQueue<>(); //낮은 숫자 우선순위

        for(int i = 0; i < N; i++){
            int num = Integer.parseInt(br.readLine());

            if(maxPQ.size() == minPQ.size()){ //최대힙에 먼저 넣기
                maxPQ.add(num);

                if(!minPQ.isEmpty() && maxPQ.peek() > minPQ.peek()){ //만약 해당 값이 minPQ의 값보다 클경우 교체
                    minPQ.add(maxPQ.poll());
                    maxPQ.add(minPQ.poll());
                }
            } else { //위의 방식대로면 두개의 크기가 다르면 minPQ에 넣는다
                minPQ.add(num);

                if(maxPQ.peek() > minPQ.peek()){ //해당 값이 maxPQ의 값보다 작을경우 교체
                    minPQ.add(maxPQ.poll());
                    maxPQ.add(minPQ.poll());
                }
            }
            bw.write(maxPQ.peek()+"\n");
        }

        br.close();
        bw.flush();
        bw.close();
  }
}