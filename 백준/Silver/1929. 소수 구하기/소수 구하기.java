import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        int number = M;
        
        for(int i = M; i <= N; i++){
            if(isPrime(i))
                bw.write(String.valueOf(i)+"\n");
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