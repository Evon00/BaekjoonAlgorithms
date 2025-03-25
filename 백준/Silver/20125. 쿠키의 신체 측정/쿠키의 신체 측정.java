import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        char[][] arr = new char[n+1][n+1];
        ArrayList<int[]> pos = new ArrayList<>();

        for(int i = 0; i < n; i++){
            String line = br.readLine();
            for(int j = 0; j < line.length(); j++){
                if(line.charAt(j) == '*'){
                    pos.add(new int[]{i+1,j+1});
                }
                arr[i+1][j+1] = line.charAt(j);
            }
        }

        //심장 찾기
        int heartX= pos.get(0)[0] + 1;
        int heartY = pos.get(0)[1];
        //심장 찾기

        //왼쪽팔 찾기
        int leftArm = 0;
        for (int j = heartY - 1; j > 0; j--) {
            if (arr[heartX][j] == '*') leftArm++;
            else break;
        }
        //왼쪽팔 찾기

        //오른팔
        int rightArm = 0;
        for (int j = heartY + 1; j <= n; j++) {
            if (arr[heartX][j] == '*') rightArm++;
            else break;
        }
        //오른팔

        //몸통
        int waist = 0;
        int waistEndX = heartX;
        for (int i = heartX + 1; i <= n; i++) {
            if (arr[i][heartY] == '*') {
                waist++;
                waistEndX = i;
            } else break;
        }
        //몸통

        //왼쪽 다리
        int leftLeg = 0;
        for (int i = waistEndX + 1; i <= n; i++) {
            if (arr[i][heartY - 1] == '*') leftLeg++;
            else break;
        }
        //왼쪽 다리

        //오른쪽 다리
        int rightLeg = 0;
        for (int i = waistEndX + 1; i <= n; i++) {
            if (arr[i][heartY + 1] == '*') rightLeg++;
            else break;
        }
        //오른쪽 다리

        System.out.println(heartX + " "+ heartY);
        System.out.println(leftArm + " "+ rightArm + " "+ waist + " " + leftLeg + " " + rightLeg);
    }
}