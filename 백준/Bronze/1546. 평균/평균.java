import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int subject = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        ArrayList<Double> score = new ArrayList<>();
        
        for(int i = 0; i < subject; i++){
            score.add(Double.parseDouble(st.nextToken()));
        }
        
        double maxScore = Collections.max(score);
        double addScore = 0;
        
        for(int i = 0; i < subject; i++){
            double newValue = score.get(i) / maxScore * 100;
            score.set(i,newValue);
            addScore += newValue;
        }

        double mean = addScore / score.size();
        bw.write(mean+"\n");
        br.close();
        bw.flush();
        bw.close();
    }
}