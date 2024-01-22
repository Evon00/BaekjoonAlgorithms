import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];

        for(int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        int first = 0;
        
        for(int i = 0; i < N-1; i++){
            int distance  = arr[i+1] - arr[i];
            first = euclid(distance,first);
        }

        bw.write(String.valueOf((arr[N-1] - arr[0])/first+1 - N));
        
        br.close();
        bw.flush();
        bw.close();
    }
    public static int euclid(int a, int b){
        if(b == 0) return a;
        return euclid(b,a%b);
    }
}