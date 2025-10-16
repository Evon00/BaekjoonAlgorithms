import java.util.*;

class Solution {
    public int solution(int[] picks, String[] minerals) {
        int answer = 0;
        int[][] hp = {{1,1,1},{5,1,1},{25,5,1}};
        
        //미네랄이 많은가? 곡갱이가 많은가?
        int picksCount = picks[0] + picks[1] + picks[2];
        int mineralCount = Math.min(picksCount*5,minerals.length);
        
        //미네랄 매핑
        Map<String, Integer> mineralMap = new HashMap<>();
        mineralMap.put("diamond",0);
        mineralMap.put("iron",1);
        mineralMap.put("stone",2);
        //미네랄 매핑
        
        //해당 그룹은 미네랄 5개 묶음 [채굴 피로도, 다,철,돌 갯수]
        ArrayList<MineralGroup> groups = new ArrayList<>(); 
        
        for(int i = 0; i < mineralCount; i = i + 5){
            int end = Math.min(i+5,mineralCount);
            int[] counts = new int[3];
            for(int j = i; j < end; j++){
                counts[mineralMap.get(minerals[j])]++;
            }
            groups.add(new MineralGroup(counts));
        }
        
        Collections.sort(groups, (a,b) -> (b.difficulty - a.difficulty));
        
        
        for(int i = 0; i < groups.size(); i++){
            
            int pickIdx = 0;
            
            //곡갱이 선정
            for(int j = 0; j < 3; j++){
                if(picks[j] == 0) continue;
                else {
                    pickIdx = j;
                    break;
                }
            }
            //곡갱이 선정
            
            if(pickIdx >= 3) break;
            
            //피로도 계산
            for(int j = 0; j < 3; j++){
                answer += groups.get(i).counts[j] * hp[pickIdx][j];
            }
            //피로도 계산
            
            //사용한 곡갱이 소모
            picks[pickIdx]--;
            //사용한 곡갱이 소모
        }
        
        return answer;
    }
    
    class MineralGroup {
        int[] counts;
        int difficulty;
        
        MineralGroup(int[] counts){
            this.counts = counts;
            this.difficulty = counts[0] * 25 + counts[1] * 5 + counts[2] * 1;
        }
    }
}