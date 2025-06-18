import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        Queue<Integer> heap = new PriorityQueue<>();

        for(int i = 0; i < N; i++){
            int num = Integer.parseInt(br.readLine());

            if(num == 0){
                if(heap.isEmpty()) bw.write(0+"\n");
                else bw.write(heap.poll()+"\n");
            }else{
                heap.add(num);
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}