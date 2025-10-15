class Solution {
    public int[] solution(int[] sequence, int k) {
        int n = sequence.length;
        int start = 0, end = 0;
        int lstart = 0, lend = 0;
        int sum = sequence[0];
        int shortestLength = 1000001;
        
        while(start <= end && end < n){
            if(sum == k){ 
                int length = end - start;
                if(length < shortestLength){ 
                    lstart = start;
                    lend = end;
                    shortestLength = length;
                }
                sum -= sequence[start++];
            }else if(sum > k){
                sum -= sequence[start++];
            }else {
                end++;
                if(end < n) sum += sequence[end];
            }
        }
        
        return new int[]{lstart,lend};
    }
}