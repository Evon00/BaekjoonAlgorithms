import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st;
        TreeSet<String> set = new TreeSet<>(Collections.reverseOrder());

        for(int i = 0; i < n; i++){
            st = new StringTokenizer(br.readLine());
            String person = st.nextToken();
            String isEnter = st.nextToken();
            
            if(isEnter.equals("enter")){
                set.add(person);
            }else {
                if(set.contains(person)) set.remove(person);
            }
        }

        for(String person : set)
            bw.write(person+"\n");
        
        br.close();
        bw.flush();
        bw.close();
    }
}