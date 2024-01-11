import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int M = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());
        ArrayList<Integer> primeList = new ArrayList<>();
        int sum = 0;

        for(int i = M; i <= N; i++){
            if(isPrime(i))
                primeList.add(i);
        }
        
        for(int i = 0; i < primeList.size(); i++){
            sum += primeList.get(i);
        }

        if(sum == 0)
            bw.write("-1");
        else{
            bw.write(String.valueOf(sum)+"\n");
            bw.write(String.valueOf(primeList.get(0)));
        }
        
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