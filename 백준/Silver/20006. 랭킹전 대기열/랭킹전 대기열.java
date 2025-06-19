import java.util.*;
import java.lang.*;
import java.io.*;

class Main {

    static class Player {
        int level;
        String nickname;

        public Player(int level, String nickname){
            this.level = level;
            this.nickname = nickname;
        }
    }
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st = new StringTokenizer(br.readLine());

        int p = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        List<List<Player>> rooms = new ArrayList<>();

        for(int i = 0; i < p; i++){
            st = new StringTokenizer(br.readLine());
            int level = Integer.parseInt(st.nextToken());
            String nickname = st.nextToken();

            boolean isJoin = false;

            for(List<Player> room : rooms){
                if(room.size() < m){
                    int hostLevel = room.get(0).level;
                    if(Math.abs(hostLevel - level) <= 10){
                        room.add(new Player(level,nickname));
                        isJoin = true;
                        break;
                    }
                }
            }

            if(!isJoin){
                List<Player> newRoom = new ArrayList<>();
                newRoom.add(new Player(level,nickname));
                rooms.add(newRoom);
            }
        }

        for(List<Player> room : rooms){
            if(room.size() == m){
                bw.write("Started!\n");
            } else {
                bw.write("Waiting!\n");
            }

            room.sort(Comparator.comparing(p1 -> p1.nickname));
            for(Player player : room){
                bw.write(player.level + " " + player.nickname + "\n");
            }
        }

        bw.flush();
        bw.close();
        br.close();
        
    }
}