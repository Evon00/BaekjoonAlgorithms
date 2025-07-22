class Solution {
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        String answer = "";
        
        int videoTime = stringToSec(video_len);
        int posTime = stringToSec(pos);
        int op_startTime = stringToSec(op_start);
        int op_endTime = stringToSec(op_end);
        
        for(int i = 0; i < commands.length; i++){
            
            posTime = opCheck(posTime, op_startTime, op_endTime);
            
            String command = commands[i];
            switch(command){
                case "next":
                    if(posTime + 10 > videoTime){ //끝지점
                        posTime = videoTime;
                    } else {
                        posTime += 10;
                    }
                    break;
                case "prev":
                    if(posTime - 10 < 0){
                        posTime = 0;
                    } else {
                        posTime -= 10;
                    }
                    break;
            }
            posTime = opCheck(posTime, op_startTime, op_endTime);

        }
        
        return secToString(posTime);
    }
    
    public int stringToSec(String time){
        String[] times = time.split(":");
        return Integer.parseInt(times[0]) * 60 + Integer.parseInt(times[1]);
    }
    
    public int opCheck(int posTime, int op_startTime, int op_endTime){
        if(posTime >= op_startTime && posTime <= op_endTime){
            return op_endTime;
        }else {
            return posTime;
        }
    }
    
    public String secToString(int posTime){
        int min = posTime / 60;
        int sec = posTime % 60;
        return String.format("%02d:%02d",min,sec);
        
    }
}