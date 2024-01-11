import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());
        int sum = A+B+C;

        if(A == 60 && B == 60 && C == 60){
            bw.write("Equilateral");
        } else if(sum == 180){
            if(A == B || A == C || B == C)
                bw.write("Isosceles");
            else
                bw.write("Scalene");
        } else {
            bw.write("Error");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}