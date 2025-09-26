import java.util.*;

class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int answer = 0;
        //공격 or 취소 -> 0초, 공격받을시 0이하면 죽어서 체력회복 불가
        //해당 초마다 고려할점
        //공격이들어왔나?들어오면 연속성공 0으로 초기화, 체력 감소, 죽음여부확인
        //들어오지않았으면? 붕대감기를 하는데 연속성공 +1하고 최대최력이면 그냥 패스
        //
        int maxHealth = health;
        int time = attacks[attacks.length-1][0];
        int seq = 0;
        
        Map<Integer, Integer> attackMap = new HashMap<>();
        
        for(int i = 0; i < attacks.length; i++){
            attackMap.put(attacks[i][0],attacks[i][1]);
        }
        
        for(int i = 1; i <= time; i++){
            if(attackMap.containsKey(i)){ //공격당한 시간이라면?
                health -= attackMap.get(i);
                if(health <= 0) return -1;
                seq = 0;
            } else { //공격당하지 않은 시간
                seq++; 
                health += bandage[1];
                if(seq == bandage[0]){
                    health += bandage[2];
                    seq = 0;
                }
                
                if(health > maxHealth) health = maxHealth;
                
            }
        }
        answer = health;
        return answer;
    }
}