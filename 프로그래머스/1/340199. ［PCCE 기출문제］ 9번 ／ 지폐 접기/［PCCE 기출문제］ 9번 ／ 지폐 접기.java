class Solution {
    
    int billx;
    int billy;
    public int solution(int[] wallet, int[] bill) {
        int answer = 0;
        billx = bill[0];
        billy = bill[1];
        
        while(
            !((billx <= wallet[0] && billy <= wallet[1]) || (billy <= wallet[0] && billx <= wallet[1]))
        ){
            if(billx > billy) billx /= 2;
            else billy /= 2;
            answer++;
        }
        
        return answer;
    }
}