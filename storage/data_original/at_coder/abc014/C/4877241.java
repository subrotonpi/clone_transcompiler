import java.util.*;
public class Main{
public static void main(String[]$) {
Scanner s=new Scanner(System.in);
int n=s.nextInt(),a[]=new int[1000002];
while(--n>a[s.nextInt()]++*a[s.nextInt()+1]--*0);
Arrays.parallelPrefix(a,Integer::sum);
Arrays.sort(a);
System.out.println(a[1000001]);
}
}