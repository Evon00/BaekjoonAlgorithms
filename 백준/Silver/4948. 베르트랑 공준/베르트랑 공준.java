import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        while(true){
            int count = 0;
            
            int n = Integer.parseInt(br.readLine());
            
            if(n == 0)
                break;
            
            for(int i = n+1; i <= 2*n; i++){
                if(isPrime(i))
                    count++;
                    
            }

            bw.write(String.valueOf(count)+"\n");
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