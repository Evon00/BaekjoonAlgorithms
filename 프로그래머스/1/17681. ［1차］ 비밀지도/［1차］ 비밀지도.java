class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        int[] map = new int[n];
        
        for(int i = 0; i < n; i++){
            map[i] = arr1[i] | arr2[i];
        }
        
        for(int i = 0; i < n; i++){
            String s = "";
            String bin = Integer.toBinaryString(map[i]);
            
            while (bin.length() < n) {
                bin = "0" + bin;
            }
            
            for(int j = 0; j < bin.length(); j++){
                if(bin.charAt(j) == '0')
                    s += " ";
                else s += "#";
            }
            answer[i] = s.toString();
        }
        
        return answer;
    }
}