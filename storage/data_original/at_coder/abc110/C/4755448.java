import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String t = sc.nextLine();
		String ans="Yes";
		for(int i = 0; i < s.length(); i++)
			//????????????????????????????????
			//?1??2???????????3???????????????s1,s2???????????????????
			if(s.indexOf(s.charAt(i), i+1) != t.indexOf(t.charAt(i), i+1)) {
				ans="No";break;
			};
		System.out.println(ans);
	}
}