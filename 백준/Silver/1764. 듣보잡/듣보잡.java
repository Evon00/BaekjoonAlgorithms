import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        Set<String> isHeard = new HashSet<>();
        ArrayList<String> result = new ArrayList<>();
        
        for(int i = 0; i < N; i++){
            isHeard.add(br.readLine());
        }
        
        for(int i = 0; i < M; i++){
            String line = br.readLine();
            if(isHeard.contains(line))
                result.add(line);
        }

        bw.write(String.valueOf(result.size())+"\n");

        Collections.sort(result);
        
        for(int i = 0; i < result.size(); i++)
            bw.write(result.get(i)+"\n");
        
        br.close();
        bw.flush();
        bw.close();
    }
}