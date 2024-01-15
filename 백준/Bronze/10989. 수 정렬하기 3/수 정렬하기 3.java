import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        int[] count = new int[10001];
        int[] sortArr = new int[N];

        for(int i = 0; i < N; i++)
            arr[i] = Integer.parseInt(br.readLine());

        for(int i = 0; i < N; i++)
            count[arr[i]]++;
        
        for(int i = 1; i < 10001; i++)
            count[i] += count[i-1];

        for(int i = N-1; i >= 0; i--){
            int value = arr[i];
            count[value]--;
            sortArr[count[value]] = value;
        }

        for(int i = 0; i < N; i++){
            bw.write(String.valueOf(sortArr[i])+"\n");
        }
        
        br.close();
        bw.flush();
        bw.close();
    }

    private static void swap(int[] arr, int a, int b){
        int temp;
        temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}