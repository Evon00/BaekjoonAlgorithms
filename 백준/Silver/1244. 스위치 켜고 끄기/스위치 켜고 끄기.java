import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n+1];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 1; i <= n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int studentCount = Integer.parseInt(br.readLine());

        for(int i = 0; i < studentCount; i++){
            st = new StringTokenizer(br.readLine());
            int gender = Integer.parseInt(st.nextToken());
            int num = Integer.parseInt(st.nextToken());

            if(gender == 1){//남
                for(int j = num; j <= n; j += num){
                    arr[j] = 1 - arr[j];
                }
            }else {
                //여
                int left = num;
                int right = num;
                while(left > 0 && right <= n && arr[left] == arr[right]){
                    left--;
                    right++;
                }
                left++;
                right--;
                for(int j = left; j <= right; j++){
                    arr[j] = 1 - arr[j];
                }
            }
        }

        for(int i = 1; i <= n; i++){
            bw.write(arr[i]+" ");
            if(i % 20 == 0) bw.write("\n");
        }

        br.close();
        bw.flush();
        bw.close();
        
    }
}