class Solution {
    public int solution(int[] common) {
        int answer = 0;
        
        if(common[1] - common[0] == common[2] - common[1])
            return common[common.length-1] + (common[1] - common[0]);
        else {
            if(common[0] == 0)
                return common[common.length-1] * 0;
            return common[common.length-1] * (common[1] / common[0]);
        }
    }
}