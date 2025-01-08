import java.util.Arrays;

class Solution {
    public int[] solution(int[][] score) {
        int size = score.length;
        int[] answer = new int[size];
        double[] avg = new double[size];
        
        for(int i = 0; i < size; i++){
            avg[i] = (score[i][0] + score[i][1]) / 2.0;
        }
        
        for(int i = 0; i < size; i++){
            int rank = 1;
            for(int j = 0; j < size; j++){
                if(avg[i] < avg[j])
                    rank++;
            }
            answer[i] = rank;
        }
        
        return answer;
    }
}