import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int N = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];

        st = new StringTokenizer(br.readLine()," ");
        
        for(int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        
        for(int i = 0; i < N-1; i++){
            int maxIndex = i;
            for(int j = i+1; j < N; j++){
                if(arr[maxIndex] < arr[j]){
                    maxIndex = j;
                }
            }
            swap(arr,i,maxIndex);
        }

        for(int i = 0; i < k; i++){
            if(i+1 == k){
                bw.write(String.valueOf(arr[i]));
            }
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