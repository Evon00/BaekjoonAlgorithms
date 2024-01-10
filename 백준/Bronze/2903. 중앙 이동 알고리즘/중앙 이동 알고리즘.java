import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N = Integer.parseInt(br.readLine());
        int dot = 2;
        for(int i = 1; i <= N; i++){
            dot = dot-1 + dot;
        }
        
        bw.write(String.valueOf(dot*dot));
        
        br.close();
        bw.flush();
        bw.close();
    }
}