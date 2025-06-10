import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    static int N;
    static int[] alphabet = new int[26];
    static int[] check;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        int result = 0;

        String word = br.readLine();
        for(int i = 0; i < word.length(); i++){
            int idx = word.charAt(i) - 'A';
            alphabet[idx]++;
        }

        for(int i = 0; i < N - 1; i++){
            check = alphabet.clone();
            String checkWord = br.readLine();

            //길이 차이가 1이 넘으면 비슷한 단어가 아님
            if(Math.abs(checkWord.length() - word.length()) > 1) continue;

            int cnt = 0;

            for(int j = 0 ; j < checkWord.length(); j++){
                int idx = checkWord.charAt(j) - 'A';
                if(check[idx] > 0){
                    cnt++;
                    check[idx]--;
                }
            }

            if(word.length()-1 == checkWord.length()){
                if(cnt == checkWord.length()) result++;
            }
            else if(word.length()+1 == checkWord.length()){
                if(cnt == word.length()) result++;
            } else if(word.length() == checkWord.length()){
                if(cnt == word.length()) result++;
                else if(cnt == word.length()-1) result++;
            }
        }
        System.out.print(result);
    }
}