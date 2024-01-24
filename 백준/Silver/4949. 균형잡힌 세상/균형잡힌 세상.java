import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while(true){
            String line = br.readLine();
            if(line.length() == 1 && line.charAt(0) == '.')
                break;
            else {
                String result = checkBalance(line);
                bw.write(result+"\n");
            }
        }
        
        br.close();
        bw.flush();
        bw.close();
    }

    private static String checkBalance(String line){
        Stack<Character> stack = new Stack<>();
                for(int i = 0; i < line.length(); i++){
                    char c = line.charAt(i);
                    if(c == '(' || c == '[')
                        stack.push(c);
                    else if(c == ')'){
                        if(stack.empty())
                            return "no";
                        else if(stack.peek() == '(')
                            stack.pop();
                        else
                            return "no";
                    } else if(c == ']'){
                        if(stack.empty())
                            return "no";
                        else if(stack.peek() == '[')
                            stack.pop();
                        else
                            return "no";
                    }
                }
                if(stack.empty())
                    return "yes";
                else
                    return "no";
    }
}