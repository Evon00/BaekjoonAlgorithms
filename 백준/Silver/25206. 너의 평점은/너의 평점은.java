import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        HashMap<String, Double> credit = new HashMap<>();
        StringTokenizer st;
        double avgGrade = 0.0;
        double allSubject = 0.0;
        
        credit.put("A+",4.5);
        credit.put("A0",4.0);
        credit.put("B+",3.5);
        credit.put("B0",3.0);
        credit.put("C+",2.5);
        credit.put("C0",2.0);
        credit.put("D+",1.5);
        credit.put("D0",1.0);
        credit.put("F",0.0);
        
        for(int i = 0; i < 20; i++){
            String line = br.readLine();
            if(line != null){
                st = new StringTokenizer(line," ");
                String subject = st.nextToken();
                double subjectCredit = Double.parseDouble(st.nextToken());
                String grade = st.nextToken();
                if(grade.equals("P"))
                    continue;
                avgGrade += subjectCredit * credit.get(grade);
                allSubject += subjectCredit;
            }
        }
        
        bw.write(String.valueOf(avgGrade/allSubject));
        
        br.close();
        bw.flush();
        bw.close();
    }
}