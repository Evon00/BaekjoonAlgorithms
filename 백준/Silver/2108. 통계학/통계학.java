import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        ArrayList<Integer> list = new ArrayList<>();
        Map<Integer,Integer> freqMap = new HashMap<>();
        ArrayList<Integer> freqList = new ArrayList<>();
        double sum = 0;
        int freqResult = 0;
        
        for(int i = 0; i < N; i++){
            int number = Integer.parseInt(br.readLine());
            sum += (double) number;
            list.add(number);
            if(freqMap.containsKey(number)){
                int count = freqMap.get(number);
                freqMap.put(number,++count);
            } else {
                freqMap.put(number,1);
            }
        }

        Collections.sort(list);
        List<Map.Entry<Integer,Integer>> entryList = new LinkedList<>(freqMap.entrySet());
        entryList.sort(new Comparator<Map.Entry<Integer,Integer>>(){
           @Override
            public int compare(Map.Entry<Integer,Integer> o1, Map.Entry<Integer,Integer> o2){
                return o1.getValue() - o2.getValue();
            }
        });

        int freq = entryList.get(entryList.size()-1).getValue();

        for(int key : freqMap.keySet()){
            if(freqMap.get(key) == freq)
                freqList.add(key);
        }

        Collections.sort(freqList);

        if(freqList.size() >= 2){
            freqResult = freqList.get(1);
        } else {
            freqResult = freqList.get(0);
        }

        bw.write(String.valueOf(Math.round(sum/list.size()))+"\n");
        bw.write(String.valueOf(list.get(list.size()/2))+"\n");
        bw.write(String.valueOf(freqResult)+"\n");
        bw.write(String.valueOf(list.get(list.size()-1) - list.get(0))+"\n");
        
        br.close();
        bw.flush();
        bw.close();
    }
}