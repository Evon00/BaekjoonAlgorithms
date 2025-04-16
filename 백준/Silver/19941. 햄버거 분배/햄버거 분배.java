import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        char[] arr = new char[n];
        boolean[] hArr = new boolean[n];

        String line = br.readLine();
        for(int i = 0; i < n; i++){
            char c = line.charAt(i);
            arr[i] = c;
            if(c == 'H') hArr[i] = true;
            else hArr[i] = false;
        }

        int counter = 0;
        
        for(int i = 0; i < n; i++){
            if(arr[i] == 'P'){
                int index = i - k;
                    for(int j = index; j <= i+k; j++){
                        if(j >= 0 && j < n && hArr[j]){
                            hArr[j] = false;
                            counter++;
                            break;
                        }
                    }
            }
        }

        System.out.print(counter);
    }
}