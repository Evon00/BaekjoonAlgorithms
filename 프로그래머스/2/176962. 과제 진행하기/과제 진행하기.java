import java.util.*;

class Solution {
    public String[] solution(String[][] plans) {
        String[] answer = {};
        
        Arrays.sort(plans, Comparator.comparingInt(a -> timeToMin(a[1])));
        
        List<String> result = new ArrayList<>();
        Stack<Task> paused = new Stack<>();
        int currentTime = timeToMin(plans[0][1]);
        
        for(int i = 0; i < plans.length; i++){
            String name = plans[i][0];
            int startTime = timeToMin(plans[i][1]);
            int playTime = Integer.parseInt(plans[i][2]);
            
            currentTime = startTime;
            int nextStartTime = (i < plans.length - 1) ? timeToMin(plans[i+1][1]) : 1440;
            int endTime = currentTime + playTime;
            
            if(endTime <= nextStartTime){
                result.add(name);
                currentTime = endTime;
                
                while(!paused.isEmpty() && currentTime < nextStartTime){
                    Task task = paused.pop();
                    if(currentTime + task.remain <= nextStartTime){
                        result.add(task.name);
                        currentTime += task.remain;
                    } else {
                        task.remain -= (nextStartTime - currentTime);
                        currentTime = nextStartTime;
                        paused.push(task);
                    }
                }
            } else {
                paused.push(new Task(name, endTime - nextStartTime));
            }
        }
        
        while(!paused.isEmpty()){
            result.add(paused.pop().name);
        }
        
        return result.toArray(new String[0]);
    }
    
    private int timeToMin(String time){
        String[] parts = time.split(":");
        int h = Integer.parseInt(parts[0]);
        int m = Integer.parseInt(parts[1]);
        return h*60 + m;
    }
    
    private class Task {
        String name;
        int remain;
        
        Task(String name, int remain){
            this.name = name;
            this.remain = remain;
        }
    }
}