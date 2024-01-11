import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] x = new int[3];
        int[] y = new int[3];

        for(int i = 0; i < 3; i++){
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            x[i] = Integer.parseInt(st.nextToken());
            y[i] = Integer.parseInt(st.nextToken());
        }

        int newX,newY;
        
        if (x[0] == x[1]) {
            newX = x[2];
        } else if (x[0] == x[2]) {
            newX = x[1];
        } else {
            newX = x[0];
        }

        if (y[0] == y[1]) {
            newY = y[2];
        } else if (y[0] == y[2]) {
            newY = y[1];
        } else {
            newY = y[0];
        }
        
        bw.write(String.valueOf(newX)+" "+String.valueOf(newY));
        br.close();
        bw.flush();
        bw.close();
    }
}