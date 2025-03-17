import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[][] people = new int[n][2];

        for(int i = 0; i < n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            people[i][0] = Integer.parseInt(st.nextToken());
            people[i][1] = Integer.parseInt(st.nextToken());
        }

        for(int i = 0; i < n; i++){
            int rank = 1;
            for(int j = 0; j < n; j++){
                if(i == j) continue;
                if(people[j][0] > people[i][0] && people[j][1] > people[i][1]) rank++;
            }
            bw.write(rank+" ");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}