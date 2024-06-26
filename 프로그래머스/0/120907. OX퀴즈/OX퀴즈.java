import java.util.*;

class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        StringTokenizer st;
        for(int i = 0; i < quiz.length; i++){
            st = new StringTokenizer(quiz[i]," ");
            int x = Integer.parseInt(st.nextToken());
            String op = st.nextToken();
            int y = Integer.parseInt(st.nextToken());
            st.nextToken();
            int result = Integer.parseInt(st.nextToken());
            
            switch(op){
                case "+":
                    if(result == (x+y)) answer[i] = "O";
                    else answer[i] = "X";
                    break;
                case "-":
                    if(result == (x - y)) answer[i] = "O";
                    else answer[i] = "X";
                    break;
            }
            
        }
        return answer;
    }
}