import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int testCase = Integer.parseInt(br.readLine());
        StringTokenizer st;
        int count = 0;
        
        st = new StringTokenizer(br.readLine()," ");
        for(int i = 0; i < testCase; i++){
            int number = Integer.parseInt(st.nextToken());
            if(isPrime(number))
                count++;   
        }
        
        bw.write(String.valueOf(count));

        br.close();
        bw.flush();
        bw.close();
    }
    public static boolean isPrime(int num){
        if(num < 2) return false;
        for(int i = 2; i * i <= num; i++){
            if(num % i == 0) return false;
        }
        return true;
    }
}