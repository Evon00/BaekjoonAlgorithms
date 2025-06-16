import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] power = new int[N];
        String[] powerTitle = new String[N];

        for(int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());
            powerTitle[i] = st.nextToken();
            power[i] = Integer.parseInt(st.nextToken());
        }

        for(int i = 0; i < M; i++){
            int userPower = Integer.parseInt(br.readLine());
            int low = 0;
            int high = N - 1;
            
            while(low < high){
                int mid = (low + high) / 2;
                if(userPower > power[mid]) low = mid+1;
                else high = mid;
            }
            bw.write(powerTitle[low]+"\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }
}