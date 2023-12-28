import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalPrice = scanner.nextInt();
        int type = scanner.nextInt();
        int result = 0;
        
        for(int i = 0; i < type; i++){
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            result += (a * b);
        }
        if(totalPrice == result)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}