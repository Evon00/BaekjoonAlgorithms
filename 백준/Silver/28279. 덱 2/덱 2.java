import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        Deque<Integer> q = new LinkedList<>();

        StringTokenizer st;

        for(int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine()," ");
            int choice = Integer.parseInt(st.nextToken());

            if(choice == 1){
                q.offerFirst(Integer.parseInt(st.nextToken()));
            } else if(choice == 2){
                q.offer(Integer.parseInt(st.nextToken()));
            } else if(choice == 3){
                if(!q.isEmpty())
                    bw.write(String.valueOf(q.poll())+"\n");
                else
                    bw.write("-1"+"\n");
            } else if(choice == 4){
                if(!q.isEmpty())
                    bw.write(String.valueOf(q.pollLast())+"\n");
                else
                    bw.write("-1"+"\n");
            } else if(choice == 5){
                bw.write(String.valueOf(q.size())+"\n");
            } else if(choice == 6){
                if(!q.isEmpty())
                    bw.write("0"+"\n");
                else
                    bw.write("1"+"\n");
            } else if(choice == 7){
                if(!q.isEmpty())
                    bw.write(String.valueOf(q.peek())+"\n");
                else
                    bw.write("-1"+"\n");
            } else if(choice == 8){
                if(!q.isEmpty())
                    bw.write(String.valueOf(q.peekLast())+"\n");
                else
                    bw.write("-1"+"\n");
            }
        }

        br.close();
        bw.flush();
        bw.close();
    }
}