import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while(true){

            StringTokenizer st = new StringTokenizer(br.readLine()," ");

            int first = Integer.parseInt(st.nextToken());
            int second = Integer.parseInt(st.nextToken());
            
            if(first == 0 && second == 0){
                break;
            } else {
                if(first < second){
                    if(second % first != 0)
                        bw.write("neither");
                    else
                        bw.write("factor");
                } else {
                    if(first % second != 0)
                        bw.write("neither");
                    else
                        bw.write("multiple");
                }   
            }
            bw.write("\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }
}