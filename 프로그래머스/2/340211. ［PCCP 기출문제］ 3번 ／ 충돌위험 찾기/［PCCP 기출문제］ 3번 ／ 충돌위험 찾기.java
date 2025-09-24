import java.util.*;

class Solution {
    public int solution(int[][] points, int[][] routes) {
        int answer = 0;
        //points는 시작지점이자 골인지점
        //routes는 i번째가 4->2번으로 들어가는 느낌
        //그러면 route 기준 빠른 직선 거리를 구해야함 위아래오른왼쪽
        //모든 직선중에서 충돌 위험에 대해서 추가해야함
        
        List<List<Position>> paths = new ArrayList<>();
        
        int robotCount = routes.length;
        int maxTime = 0;
        for(int i = 0; i < robotCount; i++){
            List<Position> path = makePath(points,routes[i]); //모든 좌표와 i번째 동선
            paths.add(path);
            maxTime = Math.max(maxTime,path.size());
        }
        
        //충돌 확인, 해당시간에서 좌표를 보고 충돌이 생기면 counter++;
        
        for(int i = 0; i < maxTime; i++){
            Map<String,Integer> map = new HashMap<>();
            for(int j = 0; j < robotCount; j++){
                List<Position> path = paths.get(j);
                Position pos;
                if(i < path.size()){ //종료전
                    pos = path.get(i);
                    String key = pos.r +","+pos.c;
                    map.put(key,map.getOrDefault(key,0)+1); 
                }
            }
            
            for(int count : map.values()){
                if(count >= 2){
                    answer++;
                }
            }
        }
        //
        
        
        return answer;
    }
    
    private List<Position> makePath(int[][] points, int[] route){
        List<Position> path = new ArrayList<>();
        int index0 = route[0] - 1; // 2,4들어오면 index값으로따져서 1,3번
        int x = points[index0][0];
        int y = points[index0][1];
        path.add(new Position(x,y));
        
        for(int i = 1; i < route.length; i++){ //route가 2개 이상일수도 있으니
            int index = route[i] - 1;
            int targetX = points[index][0];
            int targetY = points[index][1];
            
            //다음 타겟까지 가는동안 x = targetX
            while(x != targetX || y != targetY){
                if(x < targetX){
                    x++;
                }else if(x > targetX){
                    x--;
                } else {
                    if(y < targetY){
                        y++;
                    }else if(y > targetY){
                        y--;
                    }
                }
                path.add(new Position(x,y));
            }
        }
        return path;
        
    } 
    
    static class Position {
        int r,c;
        Position (int r, int c){
            this.r = r;
            this.c = c;
        }
    }
}