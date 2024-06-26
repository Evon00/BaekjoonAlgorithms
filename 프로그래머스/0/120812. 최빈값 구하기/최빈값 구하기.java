class Solution {
    public int solution(int[] array) {
        int answer = 0;
        int[] counter = new int[1000];
        
        for(int i = 0; i < array.length; i++){
            counter[array[i]]++;
        }
        
        int index = 0;
        int maxValue = 0;
        int count = 0;
        
        for(int i = 0; i < counter.length; i++){
            if(maxValue < counter[i]){
                maxValue = counter[i];
                index = i;
            }
        }
        
        for(int i = 0; i < counter.length; i++){
            if(maxValue == counter[i])
                count++;
        }
        if(count > 1) return -1;
        else return index;
    }
}