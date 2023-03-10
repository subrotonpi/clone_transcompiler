import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.IntStream;

public class Main {

	public static void main(String[] args) throws IOException {
		new Main().solve();
	}

	private void solve() throws IOException {
		try {
			//			solveA();
			//			solveB();
			solveC();
			//			 solveD();
			//			 solveE();
			//			 solveF();
		} finally {
			if (in != null) {
				in.close();
			}
			if (out != null) {
				out.flush();
				out.close();
			}
		}

	}

	private void solveA() {
		int numR = nextInt();
		int numG = nextInt();

		out.println(numG * 2 - numR);
	}

	private void solveB() {
		final int numN = nextInt();
		final int numK = nextInt();

		int res = IntStream.range(0, numN).reduce(1, (sum, i) -> {
			if (sum * 2 > sum + numK) {
				sum += numK;
			} else {
				sum *= 2;
			}
			return sum;
		});

		out.println(res);
	}

	private void solveC() {
		char[] strS = next().toCharArray();
		char[] strT = next().toCharArray();

		if (strS.length < strT.length) {
			out.println("UNRESTORABLE");
			return;
		}

		List<String> memo = new ArrayList<String>();

		int resT = chkC(strS, strT, 0, memo);

		Collections.sort(memo);
		out.println(resT > 0 ? memo.get(0) : "UNRESTORABLE");
	}

	private int chkC(char[] strS, char[] strT, int indexS, List<String> memo) {
		if (indexS + strT.length > strS.length) {
			return 0;
		}

		int res = 0;

		int cntT = 0;
		boolean isMatch = false;

		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < strS.length; i++) {

			if (i < indexS || i >= indexS + strT.length) {
				builder.append(strS[i]);
			} else {
				if (strT[cntT] == strS[i] || strS[i] == '?') {
					builder.append(strT[cntT]);
					cntT++;
				} else {
					builder.append(strS[i]);
				}
			}
		}

		isMatch = (cntT == strT.length);
		if (isMatch) {
			memo.add(builder.toString().replace("?", "a"));
			res += chkC(strS, strT, indexS + 1, memo) + 1;
		} else {
			//?????indexS?????
			res += chkC(strS, strT, indexS + 1, memo);
		}

		return res;
	}

	private void solveD() {
		int numN = nextInt();

		out.println("");
	}

	private void solveE() {
		int numN = nextInt();

		out.println("");
	}

	private void solveF() {
		int numN = nextInt();

		out.println("");
	}

	private final PrintWriter out = new PrintWriter(System.out);
	private final InputStream in = System.in;
	private final byte[] buffer = new byte[1024];
	private int ptr = 0;
	private int buflen = 0;

	private boolean hasNextByte() {
		if (ptr < buflen) {
			return true;
		} else {
			ptr = 0;
			try {
				buflen = in.read(buffer);
			} catch (IOException e) {
				e.printStackTrace();
			}
			if (buflen <= 0) {
				return false;
			}
		}
		return true;
	}

	private int readByte() {
		if (hasNextByte())
			return buffer[ptr++];
		else
			return -1;
	}

	private static boolean isPrintableChar(int c) {
		return 33 <= c && c <= 126;
	}

	private void skipUnprintable() {
		while (hasNextByte() && !isPrintableChar(buffer[ptr]))
			ptr++;
	}

	public boolean hasNext() {
		skipUnprintable();
		return hasNextByte();
	}

	public int nextInt() {
		return Integer.parseInt(next());
	}

	public String next() {
		if (!hasNext())
			throw new NoSuchElementException();
		StringBuilder sb = new StringBuilder();
		int b = readByte();
		while (isPrintableChar(b)) {
			sb.appendCodePoint(b);
			b = readByte();
		}
		return sb.toString();
	}

	public long nextLong() {
		if (!hasNext())
			throw new NoSuchElementException();
		long n = 0;
		boolean minus = false;
		int b = readByte();
		if (b == '-') {
			minus = true;
			b = readByte();
		}
		if (b < '0' || '9' < b) {
			throw new NumberFormatException();
		}
		while (true) {
			if ('0' <= b && b <= '9') {
				n *= 10;
				n += b - '0';
			} else if (b == -1 || !isPrintableChar(b)) {
				return minus ? -n : n;
			} else {
				throw new NumberFormatException();
			}
			b = readByte();
		}
	}
}