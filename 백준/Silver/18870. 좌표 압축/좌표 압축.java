import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int[] arr = new int[N];
        int[] sortArr = new int[N];
        
        for(int i = 0; i < N; i++){
            arr[i] = sortArr[i] = Integer.parseInt(st.nextToken());
        }
        
        Arrays.sort(sortArr);

        Map<Integer,Integer> map = new HashMap<>();
        int rank = 0;
        
        for(int i = 0; i < N; i++){
            if(!map.containsKey(sortArr[i])){
                map.put(sortArr[i],rank);
                rank++;
            }
        }

        for(int i = 0; i < N; i++){
            bw.write(String.valueOf(map.get(arr[i]))+" ");
        }
        
        br.close();
        bw.flush();
        bw.close();
    }
}