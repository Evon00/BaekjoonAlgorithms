import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int testCase = Integer.parseInt(br.readLine());

        for(int i = 0; i < testCase; i++){
            int sum = 0;
            int score = 1;
            String test = br.readLine();
            for(int j = 0; j < test.length(); j++){
                if(test.charAt(j) == 'O'){
                    sum += score;
                    score++;
                } else {
                    score = 1;
                }
            }
            bw.write(String.valueOf(sum));
            bw.write("\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }
}