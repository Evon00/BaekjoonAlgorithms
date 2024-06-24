import java.util.*;

class Solution {
    public int solution(int cacheSize, String[] cities) {
        int answer = 0;
        
        Set<String> hashSet = new LinkedHashSet<String>(cacheSize);
        
        for(int i = 0; i < cities.length; i++){
            String city = cities[i];
            city = city.toLowerCase();
            
            if(hashSet.isEmpty()){ //비어있을 경우 추가, miss
                hashSet.add(city);
                answer += 5;
            } else { //한개라도 있을경우
                if(cacheSize < hashSet.size()){ //추가한 경우가 cacheSize보다 많을 경우
                    hashSet.remove(hashSet.stream().findFirst().get()); //제일 오래된것 찾아서 삭제
                }
                if(hashSet.contains(city)){ //해당 도시가 있다면
                    hashSet.remove(city);
                    hashSet.add(city);
                    answer += 1;
                } else { //해당 도시가 없다면
                    hashSet.add(city);
                    answer += 5;
                }
            }
        }
        
        return answer;
    }
}