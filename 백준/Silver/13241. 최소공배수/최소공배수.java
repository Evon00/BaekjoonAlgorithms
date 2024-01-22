import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st;
        
        st = new StringTokenizer(br.readLine()," ");
        long A = Long.parseLong(st.nextToken());
        long B = Long.parseLong(st.nextToken());
        long euclidResult = euclid(A,B);
        bw.write(String.valueOf(A*B/euclidResult));
        
        br.close();
        bw.flush();
        bw.close();
    }
    public static long euclid(long a, long b){
        if(b == 0) return a;
        return euclid(b,a%b);
    }
}