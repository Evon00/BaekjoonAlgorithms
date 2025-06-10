import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    static int n,m;
    static int[][] arr;
    static int minFuel = Integer.MAX_VALUE;
    static int[] dx = {-1, 0, 1};
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        arr = new int[n][m];

        for(int i = 0; i < n; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < m; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for(int j = 0; j < m; j++){
            dfs(0,j,-1,0);
        }

        System.out.print(minFuel);
    }

    static void dfs(int y, int x, int prevDir, int sum){
        if(y == n){ 
            minFuel = Math.min(minFuel,sum);
            return;
        }

        for(int dir = 0; dir < 3; dir++){
            if(dir == prevDir) continue;
            int nx = x + dx[dir];
            if(nx < 0 || nx >= m) continue;

            dfs(y+1, nx, dir, sum + arr[y][x]);
        }
    }
}