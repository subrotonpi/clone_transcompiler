//

import java.util.*;

class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {

//		int n = sc.nextInt();
//		int m = sc.nextInt();

//		int a = sc.nextInt();
//		int b = sc.nextInt();

//		int x = sc.nextInt();
//		int a = sc.nextInt(); int b = sc.nextInt();
//		int a = sc.nextInt(); int b = sc.nextInt(); int c = sc.nextInt();
//		int a = sc.nextInt(); int b = sc.nextInt(); int c = sc.nextInt(); int d = sc.nextInt();

		String s = sc.next();
		int ans = 700;
		
		for (int i=0; i<s.length(); i++) {
			if (s.charAt(i) == 'o') ans += 100;
		}
		
		System.out.println(ans);

	}
}