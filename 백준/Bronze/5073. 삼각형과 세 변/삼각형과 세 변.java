import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        while(true){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            int C = Integer.parseInt(st.nextToken());
            if(A == 0 && B == 0 && C == 0){
                break;
            } else{
                int max = Math.max(Math.max(A,B),C);
                int sum = A+B+C - max;
                if(sum > max){
                    if(A == B && B == C)
                        bw.write("Equilateral");
                    else if(A == B || B == C || A == C)
                        bw.write("Isosceles");
                    else
                        bw.write("Scalene");
                }else{
                    bw.write("Invalid");
                }
            }
            bw.write("\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}