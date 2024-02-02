import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int result = factorial(N) / (factorial(K)*factorial(N-K));
        
        bw.write(String.valueOf(result));
        
        br.close();
        bw.flush();
        bw.close();
    }

    private static int factorial(int number){
        if(number <= 1){
            return 1;
        }else {
            return number * factorial(number-1);
        }
    }
}