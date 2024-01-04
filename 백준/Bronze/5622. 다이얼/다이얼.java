import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String word = br.readLine();
        int totalTime = 0;

        for(char c : word.toCharArray()){
            int number = getDialNumber(c);
            totalTime += number + 1;
        }
        bw.write(String.valueOf(totalTime));
        br.close();
        bw.flush();
        bw.close();
    }

    private static int getDialNumber(char c){
        switch(c) {
            case 'A':
            case 'B':
            case 'C':
                return 2;
            case 'D':
            case 'E':
            case 'F':
                return 3;
            case 'G':
            case 'H':
            case 'I':
                return 4;
            case 'J':
            case 'K':
            case 'L':
                return 5;
            case 'M':
            case 'N':
            case 'O':
                return 6;
            case 'P':
            case 'Q':
            case 'R':
            case 'S':
                return 7;
            case 'T':
            case 'U':
            case 'V':
                return 8;
            case 'W':
            case 'X':
            case 'Y':
            case 'Z':
                return 9;
            default:
                return 0;
        }
    }
}