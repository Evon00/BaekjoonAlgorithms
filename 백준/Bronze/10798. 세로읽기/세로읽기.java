import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        char[][] arr = new char[5][15];
        StringTokenizer st;
        int index = 0;

        for(int i = 0; i < 5; i++){
            String line = br.readLine();
            if(line != null){
                for(int j = 0; j < line.length(); j++){
                    arr[i][j] = line.charAt(j);
                }
            }
        }

        for(int j = 0; j < 15; j++){
            for(int i = 0; i < 5; i++){
                if(arr[i][j] == '\0')
                    continue;
                bw.write(String.valueOf(arr[i][j]));
            }
        }
        
        br.close();
        bw.flush();
        bw.close();
    }
}