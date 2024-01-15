import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String N = br.readLine();
        char[] arr = new char[N.length()];

        for(int i = 0; i < N.length(); i++){
            arr[i] = N.charAt(i);
        }

        Arrays.sort(arr);

        for(int i = N.length()-1; i >= 0; i--)
            bw.write(arr[i]);
        
        br.close();
        bw.flush();
        bw.close();
    }
}