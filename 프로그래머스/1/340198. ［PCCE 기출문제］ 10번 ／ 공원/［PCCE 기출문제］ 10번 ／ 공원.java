import java.util.*;

class Solution {
    public int solution(int[] mats, String[][] park) {
        int answer = -1;
        int height = park.length;
        int width = park[0].length;
        Arrays.sort(mats);
        
        for(int q = mats.length-1; q >= 0; q--){
            int size = mats[q];
            for(int i = 0; i <= height-size; i++){
                for(int j = 0; j <= width - size; j++){
                    if(check(park,i,j,size)) {
                        return size;
                    }
                }
            }
        }
        return answer;
    }
    
    private boolean check(String[][] park, int i, int j, int size){
        for(int x = i; x < i+size; x++){
            for(int y = j; y < j+size; y++){
                if(!park[x][y].equals("-1")) return false;
            }
        }
        return true;
    }
}