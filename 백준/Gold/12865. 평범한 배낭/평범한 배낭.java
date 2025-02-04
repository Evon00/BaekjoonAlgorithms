import java.util.*;
import java.io.*;

public class Main {
    
    static Integer[][] dp;
    static int[] w; //weight
    static int[] v; //value
    
    public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

      StringTokenizer st = new StringTokenizer(br.readLine()," ");
      
      int N = Integer.parseInt(st.nextToken()); //개수
      int K = Integer.parseInt(st.nextToken()); //무게
      
      w = new int[N];
      v = new int[N];
      dp = new Integer[N][K+1]; //개수 / 무게 +1

      for(int i = 0; i < N; i++){
        st = new StringTokenizer(br.readLine()," ");
        w[i] = Integer.parseInt(st.nextToken());
        v[i] = Integer.parseInt(st.nextToken());
      }
      
      br.close();
      System.out.print(knapsack(N-1,K)); //제일 마지막것 호출= dp[i][k]
  }
  
  static int knapsack(int i, int k){
    if(i < 0) return 0; //물건이 없다면 0
    
    if(dp[i][k] == null){ //탐색해보지 않았는 경우
      if(w[i] > k) { //현재 물건을 담지 못하는 경우
        dp[i][k] = knapsack(i-1,k); //이전 값 넣는다.
      } else { //현재 물건을 넣을 수 있는 경우
        dp[i][k] = Math.max(knapsack(i-1,k),knapsack(i-1,k-w[i]) + v[i]);
        //넣지 않은것 vs 넣은것 중 더 큰것을 저장
      } 
    }
    return dp[i][k];
  }
}