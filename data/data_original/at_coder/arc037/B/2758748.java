import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.StringTokenizer;

public class Main {

	
	static ArrayList<Integer> tree[];
	static BitSet bit;
	static boolean cycle = false;
	static void dfs(int u,int p) {
		if (bit.get(u)) {
			cycle = true;
			return;
		}
		bit.set(u);
		for (Integer v : tree[u]) {
			if (p == v) {
				continue;
			}
			dfs(v,u);
		}
	}
	public static void main(String[]args) throws Throwable {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(), m = sc.nextInt();
		
		tree = new ArrayList[n];
		for (int i = 0 ; i < n ; ++i) {
			tree[i] = new ArrayList();
		}
		bit = new BitSet(n);
		for (int i = 0 ; i < m ; ++i) {
			int u = sc.nextInt() - 1, v = sc.nextInt() - 1;
			tree[u].add(v);
			tree[v].add(u);
		}
		int res = 0;
		for (int i = 0 ; i < n ; ++i) {
			if (bit.get(i)) {
				continue;
			}
			
			cycle = false;
			dfs(i,-1);
			res += (cycle) ? 0 : 1;
		}
		System.out.println(res);
	}
	static class Scanner {
		StringTokenizer st;
		BufferedReader br;

		public Scanner(InputStream s) {
			br = new BufferedReader(new InputStreamReader(s));
		}

		public Scanner(String s) throws FileNotFoundException {
			br = new BufferedReader(new FileReader(new File(s)));
		}

		public String next() throws IOException {
			while (st == null || !st.hasMoreTokens())
				st = new StringTokenizer(br.readLine());
			return st.nextToken();
		}

		public int nextInt() throws IOException {
			return Integer.parseInt(next());
		}

		public long nextLong() throws IOException {
			return Long.parseLong(next());
		}

		public String nextLine() throws IOException {
			return br.readLine();
		}

		public double nextDouble() throws IOException {
			return Double.parseDouble(next());
		}

		public boolean ready() throws IOException {
			return br.ready();
		}
	}
} Note: ./Main.java uses unchecked or unsafe operations.
Note: Recompile with -Xlint:unchecked for details.