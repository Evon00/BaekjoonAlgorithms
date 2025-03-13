import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Nation> list = new ArrayList<>();
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int goal = 0;

        for(int i = 0; i < n; i++){
            st = new StringTokenizer(br.readLine());
            int num = Integer.parseInt(st.nextToken());
            int gold = Integer.parseInt(st.nextToken());
            int silver = Integer.parseInt(st.nextToken());
            int bronze = Integer.parseInt(st.nextToken());
            list.add(new Nation(num,gold,silver,bronze));
        }

        Collections.sort(list, new Comparator<Nation>(){
            @Override
            public int compare(Nation n1, Nation n2){
                if(n1.gold == n2.gold){
                    if(n1.silver == n2.silver){
                        return n2.bronze - n1.bronze;
                    }else {
                        return n2.silver - n1.silver;
                    }
                }else {
                    return n2.gold - n1.gold;
                }
            }
        });

        for(int i = 1; i < n; i++){

            Nation nowNation = list.get(i);
            Nation prevNation = list.get(i-1);

            if(list.get(i).num == k){
                goal = i;
            }
            
            if(nowNation.gold == prevNation.gold && nowNation.silver == prevNation.silver && nowNation.bronze == prevNation.bronze){
                list.get(i).rank = list.get(i-1).rank;
            } else {
                list.get(i).rank = i+1;
            }
        }

        System.out.println(list.get(goal).rank);
        
    }

    public static class Nation {
        private int num;
        private int gold;
        private int silver;
        private int bronze;
        private int rank;

        public Nation(int num, int gold, int silver, int bronze){
            this.num = num;
            this.gold = gold;
            this.silver = silver;
            this.bronze = bronze; 
            this.rank = 1;
        }
    }
}