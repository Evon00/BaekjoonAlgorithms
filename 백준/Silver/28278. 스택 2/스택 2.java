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
            st = new StringTokenizer(br.readLine()," ");
            int choice = Integer.parseInt(st.nextToken());
            if(choice == 1){
                stack.push(Integer.parseInt(st.nextToken()));
            } else if(choice == 2){
                if(stack.size() != 0)
                    bw.write(String.valueOf(stack.pop())+"\n");
                else
                    bw.write("-1"+"\n");
            } else if(choice == 3){
                bw.write(String.valueOf(stack.size())+"\n");
            } else if(choice == 4){
                if(stack.size() == 0)
                    bw.write("1"+"\n");
                else
                    bw.write("0"+"\n");
            } else{
                if(stack.size() == 0)
                    bw.write("-1"+"\n");
                else
                    bw.write(String.valueOf(stack.peek())+"\n");
            }
        }
        br.close();
        bw.flush();
        bw.close();
    }
}