class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        int gcdNumber = 0;
        
        //1. a,b 의 최대 공약수
        if(a < b) gcdNumber = gcd(b,a);
        else gcdNumber = gcd(a,b);
        
        //2. 최대공약수로 기약분수 제작
        a = a / gcdNumber;
        b = b / gcdNumber;
        
        //3. 기약분수의 분모의 소인수가 2,5만 존재하는지?
        
        while(b % 2 == 0){
            b /= 2;
        }
        while(b % 5 == 0){
            b /= 5;
        }
        
        if(b != 1) answer = 2;
        else answer = 1;
        
        return answer;
    }
    
    public int gcd(int a, int b){
        while(b > 0){
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }
}