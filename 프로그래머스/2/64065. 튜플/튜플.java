import java.util.*;

class Solution {
    public int[] solution(String s) {
        String[] tupleList = s.replaceAll("\\{"," ").replaceAll("\\}"," ").trim().split(" , ");
        
        Arrays.sort(tupleList, new Comparator<String>(){
            @Override
            public int compare(String o1, String o2){
                return o1.length() - o2.length();
            }
        });
        
        List<Integer> tuple = new ArrayList<>();
        
        for(String str : tupleList){
            String[] element = str.split(",");
            for(String e : element){
                int num = Integer.parseInt(e);
                if(tuple.contains(num)) continue;
                tuple.add(num);
            }
        }
        
        return tuple.stream().mapToInt(Integer::intValue).toArray();
        
    }
}