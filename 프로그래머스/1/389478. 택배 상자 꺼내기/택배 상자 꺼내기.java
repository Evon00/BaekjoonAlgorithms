class Solution {
    public int solution(int n, int w, int num) {
        int idx = num - 1;
        int row = idx / w;
        int col;
        if (row % 2 == 0) {
            col = idx % w;
        } else {
            col = w - 1 - (idx % w);
        }

        int h = (n + w - 1) / w;
        int count = 0;
        for (int r = row; r < h; r++) {
            int boxIdx;
            if (r % 2 == 0) {
                boxIdx = r * w + col;
            } else {
                boxIdx = r * w + (w - 1 - col);
            }
            if (boxIdx < n) count++;
        }

        return count;
    }
}