import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int result = 0;

        if (a == b && b == c) {
            result = 10000 + (a * 1000);
        } else if (a == b || b == c || a == c) {
            int sameNumber = (a == b) ? a : (b == c) ? b : c;
            result = 1000 + (sameNumber * 100);
        } else {
            int maxNumber = (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);
            result = maxNumber * 100;
        }

        System.out.println(result);
        }
}