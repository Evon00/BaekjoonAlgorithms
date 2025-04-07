import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int sum = 0;
        int max = 0;
        int count = 1;
        for(int i = 0; i < x; i++){
            sum += arr[i];
        }
        max = sum;

        for(int i = 0; i < n - x; i++){
            sum -= arr[i];
            sum += arr[i+x];
            if(sum == max){
                count++;
            }
            if(sum > max){
                max = sum;
                count = 1;
            }
        }

        if(max == 0){
            System.out.print("SAD");
        }else {
            System.out.println(max);
            System.out.print(count);
        }
        
    }
}