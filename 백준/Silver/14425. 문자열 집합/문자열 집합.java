import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        HashSet<String> set = new HashSet<>();
        int count = 0;

        for(int i = 0; i < N; i++){
            set.add(br.readLine());
        }
        for(int i = 0; i < M; i++){
            String line = br.readLine();
            if(set.contains(line))
                count++;
        }

        bw.write(String.valueOf(count));
        
        br.close();
        bw.flush();
        bw.close();
    }
}