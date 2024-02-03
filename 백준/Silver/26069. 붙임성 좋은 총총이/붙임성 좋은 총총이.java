import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        HashSet<String> set = new HashSet<>();
        StringTokenizer st;

        for(int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine()," ");
            String person1 = st.nextToken();
            String person2 = st.nextToken();

            if(set.contains(person1) || set.contains(person2)){
                set.add(person1);
                set.add(person2);
            }

            if(person1.equals("ChongChong") || person2.equals("ChongChong")){
                set.add(person1);
                set.add(person2);
            }
        }

        bw.write(String.valueOf(set.size()));
        
        br.close();
        bw.flush();
        bw.close();
    }
}