import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] abc = new int[3];
		for (int i = 0; i < 3; i++) {
			abc[i] = sc.nextInt();
		}
		Arrays.sort(abc);
		System.out.println(abc[1]);
	}
}