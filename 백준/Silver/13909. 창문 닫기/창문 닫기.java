import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        long n = Long.parseLong(br.readLine());

        int count = 0;

        for(int i = 1; i *i <= n; i++){
            count++;
        }

        bw.write(String.valueOf(count)+"\n");
        
        br.close();
        bw.flush();
        bw.close();
    }
}