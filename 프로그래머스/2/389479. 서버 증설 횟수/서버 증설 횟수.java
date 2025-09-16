class Solution {
    public int solution(int[] players, int m, int k) {
        int answer = 0;
        int[] server = new int[24];
        
        for(int i = 0; i < players.length; i++){
            if(players[i] > 0){
                int serverCount = players[i] / m;
                if(serverCount > 0){
                    
                    if(server[i] >= serverCount) continue;
                    else {
                        int addServerValue = serverCount - server[i];
                        answer += addServerValue;
                        for(int j = i; j < i+k; j++){
                            if(j >= 24) break;
                            server[j] += addServerValue;
                        }
                    }
                }
            }else continue;
        }
        return answer;
    }
}

//게임 이용자수
//서버 배열 -> int[24] = 0; //특정시간대에 서버 증설되면 해당 인덱스에서 +5
//