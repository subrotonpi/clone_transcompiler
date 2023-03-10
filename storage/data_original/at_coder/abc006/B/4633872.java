import java.util.Scanner;

public class Main {
	static long N;
	static long ans;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n+3];
		a[1] = 0;
		a[2] = 0;
		a[3] = 1;
		for (int i = 4; i<=n; i++) {
			a[i] = (a[i-3] + a[i-2] + a[i-1]) % 10007;
		}
		System.out.println(a[n]);
	}
}