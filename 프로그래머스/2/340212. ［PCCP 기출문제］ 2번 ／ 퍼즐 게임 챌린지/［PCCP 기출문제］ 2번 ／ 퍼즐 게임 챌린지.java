class Solution {
    public int solution(int[] diffs, int[] times, long limit) {
        int answer = 0;
        
        //난이도, 퍼즐 소요시간, 이전 소요시간, 숙련도
        //난이도 <= 숙련도, 현재 소요시간으로 해결
        //난이도 > 숙련도, 난이도 - 숙련도 만큼 틀린다, 틀릴때마다 현재 퍼즐 소요시간만큼 사용
        //또한, 이전 퍼즐을 다시 풀어야함
        // 난이도 > 숙련도, 난이도 - 숙련도 만큼 틀리고, 현재 퍼즐소요 + 이전 퍼즐 (단 한번만에 풀수있음)
        //diff - level번 틀린 이후면 현재 퍼즐만큼 사용해서 해결
        //limit안에 깨기 위한 숙련도의 최솟값 제일 
        int minDiff = 1;
        int maxDiff = 1;
        for(int i = 0; i < diffs.length; i++){
            if(diffs[i] > maxDiff){
                maxDiff = diffs[i];
            }
        }
        int middleDiff = (minDiff + maxDiff) / 2;
        
        while(minDiff <= middleDiff){
            boolean flag = false;
            long time = times[0];
            for(int i = 1; i < diffs.length; i++){
                if(diffs[i] > middleDiff){
                    time += (diffs[i] - middleDiff) * (times[i] + times[i-1]) + times[i];
                } else {
                    time += times[i];
                }
                
                if(time > limit){ //1 3 5 -> 4 4 5
                    minDiff = middleDiff+1;
                    middleDiff = (minDiff + maxDiff) / 2;
                    flag = true;
                    break;
                }
            }
            
            if(!flag){
                answer = middleDiff;
                maxDiff = middleDiff -1;
                middleDiff = (minDiff + maxDiff) / 2;
            }
        }
        
        return answer;
    }
}