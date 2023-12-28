import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        int number = Integer.parseInt(br.readLine());

        for(int i = 1; i <= number; i++){
            for(int j = i; j < number; j++){
                bw.write(" ");
            }
            for(int k = 0; k < i; k++){
                bw.write("*");
            }
            bw.write("\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}