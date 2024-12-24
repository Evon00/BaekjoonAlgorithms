import java.util.*;

class Solution {
    public int[] solution(int[] numlist, int n) {
        List<Integer> answer = new ArrayList<>();
        
        for(int num : numlist){
            answer.add(num);
        }
        
        answer.sort((a,b) -> {
            int diffA = Math.abs(a - n);
            int diffB = Math.abs(b - n);
            
            if(diffA == diffB) {
                return b - a;
            }
            return diffA - diffB;
        });
        
        int[] answerList = new int[answer.size()];
        
        for(int i = 0; i < answer.size(); i++){
            answerList[i] = answer.get(i);    
        }
        return answerList;
    }
}