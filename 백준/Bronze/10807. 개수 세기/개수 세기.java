import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());
        int[] nums = new int[num];
        StringTokenizer st;

        st = new StringTokenizer(br.readLine(), " ");
        
        for(int i = 0; i < num; i++){
            int a = Integer.parseInt(st.nextToken());
            nums[i]= a;
        }
        
        int find = Integer.parseInt(br.readLine());

        int count = 0;
        
        for(int i = 0; i < num; i++){
            if(nums[i] == find)
                count++;
        }
        bw.write(count+"\n");

        br.close();
        bw.flush();
        bw.close();

    }
}