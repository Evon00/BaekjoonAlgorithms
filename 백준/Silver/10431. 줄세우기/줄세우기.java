import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st;
        
        int[] arr = new int[20];

        for(int i = 1; i <= n; i++){
            
            st = new StringTokenizer(br.readLine());
            st.nextToken();

            int cnt = 0;
            
            for(int j = 0; j < 20; j++){
                arr[j] = Integer.parseInt(st.nextToken());
            }

            for(int j = 0; j < 20; j++){
                for(int k = 0; k < j; k++){
                    if(arr[k] > arr[j]) cnt++;
                }
            }
            bw.write(i + " " + cnt+"\n");
        }

        br.close();
        bw.flush();
        bw.close();
        
    }
}