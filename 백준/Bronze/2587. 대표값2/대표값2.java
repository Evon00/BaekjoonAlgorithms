import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

       int mean = 0;
        int[] arr = new int[5];

        for (int i = 0; i < 5; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            mean += arr[i];
        }

        mean /= 5;

        for (int i = 0; i < 4; i++) {
            int minIndex = i;
            for (int j = i + 1; j < 5; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            swap(arr, i, minIndex);
        }

        bw.write(String.valueOf(mean)+"\n");
        bw.write(String.valueOf(arr[2])+"\n");
        
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