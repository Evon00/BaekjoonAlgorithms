import java.util.*;

class Solution {
    public int solution(int[][] targets) {
        int answer = 1;
        Arrays.sort(targets, (a,b) -> Integer.compare(a[1],b[1]));
        
        int target = targets[0][1];
        
        for(int i = 1; i < targets.length; i++){
            
            if(targets[i][0] < target) continue;
            else {
                answer++;
                target = targets[i][1];   
            }
        }
        
        return answer;
    }
}

//최소한의 미사일 이용
//(s,e) 직선구간 미사일, 미사일 하나 발사하면 x좌표에 걸쳐있는 모든 폭격 미사일 관통
//단, (s,e) 구간에서 s,e에서는 요격 불가
//x좌표는 실수도 가능