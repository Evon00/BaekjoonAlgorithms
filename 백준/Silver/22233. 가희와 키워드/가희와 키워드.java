import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Set<String> wordSet = new HashSet<>();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        for(int i = 0; i < N; i++){
            wordSet.add(br.readLine());
        }

        for(int i = 0; i < M; i++){
            st = new StringTokenizer(br.readLine(),",");
            while(st.hasMoreTokens()){
                String word = st.nextToken();
                if(wordSet.contains(word)){
                    wordSet.remove(word);
                }
            }
            System.out.println(wordSet.size());
        }

        br.close();
    }
}