import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        Queue<Integer> queue = new LinkedList<>();

        for(int i = 0; i < N; i++){
            queue.add(i+1);
        }

        bw.write("<");
        
        while(queue.size() != 1){
            for(int i = 0; i < K-1; i++){
                queue.add(queue.poll());
            }
            bw.write(String.valueOf(queue.poll())+", ");
        }
        bw.write(String.valueOf(queue.poll()));
        bw.write(">");

        br.close();
        bw.flush();
        bw.close();
    }
}