import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        String N = st.nextToken();
        int B = Integer.parseInt(st.nextToken());
        int number = 0;
        int digit = 1;

        for(int i = N.length()-1; i >= 0; i--){
            char c = N.charAt(i);
            if('A' <= c && c <= 'Z'){
                number += (c - 'A' + 10) * digit;
            } else {
                number += (c - '0') * digit;
            }
            digit *= B;
        }
        bw.write(String.valueOf(number));
        br.close();
        bw.flush();
        bw.close();
    }
}