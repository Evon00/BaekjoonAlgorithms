import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Long n = Long.parseLong(br.readLine());
        bw.write(String.valueOf(n*n*n)+"\n");
        bw.write("3");
        
        br.close();
        bw.flush();
        bw.close();
    }
}