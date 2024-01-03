import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int studentCount = 30;

        boolean[] students = new boolean[studentCount];

        for(int i = 0; i < studentCount; i++){
            String line = br.readLine();
            if(line != null){
                int submitStudent = Integer.parseInt(line);
                students[submitStudent-1] = true;   
            }
        }

        for(int i = 0; i < studentCount; i++){
            if(students[i] == false)
                bw.write(i+1+"\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}