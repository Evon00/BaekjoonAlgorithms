import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        HashSet<String> set = new HashSet<>();
        int result = 0;

        for(int i = 0; i < N; i++){
            String line = br.readLine();
            if(line.equals("ENTER")){
                result += set.size();
                set = new HashSet<>();
            } else {
                set.add(line);
            }
        }
        result += set.size();

        bw.write(String.valueOf(result));

        br.close();
        bw.flush();
        bw.close();
    }
}