import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        long mult = 1;
        int[] arr = new int[10];

        for(int i = 0; i < 3; i++){
            int N = Integer.parseInt(br.readLine());
            mult *= N;
        }

        while(mult > 0){
            int count = (int) (mult % 10);
            arr[count]++;
            mult /= 10;
        }

        for(int i = 0; i < 10; i++){
            bw.write(String.valueOf(arr[i]));
            bw.write("\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }
}