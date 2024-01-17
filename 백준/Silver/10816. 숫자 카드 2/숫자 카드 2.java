import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i = 0; i < N; i++){
            int number = Integer.parseInt(st.nextToken());
            if(!(map.containsKey(number)))
                map.put(number,1);
            else{
                int hasNumber = map.get(number);
                map.put(number,hasNumber+1);
            }
        }

        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < M; i++){
            int count = map.getOrDefault(Integer.parseInt(st.nextToken()),0);
            bw.write(String.valueOf(count)+" ");
        }
        
        br.close();
        bw.flush();
        bw.close();
    }
}