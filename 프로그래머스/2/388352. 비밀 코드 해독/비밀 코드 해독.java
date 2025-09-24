import java.util.*;

class Solution {
    int n;
    int answer = 0;

    public int solution(int n, int[][] attempts, int[] results) {
        this.n = n;

        int[] comb = new int[5];
        dfs(1, 0, comb, attempts, results);

        return answer;
    }

    private void dfs(int start, int depth, int[] comb, int[][] attempts, int[] results) {
        if (depth == 5) {
            if (checkComb(comb, attempts, results)) {
                answer++;
            }
            return;
        }

        for (int i = start; i <= n; i++) {
            comb[depth] = i;
            dfs(i + 1, depth + 1, comb, attempts, results);
        }
    }

    private boolean checkComb(int[] comb, int[][] attempts, int[] results) {
        Set<Integer> set = new HashSet<>();
        for (int num : comb) set.add(num);

        for (int i = 0; i < attempts.length; i++) {
            int count = 0;
            for (int num : attempts[i]) {
                if (set.contains(num)) count++;
            }
            if (count != results[i]) return false; 
        }

        return true;
    }
}
