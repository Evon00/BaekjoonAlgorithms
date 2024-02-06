import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        bw.write(String.valueOf(fibo(N)));
        
        br.close();
        bw.flush();
        bw.close();
        
    }
    private static int fibo(int n){
        if(n == 0) return 0;
        if(n == 1) return 1;

        return fibo(n-1) + fibo(n-2);
    }
}