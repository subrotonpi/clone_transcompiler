import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.NoSuchElementException;

public class Main {
	int N;
	long[] a;

	public void solve() {
		N = nextInt();
		a = new long[N];
		for (int i = 0; i < N; i++) {
			a[i] = nextInt();
		}

		long ans = Long.MAX_VALUE;

		// even
		{
			long sum = 0;
			long cnt = 0;
			for (int i = 0; i < N; i++) {
				sum += a[i];
				if (i % 2 == 0) {
					if (sum <= 0) {
						cnt += 1 - sum;
						sum = 1;
					}
				} else {
					if (sum >= 0) {
						cnt += 1 + sum;
						sum = -1;
					}
				}
			}

			ans = Math.min(ans, cnt);
		}

		//odd
		{
			long sum = 0;
			long cnt = 0;
			for (int i = 0; i < N; i++) {
				sum += a[i];
				if (i % 2 == 1) {
					if (sum <= 0) {
						cnt += 1 - sum;
						sum = 1;
					}
				} else {
					if (sum >= 0) {
						cnt += 1 + sum;
						sum = -1;
					}
				}
			}
			ans = Math.min(ans, cnt);
		}

		out.println(ans);
	}

	public static void main(String[] args) {
		out.flush();
		new Main().solve();
		out.close();
	}

	/* Input */
	private static final InputStream in = System.in;
	private static final PrintWriter out = new PrintWriter(System.out);
	private final byte[] buffer = new byte[2048];
	private int p = 0;
	private int buflen = 0;

	private boolean hasNextByte() {
		if (p < buflen)
			return true;
		p = 0;
		try {
			buflen = in.read(buffer);
		} catch (IOException e) {
			e.printStackTrace();
		}
		if (buflen <= 0)
			return false;
		return true;
	}

	public boolean hasNext() {
		while (hasNextByte() && !isPrint(buffer[p])) {
			p++;
		}
		return hasNextByte();
	}

	private boolean isPrint(int ch) {
		if (ch >= '!' && ch <= '~')
			return true;
		return false;
	}

	private int nextByte() {
		if (!hasNextByte())
			return -1;
		return buffer[p++];
	}

	public String next() {
		if (!hasNext())
			throw new NoSuchElementException();
		StringBuilder sb = new StringBuilder();
		int b = -1;
		while (isPrint((b = nextByte()))) {
			sb.appendCodePoint(b);
		}
		return sb.toString();
	}

	public int nextInt() {
		return Integer.parseInt(next());
	}

	public long nextLong() {
		return Long.parseLong(next());
	}

	public double nextDouble() {
		return Double.parseDouble(next());
	}
}