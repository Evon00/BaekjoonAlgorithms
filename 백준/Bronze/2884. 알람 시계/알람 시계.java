import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if(b - 45 >= 0){
            System.out.println(a+" "+(b-45));
        }
        else{
            if(a-1 < 0) a =23;
            else a -= 1;
            System.out.println(a +" "+(b+60-45));
        }
        
    }
}