import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        int number = factorial(N);
        
        bw.write(String.valueOf(number));
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