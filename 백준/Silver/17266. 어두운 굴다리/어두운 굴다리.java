import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    static int N,M;
    static int[] arr;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        M = Integer.parseInt(br.readLine());
        arr = new int[M];
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < M; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int left = 0;
        int right = N;
        int result = 0;
        
        while(left <= right){
            int mid = (left + right) / 2;
            if(isPossible(mid)){
                result = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        System.out.println(result);
    }

    static boolean isPossible(int height){
        int prev = 0;
        
        for(int i = 0; i < arr.length; i++){
            if(arr[i] - height <= prev){
                prev = arr[i] + height;
            } else return false;
        }
        return prev >= N;
    }
}