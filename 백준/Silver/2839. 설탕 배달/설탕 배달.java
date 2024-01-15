import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int count = 0;

        while(true){
            if(N % 5 == 0){
                bw.write(String.valueOf(N/5+count));
                break;
            } else if(N % 5 > 0){
                N = N - 3;
                count++;
            } else{
                bw.write("-1");
                break;
            }
        }
        
        br.close();
        bw.flush();
        bw.close();
    }
}