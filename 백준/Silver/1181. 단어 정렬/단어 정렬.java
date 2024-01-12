import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int testCase = Integer.parseInt(br.readLine());
        String[] arr = new String[testCase];
        
        for(int i = 0; i < testCase; i++){
            arr[i] = br.readLine();
        }

        Arrays.sort(arr, new Comparator<String>() {
           public int compare(String s1, String s2){
               if(s1.length() == s2.length()){
                   return s1.compareTo(s2);
               } else {
                   return s1.length() - s2.length();
               }
           } 
        });

        bw.write(arr[0]+"\n");
        for(int i = 1; i < testCase; i++){
            if(!arr[i-1].equals(arr[i]))
                bw.write(arr[i]+"\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }
}