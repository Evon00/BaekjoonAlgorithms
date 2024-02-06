import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        bw.write(String.valueOf(factorial(N)));

        br.close();
        bw.flush();
        bw.close();
        
    }
    private static long factorial(int n){
        if(n <= 0)
            return 1;
        else
            return factorial(n-1) * n;
    }
}