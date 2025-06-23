import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String text = br.readLine();
        int M = Integer.parseInt(br.readLine());

        Stack<Character> left = new Stack<>();
        Stack<Character> right = new Stack<>();

        for(char c : text.toCharArray()){
            left.push(c);
        }

        for (int i = 0; i < M; i++){
            String command = br.readLine();

            switch(command.charAt(0)){
                case 'L':
                    if(!left.isEmpty()){
                        right.push(left.pop());
                    }
                    break;
                case 'D':
                    if(!right.isEmpty()){
                        left.push(right.pop());
                    }
                    break;
                case 'B':
                    if(!left.isEmpty()){
                        left.pop();
                    }
                    break;
                case 'P':
                    char x = command.charAt(2);
                    left.push(x);
                    break;
            }
        }

        while(!left.isEmpty()){
            right.push(left.pop());
        }

        while(!right.isEmpty()){
            bw.write(right.pop());
        }

        bw.flush();
        bw.close();
        br.close();
    }
}