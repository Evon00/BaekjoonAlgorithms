import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        int sum = 0;
        for(int i = 0; i < 5; i++){
            int N = Integer.parseInt(st.nextToken());
            sum += N * N ;
        }
        bw.write(String.valueOf(sum%10));
        br.close();
        bw.flush();
        bw.close();
    }
}