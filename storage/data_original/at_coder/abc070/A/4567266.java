import java.io.PrintWriter;
import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		//String S = sc.next();
		//int N = Integer.parseInt(sc.next());
		//out.println();
		// ArrayList<String> list = new ArrayList<String>();
		// list.stream().sorted().distinct();
		String S = sc.next();
		if(S.charAt(0)==S.charAt(2)){
			out.println("Yes");
		}else{
			out.println("No");
		}
		out.flush();	
	}
}