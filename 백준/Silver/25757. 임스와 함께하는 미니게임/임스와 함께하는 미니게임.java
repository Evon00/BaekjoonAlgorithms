import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        Set<String> players = new HashSet<>();
        
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        String game = st.nextToken();

        for(int i = 0; i < n; i++){
            players.add(br.readLine());
        }

        if(game.equals("Y")){
            System.out.print(players.size()/1);
        }

        if(game.equals("F")){
            System.out.print(players.size()/2);
        }
        if(game.equals("O")){
            System.out.print(players.size()/3);
        }

        br.close();
        
    }
}