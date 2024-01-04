import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int testCase = Integer.parseInt(br.readLine());
        
        for(int i = 0; i < testCase; i++){
            String line = br.readLine();
            bw.write(""+line.charAt(0)+line.charAt(line.length()-1)+"\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}