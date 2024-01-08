import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException{
        int[] arr = new int[6];
        arr[0] = 1;
        arr[1] = 1;
        arr[2] = 2;
        arr[3] = 2;
        arr[4] = 2;
        arr[5] = 8;
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        for(int i = 0; i < 6; i++){
            bw.write(arr[i]-Integer.parseInt(st.nextToken())+" ");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}