import java.util.*;
import java.io.*;

public class Main {

    static int R, C;
    static char[][] lake;
    static boolean[][] visitedSwan;
    static boolean[][] visitedWater;
    static Queue<int[]> waterQueue = new LinkedList<>(); //물이 넓어지는 것
    static Queue<int[]> swanQueue = new LinkedList<>(); //백조가 탐색해야할 부분
    static Queue<int[]> nextSwanQueue = new LinkedList<>(); //백조가 탐색하다 만난 얼음들

    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        lake = new char[R][C];
        visitedSwan = new boolean[R][C];
        visitedWater = new boolean[R][C];

        int[] swanPos = new int[2];
        boolean foundSwan = false;

        for(int i = 0; i < R; i++){
            String line = br.readLine();
            for(int j = 0; j < C; j++){
                lake[i][j] = line.charAt(j);
                if(lake[i][j] == 'L'){ //해당 위치가 백조일 경우
                    if(!foundSwan){ //백조 위치 저장
                        swanPos = new int[]{i,j};
                        foundSwan = true;
                    }
                    waterQueue.add(new int[]{i,j}); //백조 위치 물 저장
                    visitedWater[i][j] = true;
                }
                if(lake[i][j] == '.'){ //해당 위치가 물일 경우, 물 위치 저장
                    waterQueue.add(new int[]{i,j});
                    visitedWater[i][j] = true;
                }
            }
        }
        //백조 BFS 시작
        swanQueue.add(swanPos);
        visitedSwan[swanPos[0]][swanPos[1]] = true;

        System.out.println(bfs());
  }

    //BFS는 백조가 만날때 까지 진행
    static int bfs(){
        int days = 0;
        while(true){
            if(moveSwan()) break; //만약 백조가 만났다면 종료
            meltIce(); //얼음을 녹이는 함수
            days++;
        }
        return days;
    }

    static boolean moveSwan() {
        Queue<int[]> nextQueue = new LinkedList<>();

        while(!swanQueue.isEmpty()){
            int[] cur = swanQueue.poll();
            int x = cur[0];
            int y = cur[1];

            for(int d = 0; d < 4; d++){
                int nx = x + dx[d];
                int ny = y + dy[d];
                
                if( nx < 0 || ny < 0 || nx >= R || ny >= C || visitedSwan[nx][ny]) continue; //범위를 벗어났거나, 해당 위치를 방문한적이 있으면통과

                visitedSwan[nx][ny] = true;
                if(lake[nx][ny] == 'L') return true; //백조를 만나면 종료
                if(lake[nx][ny] == '.') { //물을 만난다면, 다음 탐색 진행
                    swanQueue.add(new int[]{nx,ny});
                } else { //얼음을 만난다면, 다음탐색시 이용하기 위해 저장
                    nextQueue.add(new int[]{nx,ny});
                }
            }
        }
        swanQueue = nextQueue; //백조를 만나지 못하고 탐색이 끝나면, 얼음 위치부터 다시 시작하기 위해
        return false;
    }

    static void meltIce() {
        int size = waterQueue.size();

        for(int i = 0; i < size; i++){
            int[] cur = waterQueue.poll();
            int x = cur[0];
            int y = cur[1];

            for(int d = 0; d < 4; d++){
                int nx = x + dx[d];
                int ny = y + dy[d];

                if(nx < 0 || ny < 0 || nx >= R || ny >= C || visitedWater[nx][ny]) continue;

                if(lake[nx][ny] == 'X'){ //해당 위치가 얼음이면 물로 변경
                    lake[nx][ny] = '.';
                    waterQueue.add(new int[]{nx,ny}); //해당 위치부터 다시 BFS하기 위함
                }
                visitedWater[nx][ny] = true;
            }
        }
    }
}
