import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();
        StringTokenizer st;
        
        for(int i = 0; i < N; i++){
            int number = Integer.parseInt(br.readLine());
            if(number != 0)
                stack.push(number);
            else
                stack.pop();
        }

        int result = 0;
        
        for(int i = 0; i < stack.size(); i++){
            result += stack.get(i);
        }
        bw.write(String.valueOf(result));
        
        br.close();
        bw.flush();
        bw.close();
    }
}