import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = 9;
        int[] num = new int[9];
        
        for(int i = 0; i < N; i++){
            num[i] = Integer.parseInt(br.readLine());
        }

        int max = num[0];
        int index = 0;
        
        for(int i = 1; i < N; i++){
            if(max <= num[i]){
                max = num[i];
                index = i;
            }
        }
        bw.write(max+"\n");
        bw.write(index+1+"\n");
        
        br.close();
        bw.flush();
        bw.close();
        
    }
}