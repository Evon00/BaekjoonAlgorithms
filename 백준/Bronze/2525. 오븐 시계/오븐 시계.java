import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d,e;

        if(b + c >= 60){
            d = (b+c) / 60;
            e = (b+c) % 60;
            if(a + d >= 24) a = a+d-24;
            else a += d;
            System.out.println(a+" "+ e);
        }else{
            System.out.println(a+" "+ (b+c));
        }
        
    }
}