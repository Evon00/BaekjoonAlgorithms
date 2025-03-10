import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        HashSet<Integer> set = new HashSet<>();
        StringTokenizer st;

        int m = Integer.parseInt(br.readLine());

        
        for(int i = 0; i < m; i++){
            st = new StringTokenizer(br.readLine());
            String command = st.nextToken();

            if(command.equals("all")){
                set = new HashSet<>();
                for(int j = 1; j <= 20; j++){
                    set.add(j);
                }
            }else if(command.equals("empty")){
                set = new HashSet<>();
            } else {
                int x = Integer.parseInt(st.nextToken());
                if(command.equals("add")){
                set.add(x);
                }

            if(command.equals("remove")){
                set.remove(x);
                }
            
            if(command.equals("check")){
                if(set.contains(x)) bw.write(1+"\n");
                else bw.write(0+"\n");
                }

            if(command.equals("toggle")){
                if(set.contains(x)) set.remove(x);
                else set.add(x);
                }
            }

        }
        br.close();
        bw.flush();
        bw.close();

    }
}