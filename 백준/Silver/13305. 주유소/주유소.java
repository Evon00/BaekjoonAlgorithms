import java.util.*;
import java.lang.*;
import java.io.*;

class Main {

    static long[] city;
    static long[] road;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        city = new long[N];
        road = new long[N-1];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i = 0; i < N-1; i++){
            road[i] = Long.parseLong(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());

        for(int i = 0; i < N; i++){
            city[i] = Long.parseLong(st.nextToken()); 
        }

        long cost = 0;
        long minCost = city[0];

        for(int i = 0; i < N-1; i++){
            if(city[i] < minCost){
                minCost = city[i];
            }
            cost += minCost * road[i];
            
        }
        System.out.print(cost);
    }
}