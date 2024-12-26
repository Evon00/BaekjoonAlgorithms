class Solution {
    public int solution(String A, String B) {
        int answer = -1;
        String change;
        
        if(A.equals(B))
            return 0;
        
        if(A.length() != B.length()) return -1;
        
        change = A;
        
        for(int i = 1; i <= A.length(); i++){
            change = change.substring(A.length() - 1) + change.substring(0, A.length() - 1);
            if(change.equals(B)) return i;
        }
        
        return answer;
    }
}