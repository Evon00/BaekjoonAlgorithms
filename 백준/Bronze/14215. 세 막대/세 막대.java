import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        int max = 0;
        if(a>b){
            if(b>c) max = a;
            else max = (a>c) ? a : c;
        }
        else max = (b>c) ? b : c;

        if(a+b+c-max > max) bw.write(String.valueOf(a+b+c));
        else bw.write(String.valueOf((a+b+c-max)*2-1));
        
        br.close();
        bw.flush();
        bw.close();
    }
}