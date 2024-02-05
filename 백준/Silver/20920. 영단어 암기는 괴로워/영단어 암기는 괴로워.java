import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        Map<String,Integer> freqMap = new HashMap<>();
        
        for(int i = 0; i < N; i++){
            String word = br.readLine();
            if(word.length() >= M){
                freqMap.put(word,freqMap.getOrDefault(word,0)+1);
            }
        }

        List<String> list = new ArrayList<>(freqMap.keySet());
        Collections.sort(list,new Comparator<String>(){
            @Override
                public int compare(String o1, String o2){
                    if(freqMap.get(o1) != freqMap.get(o2)){
                        return freqMap.get(o2) - freqMap.get(o1);
                    } else {
                        if(o1.length() != o2.length())
                            return o2.length() - o1.length();
                        else
                            return o1.compareTo(o2);
                    }
                }
        });

        for(int i = 0; i < list.size(); i++){
            bw.write(list.get(i)+"\n");
        }
        
        br.close();
        bw.flush();
        bw.close();
    }
}