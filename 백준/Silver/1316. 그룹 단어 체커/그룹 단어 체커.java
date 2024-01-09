import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int groupWordCount = 0;

        for (int i = 0; i < N; i++) {
            String word = br.readLine();

            if (isGroupWord(word)) {
                groupWordCount++;
            }
        }

        bw.write(String.valueOf(groupWordCount));
        br.close();
        bw.flush();
        bw.close();
    }

    private static boolean isGroupWord(String word) {
        boolean[] visited = new boolean[26];

        for (int i = 0; i < word.length(); i++) {
            char currentChar = word.charAt(i);

            if (visited[currentChar - 'a'] && word.charAt(i - 1) != currentChar) {
                return false;
            }

            visited[currentChar - 'a'] = true;
        }

        return true;
    }
}