import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int number = 2;

        if(N != 1){
            while(N > 1){
                if(N % number == 0){
                    bw.write(String.valueOf(number)+"\n");
                    N /= number;
                }else {
                    number++;
                }
            }
        }
        
        br.close();
        bw.flush();
        bw.close();
    }
}