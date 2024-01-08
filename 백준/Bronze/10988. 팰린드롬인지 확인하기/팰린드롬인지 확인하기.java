import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String word = br.readLine();
        int j = word.length() - 1;
        
        for(int i = 0; i < word.length(); i++){
            if(word.charAt(i) != word.charAt(j)){
                bw.write("0");
                break;
            }
            if(i >= j){
                bw.write("1");
                break;
            }
            j--;
        }
        
        br.close();
        bw.flush();
        bw.close();
    }
}