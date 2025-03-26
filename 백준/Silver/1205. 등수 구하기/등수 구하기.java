import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int newScore = Integer.parseInt(st.nextToken());
        int p = Integer.parseInt(st.nextToken());

        ArrayList<Integer> list = new ArrayList<>();

        if(n > 0){
            st = new StringTokenizer(br.readLine());
            while(st.hasMoreTokens()){
                list.add(Integer.parseInt(st.nextToken()));
            }
        }

        int rank = 1;
        int sameCount = 0;

        for(int score : list){
            if(score > newScore){
                rank++;
            }else if(score == newScore){
                sameCount++;
            } else {
                break;
            }
        }

        if(n == p && list.get(n-1) >= newScore){
            System.out.println(-1);
        } else {
            System.out.println(rank);
        }
        
    }
}