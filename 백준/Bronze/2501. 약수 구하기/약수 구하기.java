import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        ArrayList<Integer> arr = new ArrayList<>();

        for(int i = 1; i <= N; i++){
            if(N % i == 0)
                arr.add(i);
        }
        if(arr.size() < K)
            bw.write("0");
        else
            bw.write(String.valueOf(arr.get(K-1)));

        br.close();
        bw.flush();
        bw.close();
    }
}