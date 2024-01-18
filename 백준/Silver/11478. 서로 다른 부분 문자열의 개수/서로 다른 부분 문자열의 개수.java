import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Set<String> set = new HashSet<>();
        String line = br.readLine();

        for(int i = 0; i < line.length(); i++){
            for(int j = i+1; j <= line.length(); j++){
                set.add(line.substring(i,j));
            }
        }

        bw.write(String.valueOf(set.size()));
        
        br.close();
        bw.flush();
        bw.close();
    }
}