import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String password;
        
        while(true){
            password = br.readLine();
            if(password.equals("end")) break;

            if(isAcceptable(password)){
                bw.write("<"+password+"> is acceptable.\n");
            } else {
                bw.write("<"+password+"> is not acceptable.\n");
            }
        }
            
        br.close();
        bw.flush();
        bw.close();
    }

    public static boolean isAcceptable(String password){
        boolean hasVowel = false;
        int vowelCount = 0, consonantCount = 0;
        char prev = ' ';

        for(int i = 0; i < password.length(); i++){
            char c = password.charAt(i);
            boolean isVowel = "aeiou".indexOf(c) >= 0;

            if(isVowel){ //자음 모음 연속 3개가 안되어야한다.
                hasVowel = true;
                vowelCount++;
                consonantCount = 0;
            } else {
                consonantCount++;
                vowelCount = 0;
            }

            if(vowelCount >= 3 || consonantCount >= 3) {
                return false;
            }

            if(c == prev && !(c =='e' || c == 'o')){
                return false;
            }

            prev = c;
        }

        return hasVowel;
    }
}