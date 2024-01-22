import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st;
        
        st = new StringTokenizer(br.readLine()," ");
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine()," ");
        int C = Integer.parseInt(st.nextToken());
        int D = Integer.parseInt(st.nextToken());

        int result1 = A*D + B*C;
        int result2 = B*D;

        int eculidResult = euclid(result1,result2);

        result1 /= eculidResult;
        result2 /= eculidResult;
        
        bw.write(String.valueOf(result1)+" "+String.valueOf(result2));
        
        br.close();
        bw.flush();
        bw.close();
    }
    public static int euclid(int a, int b){
        if(b == 0) return a;
        return euclid(b,a%b);
    }
}