import java.util.Arrays;
import java.util.Scanner;
public class Main{
	public static void main(String[]args){
	Scanner scan=new Scanner(System.in);
	int a=scan.nextInt();
	long w=0,h=0;
	int d[]=new int[a];
	int e[]=new int[a];
	int count=0;
	for(int i=0;i<a;i++) {
		d[i]=scan.nextInt();
	}
	Arrays.sort(d);
	for(int i=0;i<a;i++) {
		e[i]=d[a-i-1];
	}
	for(int i=1;i<a;i++) {
		if(e[i]==e[i-1]) {
			i++;
			if(count==0) {
				w=e[i-1];
				count++;
			}
			else {
				h=e[i-1];
				break;
			}
		}
	}
	System.out.println(w*h);
	}
}