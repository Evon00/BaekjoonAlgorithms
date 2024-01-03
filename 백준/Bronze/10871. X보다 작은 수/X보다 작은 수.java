import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int N = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());

        int[] num = new int[N];

        st = new StringTokenizer(br.readLine()," ");
        
        for(int i = 0; i < N; i++){
            num[i] = Integer.parseInt(st.nextToken());
        }
        
        for(int i = 0; i < N; i++){
            if(num[i] < X)
                bw.write(num[i]+" ");
        }
        br.close();
        bw.flush();
        bw.close();
        
    }
}