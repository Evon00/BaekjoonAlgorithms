import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        ArrayList<Integer> arrX = new ArrayList<>();
        ArrayList<Integer> arrY = new ArrayList<>();

        for(int i = 0; i < N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            arrX.add(Integer.parseInt(st.nextToken()));
            arrY.add(Integer.parseInt(st.nextToken()));
        }

        Collections.sort(arrX);
        Collections.sort(arrY);

        int x = arrX.get(arrX.size()-1) - arrX.get(0);
        int y = arrY.get(arrY.size()-1) - arrY.get(0);

        bw.write(String.valueOf(x*y));
        
        br.close();
        bw.flush();
        bw.close();
    }
}