import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String line = br.readLine();

        int index = 0;
        int number = 1;

        while(index < line.length()){
            String numberStr = String.valueOf(number);
            for(int i = 0; i < numberStr.length(); i++){
                if(index < line.length() && line.charAt(index) == numberStr.charAt(i)){
                    index++;
                }
            }
            number++;
        }
        System.out.print(number-1);
    }
}