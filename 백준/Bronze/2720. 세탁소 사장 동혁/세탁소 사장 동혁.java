import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int T = Integer.parseInt(br.readLine());
        int[] changes = new int[4];
        changes[0] = 25;
        changes[1] = 10;
        changes[2] = 5;
        changes[3] = 1;

        for(int i = 0; i < T; i++){
            int money = Integer.parseInt(br.readLine());
            for(int j = 0; j < 4; j++){
                bw.write(money / changes[j]+" ");
                money %= changes[j];
            }
            bw.write("\n");
        }
        
        br.close();
        bw.flush();
        bw.close();
    }
}