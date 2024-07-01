import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int H = Integer.parseInt(st.nextToken());
        int W = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int counter = 0;

        int col = 0;
        int row = 0;

        if((H % (N+1)) == 0){
            col = H / (N+1);
        } else {
            col = H / (N+1) + 1;
        }

        if((W % (M+1)) == 0){
            row = W / (M+1);
        } else {
            row = W / (M+1) + 1;
        }

        counter = col * row;

        bw.write(counter+"");
        
        br.close();
        bw.flush();
        bw.close();
    }
}