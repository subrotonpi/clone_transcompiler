import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main implements Runnable {
	public static void main(String[] args) throws FileNotFoundException {
		new Main().run2();
	}

	long[] f;
	long INF = Integer.MAX_VALUE / 10;
	// f[i][0]={w[i],#?}?col[i]=?
	// f[i][1]={#?,w[i]}?col[i]=?

	void dfs(int cur, int par, ArrayList<Integer>[] g, int[] x) {
		f[cur] = 0;
		long base = 0;
		ArrayList<Long> add = new ArrayList<>();
		for (int dst : g[cur]) {
			if (dst == par) {
				continue;
			}
			dfs(dst, cur, g, x);
			if (Math.max(f[dst], x[dst]) == INF) {
				f[cur] = INF;
				return;
			}
			base += Math.min(x[dst], f[dst]);
			add.add(Math.max(x[dst], f[dst]) - Math.min(x[dst], f[dst]));
		}
		if (base > x[cur]) {
			f[cur] = INF;
			return;
		}
		boolean[] h = new boolean[(int) (x[cur] - base + 1)];
		h[0] = true;
		int sum = 0;
		int max = 0;
		for (long v : add) {
			sum += v;
			for (int i = h.length - 1; i >= 0; --i) {
				if (i + v >= h.length)
					continue;
				h[(int) (i + v)] |= h[i];
			}
		}
		for (int i = 0; i < h.length; ++i) {
			if (h[i])
				max = Math.max(max, i);
		}
		if (base > x[cur]) {
			f[cur] = INF;
			return;
		}
		f[cur] = base + (sum - max);
	}

	// f[i][0]={w[i],#?}?col[i]=?
	// f[i][1]={#?,w[i]}?col[i]=?

	String solve(int n, int[] p, int[] x) {
		ArrayList<Integer>[] g = new ArrayList[n];
		for (int i = 0; i < n; ++i)
			g[i] = new ArrayList<>();
		for (int i = 1; i < n; ++i) {
			g[i].add(p[i]);
			g[p[i]].add(i);
		}
		f = new long[n];
		Arrays.fill(f, INF);
		dfs(0, -1, g, x);
		if (f[0] < INF) {
			return "POSSIBLE";
		} else {
			return "IMPOSSIBLE";
		}
	}

	public void run() {
		new Thread(null, new Main(), "", Runtime.getRuntime().maxMemory()).start();
	}

	void run2() {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] p = new int[n];
		int[] x = new int[n];
		for (int i = 1; i < n; ++i) {
			p[i] = sc.nextInt();
			--p[i];
		}
		for (int i = 0; i < n; ++i) {
			x[i] = sc.nextInt();
		}
		System.out.println(solve(n, p, x));
	}
}

class GenerateTree {
	int n;
	ArrayList<Integer>[] g;
	int[] a;
	int[] b;
	int[] parent;
	int root = 0;

	public GenerateTree() {

		n = (int) (Math.random() * 10) + 2;
		g = new ArrayList[n];
		for (int i = 0; i < n; ++i)
			g[i] = new ArrayList<>();
		a = new int[n];
		b = new int[n];
		DJSet ds = new DJSet(n);
		for (int i = 0; i < n - 1; ++i) {
			while (true) {
				int x = (int) (Math.random() * n);
				int y = (int) (Math.random() * n);
				if (ds.equiv(x, y)) {
					continue;
				} else {
					a[i] = x;
					b[i] = y;
					ds.setUnion(x, y);
					g[x].add(y);
					g[y].add(x);
					break;
				}
			}
		}
		parent = new int[n];
		dfs(g, root, -1, parent);

	}

	void dfs(ArrayList<Integer>[] g, int cur, int par, int[] parent) {
		parent[cur] = par;
		for (int dst : g[cur]) {
			if (dst == par)
				continue;
			dfs(g, dst, cur, parent);
		}
	}

	static void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}

	class DJSet {
		int n;
		int[] upper;

		public DJSet(int n_) {
			n = n_;
			upper = new int[n];
			Arrays.fill(upper, -1);
		}

		boolean equiv(int x, int y) {
			return root(x) == root(y);
		}

		int root(int x) {
			return upper[x] < 0 ? x : (upper[x] = root(upper[x]));
		}

		void setUnion(int x, int y) {
			x = root(x);
			y = root(y);
			if (upper[x] < upper[y]) {
				int d = x;
				x = y;
				y = d;
			}
			upper[y] += upper[x];
			upper[x] = y;
		}
	}

} Note: ./Main.java uses unchecked or unsafe operations.
Note: Recompile with -Xlint:unchecked for details.