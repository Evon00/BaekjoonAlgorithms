import java.util.*;

class Solution {
    int n, m;
    char[][] container;
    boolean[][] isAccess;

    public int solution(String[] storage, String[] requests) {
        n = storage.length;
        m = storage[0].length();
        container = new char[n][m];

        int total = n*m;
        for (int i = 0; i < n; i++) {
            container[i] = storage[i].toCharArray();
        }

        for (String req : requests) {
            if (req.length() > 1) {
                char target = req.charAt(0);
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < m; j++) {
                        if (container[i][j] == target) {
                            container[i][j] = ' ';
                            total--;
                        }
                    }
                }
            } else {
                char target = req.charAt(0);
                updateAccess(); 
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < m; j++) {
                        if (container[i][j] == target && isAccess[i][j]) {
                            container[i][j] = ' ';
                            total--;
                        }
                    }
                }
            }
        }

        return total;
    }

    private void updateAccess() {
        isAccess = new boolean[n][m];
        boolean[][] visited = new boolean[n][m];
        Queue<int[]> q = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            if (container[i][0] != ' ') isAccess[i][0] = true;
            if (container[i][m - 1] != ' ') isAccess[i][m - 1] = true;
        }
        for (int j = 0; j < m; j++) {
            if (container[0][j] != ' ') isAccess[0][j] = true;
            if (container[n - 1][j] != ' ') isAccess[n - 1][j] = true;
        }

        for (int i = 0; i < n; i++) {
            if (container[i][0] == ' ' && !visited[i][0]) {
                visited[i][0] = true;
                q.add(new int[]{i,0}); 
            }
            if (container[i][m-1] == ' ' && !visited[i][m-1]) { 
                visited[i][m-1] = true;
                q.add(new int[]{i,m-1}); 
            }
        }
        for (int j = 0; j < m; j++) {
            if (container[0][j] == ' ' && !visited[0][j]) {
                visited[0][j] = true; 
                q.add(new int[]{0,j}); 
            }
            if (container[n-1][j] == ' ' && !visited[n-1][j]) { 
                visited[n-1][j] = true; 
                q.add(new int[]{n-1,j}); 
            }
        }

        int[] dx = {1, -1, 0, 0};
        int[] dy = {0, 0, 1, -1};

        while (!q.isEmpty()) {
            int[] cur = q.poll();
            int x = cur[0], y = cur[1];
            for (int d = 0; d < 4; d++) {
                int nx = x + dx[d], ny = y + dy[d];
                if (nx < 0 || ny < 0 || nx >= n || ny >= m) continue;
                if (container[nx][ny] == ' ') {
                    if (!visited[nx][ny]) {
                        visited[nx][ny] = true;
                        q.add(new int[]{nx, ny});
                    }
                } else {
                    isAccess[nx][ny] = true;
                }
            }
        }
    }
}