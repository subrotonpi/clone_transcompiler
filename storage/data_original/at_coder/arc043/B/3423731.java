import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.StringTokenizer;

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
	static long LINF = 1L << 55;
	static int MOD = 1000000007;
	static int[] mh4 = { 0, -1, 1, 0 };
	static int[] mw4 = { -1, 0, 0, 1 };
	static int[] mh8 = { -1, -1, -1, 0, 0, 1, 1, 1 };
	static int[] mw8 = { -1, 0, 1, -1, 1, -1, 0, 1 };

	static class TaskX {

		public void solve(int testNumber, InputReader in, PrintWriter out) {

			int n = in.nextInt();
			int[] d = in.nextIntArray(n);
			Arrays.sort(d);

			BIT[] bit = new BIT[5];
			for (int i = 0; i < 5; i++) {
				bit[i] = new BIT(100010);
			}

			bit[0].add(1, 1);
			for (int i = 0; i < n; i++) {
				for (int j = 1; j < 5; j++) {
					int v = d[i]/2;
					int u = bit[j-1].sum(v+1);
					bit[j].add(d[i]+1, u);
				}
			}

			out.println(bit[4].sum(100001) % MOD);
		}
	}

	/**
	 * 1-indexed BinaryIndexTree
	 * */
	public static class BIT {

		// [1, n]
		int n;
		int[] bit;

		public BIT(int n) {
			this.n = n;
			bit = new int[n + 1];
		}

		// index??v???
		public void add(int i, int v) {
			for (int x = i; x < n + 1; x += x & -x) {
				bit[x] += v;
				bit[x] %= MOD;
			}
		}

		// ??? [1, v] ????
		// v[1] + ... + v[i]
		public int sum(int i) {
			int ret = 0;
			for (int x = i; x > 0; x -= x & -x) {
				ret += bit[x] % MOD;
				ret %= MOD;
			}
			return ret % MOD;
		}

		// ??? [i, j] = [1, j] - [1, i-1]????
		// v[i] + ... + v[j]
		public int query(int i, int j) {
			return sum(j) - sum(i - 1);
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

		public int[] nextIntArrayDec(int n) {
			int[] res = new int[n];
			for (int i = 0; i < n; i++) {
				res[i] = nextInt() - 1;
			}
			return res;
		}

		public int[] nextIntArray1Index(int n) {
			int[] res = new int[n + 1];
			for (int i = 0; i < n; i++) {
				res[i + 1] = nextInt();
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

		public long[] nextLongArrayDec(int n) {
			long[] res = new long[n];
			for (int i = 0; i < n; i++) {
				res[i] = nextLong() - 1;
			}
			return res;
		}

		public long[] nextLongArray1Index(int n) {
			long[] res = new long[n + 1];
			for (int i = 0; i < n; i++) {
				res[i + 1] = nextLong();
			}
			return res;
		}

		public double[] nextDoubleArray(int n) {
			double[] res = new double[n];
			for (int i = 0; i < n; i++) {
				res[i] = nextDouble();
			}
			return res;
		}

		public InputReader(InputStream inputStream) {
			in = new BufferedReader(new InputStreamReader(inputStream));
			tok = new StringTokenizer("");
		}
	}

}