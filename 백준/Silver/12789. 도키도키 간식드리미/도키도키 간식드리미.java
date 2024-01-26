import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();
        int[] students = new int[N];
        
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int count = 1;

        for(int i = 0; i < N; i++){
            students[i] = Integer.parseInt(st.nextToken());
        }

        for(int i = 0; i < N; i++){
            if(students[i] != count){
                if(!stack.isEmpty() && stack.peek() == count){
                    stack.pop();
                    i--;
                    count++;
                } else {
                    stack.push(students[i]);
                }
            } else {
                count++;
            }
        }
        
        String result = checkRow(stack,count);
        bw.write(result+"\n");

        br.close();
        bw.flush();
        bw.close();
    }
    private static String checkRow(Stack<Integer> stack, int count){
        while(!stack.empty()){
            int number = stack.pop();
            if(number == count)
                count++;
            else
                return "Sad";
        }
        return "Nice";
    }
}