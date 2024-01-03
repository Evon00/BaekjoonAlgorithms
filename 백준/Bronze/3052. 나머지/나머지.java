import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int index = 10;
        Set<Integer> remain = new HashSet<>();

        for(int i = 0; i < index; i++){
            String line = br.readLine();
            if(line != null){
                int num = Integer.parseInt(line);
                remain.add(num%42);
            }
        }
        bw.write(remain.size()+"\n");
        br.close();
        bw.flush();
        bw.close();
        
    }
}