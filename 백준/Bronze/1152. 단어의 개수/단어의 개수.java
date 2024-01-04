import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int wordCount = 0;
        
        while(st.hasMoreTokens()){
            String word = st.nextToken();
            if(word != null){
                wordCount++;
            } else {
                break;
            }
        }

        bw.write(String.valueOf(wordCount));
        br.close();
        bw.flush();
        bw.close();
    }
}