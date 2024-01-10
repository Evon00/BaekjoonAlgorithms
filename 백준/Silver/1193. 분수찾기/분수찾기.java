import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int X = Integer.parseInt(br.readLine());

        int crossCount = 1;
        int prevCount = 0;
        
        while(true){
            if(X <= prevCount + crossCount){
                if(crossCount % 2 == 1){
                    bw.write((crossCount - (X - prevCount - 1)) + "/"+(X-prevCount));
                    break;
                } else{
                    bw.write((X-prevCount) + "/" + (crossCount - (X-prevCount - 1)));
                    break;
                }
            } else{
                prevCount += crossCount;
                crossCount++;
            }
        }
        
        br.close();
        bw.flush();
        bw.close();
    }
}