import java.util.*;
import java.lang.*;
import java.io.*;

class Main {

    static int[][][] arr;
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        arr = new int[21][21][21];

        StringTokenizer st;

        while(true){
            st = new StringTokenizer(br.readLine());
            
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            if(a == -1 && b == -1 && c == -1) break;

            bw.write("w(" + a + ", " + b + ", " + c + ") = " + w(a, b, c) + "\n");

        }

        br.close();
        bw.flush();
        bw.close();

    }

    private static int w(int a, int b, int c){
        
        if (a <= 0 || b <= 0 || c <= 0) return 1;
        
        if (a > 20 || b > 20 || c > 20) return w(20, 20, 20);

        if (arr[a][b][c] != 0) return arr[a][b][c];

        if (a < b && b < c) {
            arr[a][b][c] = w(a, b, c - 1) + w(a, b - 1, c - 1) - w(a, b - 1, c);
        } else {
            arr[a][b][c] = w(a - 1, b, c) + w(a - 1, b - 1, c) + w(a - 1, b, c - 1) - w(a - 1, b - 1, c - 1);
        }

        return arr[a][b][c];
    }

}