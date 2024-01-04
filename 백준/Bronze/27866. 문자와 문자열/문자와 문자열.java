import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String word = br.readLine();
        int i = Integer.parseInt(br.readLine());

        bw.write(word.charAt(i-1));
        br.close();
        bw.flush();
        bw.close();
    }
}