class Solution {
    public int solution(int[] schedules, int[][] timelogs, int startday) {
        int answer = 0;
        
        for(int i = 0; i < schedules.length; i++){
            int hopeTime = schedules[i];
            int hopeMin = (hopeTime / 100) * 60 + (hopeTime % 100);
            int endMin = hopeMin + 10;
            
            int index = startday;
            boolean flag = true;
            
             for (int j = 0; j < timelogs[i].length; j++) {
                if (index < 6) {
                    int logTime = timelogs[i][j];
                    int logMin = (logTime / 100) * 60 + (logTime % 100);
                    if (logMin > endMin) {
                        flag = false;
                        break;
                    }
                }
                index = (index % 7) + 1;
            }

            if (flag) answer++;
            
        }
        
        return answer;
    }
}