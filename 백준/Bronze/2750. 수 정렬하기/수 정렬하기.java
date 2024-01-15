import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];

        for(int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        for(int i = 0; i < N; i++){
            int min = arr[i];
            int index = 0;
            for(int j = i+1; j < N; j++){
                if(min > arr[j]){
                    min = arr[j];
                    index = j;
                }
            }
            int temp = arr[i];
            arr[i] = min;
            arr[index] = temp;
            bw.write(String.valueOf(arr[i])+"\n");
        }
        
        br.close();
        bw.flush();
        bw.close();
    }
}