import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = Math.abs(sc.nextInt());
		int b = Math.abs(sc.nextInt());
		if (a < b) {
			System.out.println("Ant");
		} else if (a > b) {
			System.out.println("Bug");
		} else {
			System.out.println("Draw");
		}
	}
}