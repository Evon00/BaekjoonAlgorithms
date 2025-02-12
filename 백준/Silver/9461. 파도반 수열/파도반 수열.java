import java.util.*;
import java.lang.*;
import java.io.*;

class Main {

    static long[] dp = new long[101];

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N = Integer.parseInt(br.readLine());

        Arrays.fill(dp,0);
        dp[1] = 1;
        dp[2] = 1;
        dp[3] = 1;

        for(int i = 0; i < N; i++){
            int n = Integer.parseInt(br.readLine());
            bw.write(padoban(n) + "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    private static long padoban(int n){

        if(n <= 3) return dp[n];

        if(dp[n] == 0){
            return dp[n] = padoban(n-2) + padoban(n-3);
        }
        
        return dp[n];

    }
}