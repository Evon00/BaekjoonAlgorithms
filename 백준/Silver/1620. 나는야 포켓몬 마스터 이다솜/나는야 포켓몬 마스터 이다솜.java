import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        HashMap<String, Integer> stringMap = new HashMap<>();
        HashMap<Integer,String> numberMap = new HashMap<>();

        for(int i = 0; i < n; i++){
            String line = br.readLine();
            stringMap.put(line,i+1);
            numberMap.put(i+1,line);
        }

        for(int i = 0; i < m; i++){
            String line = br.readLine();
            if(Character.isDigit(line.charAt(0))){
                int number = Integer.parseInt(line);
                bw.write(numberMap.get(number)+"\n");
            } else {
                bw.write(stringMap.get(line)+"\n");
            }
        }
        
        br.close();
        bw.flush();
        bw.close();
    }
}