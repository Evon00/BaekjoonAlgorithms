import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int count = number / 4;

        for(int i = 0; i < count; i++){
            System.out.print("long ");
        }
        System.out.println("int");
    }
}