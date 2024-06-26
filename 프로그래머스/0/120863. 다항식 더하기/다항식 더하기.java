import java.util.*;

class Solution {
    public String solution(String polynomial) {
        String answer = "";
        StringTokenizer st = new StringTokenizer(polynomial," ");
        int xTerm = 0;
        int constantTerm = 0;
        
        while(st.hasMoreTokens()){
            String term = st.nextToken();
            
            if(term.equals("+")) continue;
            
            if(term.equals("x")){
                xTerm++;
            } else if(term.contains("x")) {
                xTerm += Integer.parseInt(term.substring(0,term.length()-1));
            } else {
                constantTerm += Integer.parseInt(term);
            }
        }
        String xTermAnswer = "";
        
        if(xTerm == 1){
            xTermAnswer += "x";
        } else if(xTerm > 1){
            xTermAnswer += (xTerm+"x");
        }
        
        if(xTermAnswer.equals("") && constantTerm == 0) return null;
        else if(xTermAnswer.equals("")) return constantTerm+"";
        else if(constantTerm == 0) return xTermAnswer;
        else return xTermAnswer + " + " + constantTerm;
    }
}