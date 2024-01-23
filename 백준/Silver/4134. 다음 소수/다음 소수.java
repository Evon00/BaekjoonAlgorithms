import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        for(int i = 0; i < n; i++){
            long number = Long.parseLong(br.readLine());

            if(number == 0 || number == 1 || number == 2){
                bw.write("2"+"\n");
                continue;
            }
            
            while(true){
                int result = 0;
                for(int j = 2; j <= Math.sqrt(number); j++){
                    if(number % j == 0){
                        result++;
                        break;
                    }
                }
                if(result == 0){
                    bw.write(String.valueOf(number)+"\n");
                    break;
                }
                number++;
            }
        }
        br.close();
        bw.flush();
        bw.close();
    }
}