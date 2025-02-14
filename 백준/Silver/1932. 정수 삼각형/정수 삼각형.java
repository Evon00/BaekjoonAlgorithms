import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][n];

        StringTokenizer st;
        
        for(int i = 0; i < n; i++){
            st = new StringTokenizer(br.readLine());
            int j = 0;
            while(st.hasMoreTokens()){
                arr[i][j++] = Integer.parseInt(st.nextToken());
            }
        }

        for(int i = n -2; i >= 0; i--){
            for(int j = 0; j <= i; j++){
                arr[i][j] += Math.max(arr[i+1][j],arr[i+1][j+1]);
            }
        }
        System.out.print(arr[0][0]);
        
    }
}