import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        Deque<Integer> list = new ArrayDeque<>();
        int[] zeroArr = new int[N];
        StringTokenizer st;

        st = new StringTokenizer(br.readLine()," ");
        int index = 0;

        for(int i = 0; i < N; i++){
            zeroArr[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine()," ");

        for(int i = 0; i < N; i++){
            int number = Integer.parseInt(st.nextToken());
            if(zeroArr[i] == 0)
                list.add(number);
        }

        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine()," ");

        for(int i = 0; i < M; i++){
            list.addFirst(Integer.parseInt(st.nextToken()));
            bw.write(list.pollLast()+" ");

        }
        
        br.close();
        bw.flush();
        bw.close();
    }
}