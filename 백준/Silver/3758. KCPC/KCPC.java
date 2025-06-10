import java.util.*;
import java.lang.*;
import java.io.*;

class Team {
    int id;
    int[] problems;
    int totalScore;
    int submitCount;
    int lastSubmitTime;

    public Team(int id, int k){
        this.id = id;
        this.problems = new int[k+1];
    }

    public void submit(int problem, int score, int time){
        if(score > problems[problem]){
            totalScore += score - problems[problem];
            problems[problem] = score;
        }
        submitCount++;
        lastSubmitTime = time;
    }
}

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        while(T-- > 0){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());
            int t = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            Map<Integer, Team> teamMap = new HashMap<>();
            for(int i = 1; i <= n; i++){
                teamMap.put(i, new Team(i,k));
            }

            for(int time = 1; time <= m; time++){
                st = new StringTokenizer(br.readLine());
                int teamId = Integer.parseInt(st.nextToken());
                int problem = Integer.parseInt(st.nextToken());
                int score = Integer.parseInt(st.nextToken());

                teamMap.get(teamId).submit(problem, score, time);
            }

            List<Team> list = new ArrayList<>(teamMap.values());
            list.sort((a,b) -> {
                if(b.totalScore != a.totalScore) return b.totalScore - a.totalScore;
                if(a.submitCount != b.submitCount) return a.submitCount - b.submitCount;
                return a.lastSubmitTime - b.lastSubmitTime;
            });

            for(int i = 0; i < list.size(); i++){
                if(list.get(i).id == t){
                    System.out.println(i+1);
                    break;
                }
            }
        }
    }
}