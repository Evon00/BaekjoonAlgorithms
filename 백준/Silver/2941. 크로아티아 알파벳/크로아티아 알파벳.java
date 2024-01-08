import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String word = br.readLine();

        int index = 0;
        int count = word.length();
        
        for(int i = 0; i < word.length(); i++){
            if(word.charAt(i) == '-'){
                count--;
            }else if(word.charAt(i) == '='){
                if(word.charAt(i-1) == 'z'){
                    if((i-2 == -1))
                        count--;
                    else if(word.charAt(i-2) == 'd')
                        count -= 2;
                    else
                        count --;
                } else{
                    count--;
                }
            } else if(word.charAt(i) == 'j'){
                if(i-1 == -1){}
                else if(word.charAt(i-1) == 'l' || word.charAt(i-1) == 'n')
                    count--;
            }
        }

        bw.write(String.valueOf(count));
        
        br.close();
        bw.flush();
        bw.close();
    }
}