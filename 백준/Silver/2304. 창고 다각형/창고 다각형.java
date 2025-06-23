import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st;
        List<Pillar> pillarList = new ArrayList<>();

        for(int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());
            int index = Integer.parseInt(st.nextToken());
            int height = Integer.parseInt(st.nextToken());
            pillarList.add(new Pillar(index, height));
        }

        Collections.sort(pillarList);

        int maxHeight = 0;
        for (Pillar p : pillarList) {
            if (p.height > maxHeight) maxHeight = p.height;
        }

        int firstMax = -1, lastMax = -1;
        for (int i = 0; i < pillarList.size(); i++) {
            if (pillarList.get(i).height == maxHeight) {
                if (firstMax == -1) firstMax = i;
                lastMax = i;
            }
        }

        int result = 0;

        int height = pillarList.get(0).height;
        int leftIndex = pillarList.get(0).index;
        for (int i = 1; i <= firstMax; i++) {
            if (pillarList.get(i).height > height) {
                result += (pillarList.get(i).index - leftIndex) * height;
                height = pillarList.get(i).height;
                leftIndex = pillarList.get(i).index;
            }
        }


        height = pillarList.get(pillarList.size() - 1).height;
        int rightIndex = pillarList.get(pillarList.size() - 1).index;
        for (int i = pillarList.size() - 2; i >= lastMax; i--) {
            if (pillarList.get(i).height > height) {
                result += (rightIndex - pillarList.get(i).index) * height;
                height = pillarList.get(i).height;
                rightIndex = pillarList.get(i).index;
            }
        }

        int middleWidth = pillarList.get(lastMax).index - pillarList.get(firstMax).index + 1;
        result += middleWidth * maxHeight;


        bw.write(String.valueOf(result));

        bw.flush();
        bw.close();
        br.close();
    }
}

    class Pillar implements Comparable<Pillar>{
        int index;
        int height;

        Pillar(int index, int height){
            this.index = index;
            this.height = height;
        }

        @Override
        public int compareTo(Pillar obj){
            return Integer.compare(this.index, obj.index);
        }
    }