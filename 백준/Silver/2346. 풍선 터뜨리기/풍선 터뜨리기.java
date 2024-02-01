import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        Deque<Balloon> q = new ArrayDeque<>();
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        for(int i = 0; i < N; i++){
            q.add(new Balloon(i+1,Integer.parseInt(st.nextToken())));
        }

        Balloon first = q.pollFirst();
        int value = first.value;
        bw.write(String.valueOf(first.index)+" ");

        while(!q.isEmpty()){
            if(value > 0){
                for(int i = 0; i < value-1; i++){
                    q.add(q.poll());
                }
                Balloon next = q.poll();
                value = next.value;
                bw.write(String.valueOf(next.index)+" ");
            }else{
                for(int i = 0; i < (-value)-1; i++){
                    q.addFirst(q.pollLast());
                }
                Balloon next = q.pollLast();
                value = next.value;
                bw.write(String.valueOf(next.index)+" ");
            }
        }
        br.close();
        bw.flush();
        bw.close();
    }
    static class Balloon{
        int index;
        int value;
        public Balloon(int index, int value){
            this.index = index;
            this.value = value;
        }
    }
}