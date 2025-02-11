import java.util.*;
import java.lang.*;
import java.io.*;

class Main {

    static int[] f;
    static int counterA;
    static int counterB;
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        f = new int[n+1];

        counterA = 0;
        counterB = 0;

        fib(n);
        fibonacci(n);

        br.close();
        System.out.println(counterA + " " + counterB);

    }
    
    private static int fib(int n){
        if(n == 1 || n == 2) {
            counterA++;
            return 1;
        }
        else return (fib(n-1) + fib(n-2));
    }

    private static int fibonacci(int n){
        f[0] = 1;
        f[1] = 1;
        for(int i = 2; i < n; i++){
            counterB++;
            f[i] = f[i-1] +f[i-2];
        }
        return f[n];
    }
}