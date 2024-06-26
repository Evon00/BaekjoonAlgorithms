class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];
        
        int denom3 = denom1 * denom2;
        int numer3 = numer1 * denom2 + numer2 * denom1;
        int gcdNumber = gcd(denom3,numer3);
        answer[0] = numer3 / gcdNumber;
        answer[1] = denom3 / gcdNumber;
        
        return answer;
    }
    
    private int gcd(int a, int b){
        
        if(b == 0) return a;
        
        if(a < b){
            int tmp = a;
            a = b;
            b = tmp;
        }
        
        return gcd(b,a%b);
    }
}