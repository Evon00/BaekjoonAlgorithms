import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int testCase = Integer.parseInt(br.readLine());

        for(int i = 0; i < testCase; i++){
            int floor = 0;
            int room = 0;
            int result = 0;
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            int H = Integer.parseInt(st.nextToken());
            int W = Integer.parseInt(st.nextToken());
            int N = Integer.parseInt(st.nextToken());
            floor = N % H == 0 ? H : N % H;
            room = (N - 1) / H +1;
            result = floor * 100 + room;
            bw.write(String.valueOf(result));
            bw.write("\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }
}