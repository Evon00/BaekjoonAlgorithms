import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while(true){
            String line = br.readLine();
            if(line != null){
                bw.write(line+"\n");
            }else{
                break;
            }
        }
        br.close();
        bw.flush();
        bw.close();
    }
}