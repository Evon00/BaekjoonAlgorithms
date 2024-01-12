import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int[] arr = new int[8];
        boolean ascending = true;
        boolean descending = true;

        for(int i = 0; i < 8; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for(int i = 0; i < 8; i++){
            if(arr[i] != i+1){
                ascending = false;
                break;
            }
        }
        for(int i = 0; i < 8; i++){
            if(arr[i] != 8-i){
                descending =false;   
                break;
            }
        }

        if(ascending)
            bw.write("ascending");
        else if(descending)
            bw.write("descending");
        else
            bw.write("mixed");

        br.close();
        bw.flush();
        bw.close();
    }
}