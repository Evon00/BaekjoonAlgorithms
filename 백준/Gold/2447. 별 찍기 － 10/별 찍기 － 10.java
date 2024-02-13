import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        char[][] arr = new char[N][N];
        
        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                arr[i][j] = ' ';
            }
        }

        star(arr,0,0,N);

        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                bw.write(arr[i][j]);
            }
            bw.write("\n");
        }
        
        br.close();
        bw.flush();
        bw.close();
        
    }

    private static void star(char[][] arr,int x, int y, int length){
        if(length == 1){
            arr[x][y] = '*';
        } else {
            for(int i = 0; i < 3; i++){
                for(int j = 0; j < 3; j++){
                    if(!(i == 1 && j == 1))
                        star(arr,x+i*length/3,y+j*length/3,length/3);
                }
            }
        }
    }
}