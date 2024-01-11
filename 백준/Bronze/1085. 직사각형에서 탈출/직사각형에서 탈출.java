import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        ArrayList<Integer> arr = new ArrayList<>();
        
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());

        arr.add(x);
        arr.add(y);
        arr.add(w-x);
        arr.add(h-y);
        Collections.sort(arr);
        
        bw.write(String.valueOf(arr.get(0)));
        
        br.close();
        bw.flush();
        bw.close();
    }
}