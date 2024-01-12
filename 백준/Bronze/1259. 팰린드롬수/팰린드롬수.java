import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while(true){
            String line = br.readLine();
            
            if(line == null || line.equals("0"))
                break;

            int i = 0;
            int j = line.length()-1;
            boolean isPalindrome = true;
            while(i <= j){
                if(line.charAt(i) != line.charAt(j)){
                    isPalindrome = false;
                    break;
                }
                i++;
                j--;
            }
            if(isPalindrome)
                bw.write("yes"+"\n");
            else
                bw.write("no"+"\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }
}