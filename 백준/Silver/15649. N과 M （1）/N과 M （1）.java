import java.util.*;
import java.io.*;

class Main {

    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] arr = new int[N+1];
        boolean[] visit = new boolean[N+1];

        backtracking(arr,visit,N,M,0);

        br.close();
        bw.flush();
        bw.close();
        
    }
    
    private static void backtracking(int[] arr, boolean[] visit, int N, int M, int depth) throws IOException{
        if(depth == M){
            for(int i = 0; i < M; i++)
                bw.write(arr[i]+" ");
            bw.write("\n");
        } else {
            for(int i = 1; i <= N; i++){
                if(!visit[i]){
                    arr[depth] = i;
                    visit[i] = true;
                    backtracking(arr,visit,N,M,depth+1);
                    visit[i] = false;
                }
            }
        }
    }
}