import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
    int N = scanner.nextInt();
    int K = scanner.nextInt();
    if(N/2 >= K){
      System.out.println("YES");
    }else{
      System.out.println("NO");
    }
	}
}