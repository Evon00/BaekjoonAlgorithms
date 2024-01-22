import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;
        
        for(int i = 0; i < T; i++){
            st = new StringTokenizer(br.readLine()," ");
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            int euclidResult = euclid(A,B);
            bw.write(String.valueOf(A*B/euclidResult)+"\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }
    public static int euclid(int a, int b){
        if(b == 0) return a;
        return euclid(b,a%b);
    }
}