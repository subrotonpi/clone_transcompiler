import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a % 3 == 0 || b % 3 == 0 || (a + b) % 3 == 0) {
            System.out.println("Possible");
            return;
        }
        System.out.println("Impossible");
    }

}