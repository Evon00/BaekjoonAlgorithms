import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int testCase = Integer.parseInt(br.readLine());
        int sum = 0;
        
        String line = br.readLine();
        
        for(int i = 0; i < testCase; i++){
            sum += line.charAt(i) - '0';
        }
        
        bw.write(sum+"\n");
        br.close();
        bw.flush();
        bw.close();
    }
}