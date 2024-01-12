import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        
        int K = Integer.parseInt(st.nextToken());
        long N = Long.parseLong(st.nextToken());
        int[] arr = new int[K];
        long max = 0;
        long min = 0;
        
        for(int i = 0; i < K; i++){
            arr[i] = Integer.parseInt(br.readLine());
            if(max < arr[i])
                max = arr[i];
        }

        max++;

        while(min < max){
            
            long count = 0;
            long mid = (max + min) / 2;
            
            for(int i = 0; i < K; i++){
                count += arr[i] / mid;
            }

            if(count < N){
                max = mid;
            }else {
                min = mid +1;
            }
        }

        bw.write(String.valueOf(min-1));

        br.close();
        bw.flush();
        bw.close();
    }
}