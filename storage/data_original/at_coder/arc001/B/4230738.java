import java.io.*;
import java.util.*;
public class Main {
	
	public static void main(String[] args) {
	
		MyScanner sc = new MyScanner();
		int n=sc.nextInt();
		String s=sc.next();
		
		int a[]=new int[4];
		
		//int c=sc.nextInt();
		
		//int l=s.length();
		for(int i=0;i<n;i++) {
			switch(s.charAt(i)){
			case('1'):
				a[0]++;
				break;
			case('2'):
				a[1]++;
				break;
			case('3'):
				a[2]++;
				break;
			case('4'):
				a[3]++;
				break;	
			
			}
		}
		Arrays.sort(a);
		System.out.println(a[3]+" "+a[0]);
	
		
	}	
	
	
	
//----------------------------------------------------------
	static int l_min(int[] a) {
		Arrays.sort(a);
		return a[0];
	}
	static int l_max(int[] a) {
		int l=a.length;
		Arrays.sort(a);
		return a[l-1];
	}
	public static PrintWriter out;

	public static class MyScanner {
		BufferedReader br;
		StringTokenizer st;

		public MyScanner() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}

		String next() {
			while (st == null || !st.hasMoreElements()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			return st.nextToken();
		}

		int nextInt() {
			return Integer.parseInt(next());
		}

		long nextLong() {
			return Long.parseLong(next());
		}

		double nextDouble() {
			return Double.parseDouble(next());
		}

		String nextLine() {
			String str = "";
			try {
				str = br.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
			return str;
		}

	}
	

}