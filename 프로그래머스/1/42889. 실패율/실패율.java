import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {
        int userCount = stages.length;
        int failUser;
        
        double[] failCount = new double[N];
        
        for(int i = 1; i <= N; i++){
            failUser = 0;
            for(int j = 0; j < stages.length; j++){
                if(stages[j] == i) failUser++;
            }
            if(failUser == 0) failCount[i-1] = 0;
            if(userCount == 0) failCount[i-1] = 0;
            else {
                failCount[i-1] = (double) failUser / userCount;
                userCount -= failUser;
                }
        }
        
        Integer[] stageOrder = new Integer[N];
        for(int i = 0; i < N; i++){
            stageOrder[i] = i+1;
        }
        
        Arrays.sort(stageOrder,(a,b) -> {
            if(failCount[b-1] == failCount[a-1]) return a - b;
            else return Double.compare(failCount[b-1],failCount[a-1]);
        });
        
        return Arrays.stream(stageOrder).mapToInt(Integer::intValue).toArray();
        
    }
}