import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String word = br.readLine().toUpperCase();
        
        int[] count = new int[26];

        for(int i = 0; i < word.length(); i++){
            count[word.charAt(i) - 65]++;
        }

        int max = 0;
        char maxChar = 'A';
        boolean isDuplicate = false;

        for(int i = 0; i < 26; i++){
            if(count[i] > max){
                max = count[i];
                maxChar = (char) ('A' + i);
                isDuplicate = false;
            } else if(count[i] == max){
                isDuplicate = true;
            }
        }

        if(isDuplicate)
            bw.write("?");
        else
            bw.write(maxChar);
        
        br.close();
        bw.flush();
        bw.close();
    }
}