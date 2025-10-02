class Solution {
    public int[] solution(int n) {

        int[] answer = new int[n*(n+1)/2];
        int[][] tri = new int[n][n];
        int height = -1;
        int width = 0;
        int num = 1;
        
        for(int i = n; i > 0; i -= 3){
            for(int j = 0; j < i; j++) tri[++height][width] = num++;
            for(int j = 0; j < i-1; j++) tri[height][++width] = num++;
            for(int j = 0; j < i-2; j++) tri[--height][--width] = num++;
        }
        
        int index = 0;
        
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(tri[i][j] != 0){
                    answer[index++] = tri[i][j];
                }
            }
        }
        
        return answer;
    }
}