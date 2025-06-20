import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());

        for(int i = 0; i < T; i++){
            int n = Integer.parseInt(br.readLine());
            int[] arr = new int[n];
            StringTokenizer st = new StringTokenizer(br.readLine());

            for(int j = 0; j < n; j++){
                arr[j] = Integer.parseInt(st.nextToken());
            }

            int maxValue = 0;
            long result = 0;

            for(int j = n - 1; j >= 0; j--){
                if(maxValue > arr[j]){
                    result += maxValue - arr[j];
                }else {
                    maxValue = arr[j];
                }
            }

            bw.write(result+"\n");
        }

        bw.flush();
        bw.close();
        br.close();
        
    }
}