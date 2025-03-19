import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        List<MeetingRoom> list = new ArrayList<>();
        StringTokenizer st;
        int startTime = 0;
        int endTime = 0;
        
        for(int i = 0; i < n; i++){
            st = new StringTokenizer(br.readLine());
            startTime = Integer.parseInt(st.nextToken());
            endTime = Integer.parseInt(st.nextToken());
            list.add(new MeetingRoom(startTime, endTime));
        }

        Collections.sort(list, new Comparator<MeetingRoom>(){
            @Override
            public int compare(MeetingRoom mr1, MeetingRoom mr2){
                if(mr1.endTime == mr2.endTime){
                    return mr1.startTime - mr2.startTime;
                }else {
                    return mr1.endTime - mr2.endTime;
                }
            }
        });

        int count = 1;
        endTime = list.get(0).endTime;
        
        for(int i = 1; i < n; i++){
            if(list.get(i).startTime < endTime) continue;
            else {
                endTime = list.get(i).endTime;
                count++;
            }
        }

        br.close();
        System.out.print(count);
    }

    private static class MeetingRoom{
        private int startTime;
        private int endTime;

        public MeetingRoom(int startTime, int endTime){            
            this.startTime = startTime;
            this.endTime = endTime;
        }
    }
}