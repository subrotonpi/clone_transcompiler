import java.util.*;
import java.util.stream.*;
import static java.lang.System.*;

class Main {
	static Scanner sc = new Scanner(System.in);
	static int nextInt () {return Integer.parseInt(sc.next());}
	static int[] nextIntArray (int n) {return IntStream.range(0,n).map(i->nextInt()).toArray();}
	static int max (int... ar) {Arrays.sort(ar);return ar[ar.length-1];}
	static int min (int... ar) {Arrays.sort(ar);return ar[0];}
	static String yesno (boolean b) {return b?"Yes":"No";}
	static int maxInt = Integer.MAX_VALUE;
	static int minInt = Integer.MIN_VALUE;
	
	public static void main(String[] args) {
		
		String s = sc.next();
		int n = s.length();
		int enemyP = 0, enemyG = 0;
		
		for (int i=0; i<n; i++) {
			if (s.charAt(i) == 'p') enemyP++;
			else enemyG++;
		}
		
		System.out.println(n/2 - enemyP);
		
		
		
	}
}