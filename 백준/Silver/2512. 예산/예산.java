import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[N];

        int left = 0, right = 0;
        
        for(int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
            if(arr[i] > right) right = arr[i];
        }

        int m = Integer.parseInt(br.readLine());
        
        while(left <= right){
            int mid = (left + right) / 2;
            int budget = 0;
            for(int i = 0; i < N; i++){
                if(arr[i] > mid) budget += mid;
                else budget += arr[i];
            }

            if(budget <= m) left = mid + 1;
            else right = mid - 1;
        }

        System.out.print(right);
        
    }
}