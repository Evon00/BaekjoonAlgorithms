import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N = Integer.parseInt(br.readLine());
        HashSet<Integer> nSet = new HashSet<>();
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        
        for(int i = 0; i < N; i++){
            nSet.add(Integer.parseInt(st.nextToken()));
        }

        int M = Integer.parseInt(br.readLine());
        int[] owns = new int[M];
        st = new StringTokenizer(br.readLine()," ");

        for(int i = 0; i < M; i++){
            owns[i] = Integer.parseInt(st.nextToken());
        }
        for(int i = 0; i < M; i++){
            if(nSet.contains(owns[i])) bw.write("1 ");
            else bw.write("0 ");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}