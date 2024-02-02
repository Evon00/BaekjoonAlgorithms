import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;
        int[][] dp = new int[30][30];

        for(int i = 0; i < 30; i++){
            dp[i][i] = 1;
            dp[i][0] = 1;
        }
        for(int i = 2; i < 30; i++){
            for(int j = 1; j <= i; j++){
                dp[i][j] = dp[i-1][j-1] + dp[i-1][j];
            }
        }

        for(int i = 0; i < T; i++){
            st = new StringTokenizer(br.readLine()," ");
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());
            bw.write(dp[M][N]+"\n");
        }
        
        br.close();
        bw.flush();
        bw.close();
    }
}