import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());

        for(int i = 0; i < t; i++){ // 테스트 케이스만큼 진행
            
            Map<Integer, Integer> map = new HashMap<>();
            int member = Integer.parseInt(br.readLine());
            int[] ranks = new int[member];
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            
            for(int j = 0; j < member; j++){
                int data = Integer.parseInt(st.nextToken());
                ranks[j] = data;
                map.put(data,map.getOrDefault(data,0)+1);
            }

            int teamSize = map.size();
            int[] fifthMember = new int[teamSize+1];
            Map<Integer, Integer> scoreMap = new HashMap<>();
            Map<Integer, Integer> counterMap = new HashMap<>();
            int score = 1;
            
            for(int rank : ranks){
                if(map.get(rank) == 6){
                    counterMap.put(rank,counterMap.getOrDefault(rank,0)+1); // 몇번째인지 확인

                    if(counterMap.get(rank) <= 4){
                        scoreMap.put(rank,scoreMap.getOrDefault(rank,0)+score);
                    }
                    if(counterMap.get(rank) == 5){
                        fifthMember[rank] = score;
                    }

                    score++;
                }
            }
            int minValue = 10000;
            int winner = 0;
            for(Integer key : scoreMap.keySet()){
                int value = scoreMap.get(key);
                if(value < minValue){
                    minValue = value;
                    winner = key;
                }else if(value == minValue){
                    if(fifthMember[winner] > fifthMember[key]){
                        winner = key;
                    }
                }
            }

            bw.write(winner+"\n");
        }
        br.close();
        bw.flush();
        bw.close();
        
    }
}