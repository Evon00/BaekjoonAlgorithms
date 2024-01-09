import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[][] matrix = new int[9][9];
        StringTokenizer st;
        int maxValue = 0;
        int maxI = 0;
        int maxJ = 0;

        for(int i = 0; i < 9; i++){
            st = new StringTokenizer(br.readLine()," ");
            for(int j = 0; j < 9; j++){
                matrix[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        maxValue = matrix[0][0];
    
        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 9; j++){
                if(maxValue <= matrix[i][j]){
                    maxValue = matrix[i][j];
                    maxI = i+1;
                    maxJ = j+1;
                }
            }
        }
        bw.write(maxValue+"\n");
        bw.write(maxI+" "+maxJ);
        
        br.close();
        bw.flush();
        bw.close();
    }
}