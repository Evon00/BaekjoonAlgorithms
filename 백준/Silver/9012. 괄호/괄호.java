import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        
        for(int i = 0; i < T; i++){
            String line = br.readLine();
            
            String result = checkVPS(line);
            bw.write(result+"\n");
        }
        
        br.close();
        bw.flush();
        bw.close();
    }

    private static String checkVPS(String line){
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < line.length(); i++){
            if(line.charAt(i) == '(')
                stack.push('(');
            else if(stack.empty())
                return "NO";
            else
                stack.pop();
        }
        if(stack.empty())
            return "YES";
        else
            return "NO";
    }
}