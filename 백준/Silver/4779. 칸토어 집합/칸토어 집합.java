import java.util.*;
import java.io.*;

class Main {
    static char[] arr;
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while(true){
            String line = br.readLine();
            
            if(line == null)
                break;

            int N =Integer.parseInt(line);
            
            int length = (int) Math.pow(3,N);
            arr = new char[length];
            
            for(int i = 0; i < length; i++) arr[i] = '-';
            
            cantor(0,length);
            
            for(int i = 0; i < length; i++) bw.write(arr[i]);
            bw.write("\n");
        }
        
        br.close();
        bw.flush();
        bw.close();
    }
    private static void cantor(int start, int len){
        if(len == 1)
            return;
        int newLen = len / 3;
        for(int i = start+newLen; i < start+ 2*newLen; i++)
            arr[i] = ' ';
        cantor(start,newLen);
        cantor(start+2*newLen,newLen);
    }
}