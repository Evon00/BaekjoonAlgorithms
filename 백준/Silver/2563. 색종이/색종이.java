import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        boolean[][] arr = new boolean[100][100];
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st;
        
        for(int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine()," ");
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            for(int j = x; j < x + 10; j++){
                for(int k = y; k < y + 10; k++){
                    arr[j][k] = true;
                }
            }
        }

        int black = 0;

        for(int i = 0; i < 100; i++){
            for(int j = 0; j < 100; j++){
                if(arr[i][j])
                    black++;
            }
        }
        bw.write(String.valueOf(black));
        
        br.close();
        bw.flush();
        bw.close();
    }
}