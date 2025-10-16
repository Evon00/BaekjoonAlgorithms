//똭 보자마자 dfs,bfs 생각남;; 이거해서 최소 이동거리? 최소라고 하면bfs?
//상 하 좌 우 순서로 움직이고
//단 G지점을 통과가 아닌 멈춰야함, 그리고 멈춘 지점이 G여야한다

import java.util.*;

class Solution {
    
    private int[] dx = {-1, 1 , 0, 0};
    private int[] dy = {0, 0, -1, 1};
    
    public int solution(String[] board) {
        int answer = 0;
        
        // n x m 보드
        int n = board.length;
        int m = board[0].length();
        int startX = 0, startY = 0, endX = 0, endY = 0;
        
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(board[i].charAt(j) == 'R'){
                    startX = i;
                    startY = j;
                }
                if(board[i].charAt(j) == 'G'){
                    endX = i;
                    endY = j;
                }
            }
        }
        
        //BFS, 이동횟수도 필요하니 추가
        
        Queue<int[]> queue = new LinkedList<>();
        boolean[][] visited = new boolean[n][m];
        
        queue.offer(new int[]{startX,startY,0}); 
        visited[startX][startY] = true;
        
        while(!queue.isEmpty()){
            int[] current = queue.poll();
            int x = current[0];
            int y = current[1];
            int move = current[2];
            
            if(x == endX && y == endY){
                return move;
            }
            
            //미끄러지듯이 이동할려면?
            //방향을 정하고 그냥 계속 더하기
            for(int dir = 0; dir < 4; dir++){
                int nx = x;
                int ny = y;
                
                while(true){
                    int nextX = nx + dx[dir];
                    int nextY = ny + dy[dir];
                    if(nextX < 0 || nextX >= n || nextY < 0 || nextY >= m || board[nextX].charAt(nextY) == 'D') break;
                    nx = nextX;
                    ny = nextY;
                }
                
                if(!visited[nx][ny]){
                    visited[nx][ny] = true;
                    queue.offer(new int[]{nx,ny,move+1});
                }
                
            }
        }
                
        return -1;
    }
}