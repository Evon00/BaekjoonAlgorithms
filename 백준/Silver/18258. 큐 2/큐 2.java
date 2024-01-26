import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st;
        Deque<Integer> queue = new ArrayDeque<>();

        for(int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine()," ");
            String command = st.nextToken();
            
            int number;
            
            if(command.equals("push")){
                number = Integer.parseInt(st.nextToken());
                queue.offer(number);
            } else if(command.equals("pop")){
                Integer temp = queue.poll();
                if(temp == null)
                    bw.write("-1"+"\n");
                else
                    bw.write(String.valueOf(temp)+"\n");
            } else if(command.equals("size")){
                bw.write(queue.size()+"\n");
            } else if(command.equals("empty")){
                if(queue.isEmpty())
                    bw.write("1"+"\n");
                else
                    bw.write("0"+"\n");
            } else if(command.equals("front")){
                Integer temp = queue.peek();
                if(temp == null)
                    bw.write("-1"+"\n");
                else
                    bw.write(String.valueOf(temp)+"\n");
                
            } else if(command.equals("back")){
                Integer temp = queue.peekLast();
                if(temp == null)
                    bw.write("-1"+"\n");
                else
                    bw.write(String.valueOf(temp)+"\n");
            }
        }

        br.close();
        bw.flush();
        bw.close();
    }
}