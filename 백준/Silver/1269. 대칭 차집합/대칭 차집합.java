import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine()," ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        HashSet<Integer> setA = new HashSet<>();
        HashSet<Integer> setB = new HashSet<>();

        st = new StringTokenizer(br.readLine()," ");
        for(int i = 0; i < n; i++)
            setA.add(Integer.parseInt(st.nextToken()));

        st = new StringTokenizer(br.readLine()," ");
        for(int i = 0; i < m; i++)
            setB.add(Integer.parseInt(st.nextToken()));

        Set<Integer> result1 = new HashSet<>(setA);
        result1.addAll(setB);

        Set<Integer> result2 = new HashSet<>(setA);
        result2.retainAll(setB);
        
        result1.removeAll(result2);
        
        bw.write(String.valueOf(result1.size()));
        
        br.close();
        bw.flush();
        bw.close();
    }
}