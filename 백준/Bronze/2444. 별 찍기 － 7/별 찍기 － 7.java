import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        for(int i = 1; i <= N; i++){
            for(int j = 1; j <= N-i; j++){
                bw.write(" ");
            }
            for(int k = 1; k <= 2*i-1; k++){
                bw.write("*");
            }
            bw.write("\n");
        }
        for(int i = N-1; i > 0; i--){
            for(int j = 1; j <= N-i; j++){
                bw.write(" ");
            }
            for(int k = 1; k <=2*i-1; k++){
                bw.write("*");
            }
            bw.write("\n");
        }
        
        br.close();
        bw.flush();
        bw.close();
    }
}