import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        ArrayList<Integer> reversed = new ArrayList<>(); 
        
        while(st.hasMoreTokens()){
            int number = Integer.parseInt(st.nextToken());
            int reverseNum = 0;
            while(number > 0){
                reverseNum = reverseNum * 10 + number % 10;
                number /= 10;
            }
            reversed.add(reverseNum);
        }

        int reversedA = reversed.get(0);
        int reversedB = reversed.get(1);
        
        if(reversedA > reversedB)
            bw.write(String.valueOf(reversedA));
        else
            bw.write(String.valueOf(reversedB));

        br.close();
        bw.flush();
        bw.close();
        
    }
}