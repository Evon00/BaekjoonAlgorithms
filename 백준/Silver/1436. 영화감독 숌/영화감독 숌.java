import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        int num = 666;
        int count = 1;
        while(count != N){
            num++;
            if(String.valueOf(num).contains("666"))
                count++;
        }
        bw.write(String.valueOf(num));

        br.close();
        bw.flush();
        bw.close();
    }
}