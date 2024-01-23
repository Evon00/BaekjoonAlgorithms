import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        boolean[] primeArr = new boolean[1000001];
        primeArr[0] = primeArr[1] = true;
        
        for(int i = 2; i*i <= 1000000; i++){
            if(!primeArr[i]){
                for(int j = i + i; j <= 1000000; j+= i)
                    primeArr[j] = true;
            }
        }

        for(int i = 0; i < n; i++){
            int number = Integer.parseInt(br.readLine());
            int answer = 0;
            for(int j = 2; j <= number/2; j++){
                if(!primeArr[j] && !primeArr[number-j]) answer++;
            }
            bw.write(String.valueOf(answer)+"\n");
        }
        
        br.close();
        bw.flush();
        bw.close();
    }
    private static boolean isPrime(int number){
        if(number < 2){
            return false;
        }
        for(int i = 2; i <= Math.sqrt(number); i++){
            if(number % i == 0)
                return false;
        }
        return true;
    }
}