import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) throws IOException {
		InputStream inputStream = System.in;
		OutputStream outputStream = System.out;
		InputReader in = new InputReader(inputStream);
		PrintWriter out = new PrintWriter(outputStream);
		TaskX solver = new TaskX();
		solver.solve(1, in, out);
		out.close();
	}

	static int INF = 1 << 30;
	static int MOD = 1000000007;
	static int[] mh4 = { 0, -1, 1, 0 };
	static int[] mw4 = { -1, 0, 0, 1 };
	static int[] mh8 = { -1, -1, -1, 0, 0, 1, 1, 1 };
	static int[] mw8 = { -1, 0, 1, -1, 1, -1, 0, 1 };

	@SuppressWarnings("unchecked")
	static class TaskX {

		int n;
		List<Integer>[] g, tmp;
		long[][] memo;
		boolean[] used;
		public void solve(int testNumber, InputReader in, PrintWriter out) {

			n = in.nextInt();
			g = new ArrayList[n];
			g = Stream.generate(ArrayList::new).limit(n).toArray(List[]::new);
			tmp = new ArrayList[n];
			tmp = Stream.generate(ArrayList::new).limit(n).toArray(List[]::new);

			for (int i = 0; i < n-1; i++) {
				int a = in.nextInt()-1, b = in.nextInt()-1;
				tmp[a].add(b);
				tmp[b].add(a);
			}

			memo = new long[n][2];
			for (int i = 0; i < n; i++) {
				Arrays.fill(memo[i], -1);
			}

			bfs(0);

			out.println((rec(0, 0) + rec(0, 1)) % MOD);
		}

		void bfs(int start) {
			boolean[] used = new boolean[n];
			Queue<Integer> q = new ArrayDeque<>();

			used[start] = true;
			q.add(start);

			while (!q.isEmpty()) {
				int now = q.remove();
				for (int to : tmp[now]) {
					if (used[to]) continue;
					g[now].add(to);
					q.add(to);
					used[to] = true;
				}
			}

		}

		long rec(int now, int color) {

			if (memo[now][color] >= 0) {
				return memo[now][color];
			}

			long ret = 1;
			for (int to : g[now]) {
				if (color == 1) {
					ret = (ret * (rec(to, 0) % MOD + rec(to, 1) % MOD)) % MOD;
				} else if (color == 0) {
					ret = (ret * rec(to, 1) % MOD) % MOD;
				}
			}

			return memo[now][color] = ret % MOD;
		}
	}

	static class InputReader {
		BufferedReader in;
		StringTokenizer tok;

		public String nextString() {
			while (!tok.hasMoreTokens()) {
				try {
					tok = new StringTokenizer(in.readLine(), " ");
				} catch (IOException e) {
					throw new InputMismatchException();
				}
			}
			return tok.nextToken();
		}

		public int nextInt() {
			return Integer.parseInt(nextString());
		}

		public long nextLong() {
			return Long.parseLong(nextString());
		}

		public double nextDouble() {
			return Double.parseDouble(nextString());
		}

		public int[] nextIntArray(int n) {
			int[] res = new int[n];
			for (int i = 0; i < n; i++) {
				res[i] = nextInt();
			}
			return res;
		}

		public long[] nextLongArray(int n) {
			long[] res = new long[n];
			for (int i = 0; i < n; i++) {
				res[i] = nextLong();
			}
			return res;
		}

		public InputReader(InputStream inputStream) {
			in = new BufferedReader(new InputStreamReader(inputStream));
			tok = new StringTokenizer("");
		}
	}

}