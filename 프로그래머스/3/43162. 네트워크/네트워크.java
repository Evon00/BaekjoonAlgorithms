class Solution {
    boolean[] visited;
    public int solution(int n, int[][] computers) {
        int answer = 0;
        visited = new boolean[n];
        
        for(int i = 0; i < n; i++){
            if(!visited[i]){
                dfs(i, computers, n);
                answer++;
            }
        }
        return answer;
    }
    void dfs(int current , int[][]computers, int n){
        visited[current] = true;
        for(int i = 0; i < n; i++){
            if(i != current && computers[current][i] == 1 && !visited[i])
                dfs(i,computers,n);
        }
    }
}