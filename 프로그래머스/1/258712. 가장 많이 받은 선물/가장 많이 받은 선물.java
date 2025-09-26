import java.util.*;

class Solution {
    public int solution(String[] friends, String[] gifts) {
        int answer = 0;

        int friendCount = friends.length;
        Map<String,Integer> indexMap = new HashMap<>();
        int[][] gift = new int[friendCount][friendCount];
        
        
        for(int i = 0; i < friendCount; i++){
            indexMap.put(friends[i],i);
        }
        
        for(int i = 0; i < gifts.length; i++){
            String[] line = gifts[i].split(" ");
            int sender = indexMap.get(line[0]);
            int receiver = indexMap.get(line[1]);
            gift[sender][receiver]++;
        }
        
        int[] giftIndex = new int[friendCount];
        for(int i = 0; i < friendCount; i++){
            int given = 0;
            int received = 0;
            for(int j = 0; j < friendCount; j++){
                given += gift[i][j]; // i가 준거
                received += gift[j][i]; //i가 받은거
            }
            giftIndex[i] = given - received;
        }
        
        int[] nextGift = new int[friendCount];
        for(int i = 0; i < friendCount; i++){
            for(int j = i+1; j < friendCount; j++){
                if(gift[i][j] > gift[j][i]){ //a -> b줄때 a가 많으면
                    nextGift[i]++;
                }else if(gift[i][j] < gift[j][i]){
                    nextGift[j]++;
                }else{ //같다면 선물지수 비교
                    if(giftIndex[i] > giftIndex[j]){
                        nextGift[i]++;
                    }else if(giftIndex[i] < giftIndex[j]){
                        nextGift[j]++;
                    }
                }
            }
        }
        
        Arrays.sort(nextGift);
        answer = nextGift[friendCount-1];
        
        return answer;
    }
}