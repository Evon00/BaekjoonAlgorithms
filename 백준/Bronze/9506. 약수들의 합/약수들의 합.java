import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while(true){
            int n = Integer.parseInt(br.readLine());
            int sum = 0;
            
            if(n == -1)
                break;

            ArrayList<Integer> arr = new ArrayList<>();


            for(int i = 1; i < n; i++){
                if(n % i == 0){
                    arr.add(i);
                    sum += i;
                }
            }
            
            bw.write(String.valueOf(n));
            
            if(n == sum){
                bw.write(" = ");
                
                for(int i = 0; i < arr.size(); i++){
                    bw.write(String.valueOf(arr.get(i)));
                    if(i+1 != arr.size())
                        bw.write(" + ");
                }
                bw.write("\n");
            } else{
                bw.write(" is NOT perfect."+"\n");
            }
        }
        br.close();
        bw.flush();
        bw.close();
    }
}