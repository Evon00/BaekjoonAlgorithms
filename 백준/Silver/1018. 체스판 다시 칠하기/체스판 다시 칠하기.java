import java.util.*;
import java.io.*;

class Main {

    static char[][] whiteChess = new char[8][8];
    static char[][] blackChess = new char[8][8];
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        char[][] chess = new char[M][N];
        ArrayList<Integer> arr = new ArrayList<>();

        for(int i = 0; i < 8; i++){
            for(int j = 0; j < 8; j++){
                if((i+j) % 2 == 0){
                    whiteChess[i][j] = 'W';
                    blackChess[i][j] = 'B';
                } else {
                    whiteChess[i][j] = 'B';
                    blackChess[i][j] = 'W';
                }
            }
        }

        for(int i = 0; i < M; i++){
            String line = br.readLine();
            for(int j = 0; j < N; j++){
                chess[i][j] = line.charAt(j);
            }
        }

        for(int i = 0; i < M - 7; i++){
            for(int j = 0; j < N - 7; j++){
                arr.add(repaintChess(i,j,chess));
            }
        }
        Collections.sort(arr);
        bw.write(String.valueOf(arr.get(0)));

        br.close();
        bw.flush();
        bw.close();
    }

    public static int repaintChess(int M, int N, char[][] arr){
        char first = 'B';
        char second = 'W';
        int whiteCount = 0;
        int blackCount = 0;
        for(int i = M; i < M+8; i++){
            for(int j = N; j < N+8; j++){
                if(whiteChess[i-M][j-N] != arr[i][j])
                    whiteCount++;
                if(blackChess[i-M][j-N] != arr[i][j])
                    blackCount++;
            }
        }
        return Math.min(whiteCount,blackCount);
    }
}