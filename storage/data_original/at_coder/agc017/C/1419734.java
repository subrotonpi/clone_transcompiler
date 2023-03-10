import java.io.IOException;
import java.io.InputStream;
import java.util.NoSuchElementException;


public class Main {
  public static void main(String[] args) {
    FastScanner sc = new FastScanner();
    int N = sc.nextInt();
    int M = sc.nextInt();
    
    int[] A = sc.nextIntList(N);
    int[][] query = sc.nextIntTable(M,  2);

    int[] bucket = new int[N + 1];
    for (int v : A) {
      bucket[v] ++;
    }
    // [v - bucket[v], v]
    
    int OFFSET = 1000000;
    int[] array = new int[OFFSET + N + 1];
    for (int i = 1; i <= N; i ++) {
      int left = OFFSET + i - bucket[i] + 1;
      int right = OFFSET + i;
      for (int j = left; j <= right; j ++) {
        array[j] ++;
      }
    }
    
    int now = 0;
    for (int i = 1; i <= N; i ++) {
      if (array[OFFSET + i] == 0) now ++;
    }
    
    for (int[] q : query) {
      int i = A[q[0] - 1];
      int j = q[1];
      if (i != j) {
        int leftI = OFFSET + i - bucket[i] + 1;
        int leftJ = OFFSET + j - bucket[j];
        A[q[0] - 1] = q[1];
  
        array[leftI] --;
        array[leftJ] ++;
        bucket[i] --;
        bucket[j] ++;
        if (leftI != leftJ) {
          if (leftI > OFFSET && array[leftI] == 0) {
            now ++;
          }
          if (leftJ > OFFSET && array[leftJ] == 1) {
            now --;
          }
        }
      }
      System.out.println(now);
    }
  }

}


class FastScanner {
	public static String debug = null;

	private final InputStream in = System.in;
	private int ptr = 0;
	private int buflen = 0;
	private byte[] buffer = new byte[1024];
	private boolean eos = false;

	private boolean hasNextByte() {
		if (ptr < buflen) {
			return true;
		} else {
			ptr = 0;
			try {
				if (debug != null) {
					buflen = debug.length();
					buffer = debug.getBytes();
					debug = "";
					eos = true;
				} else {
					buflen = in.read(buffer);
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
			if (buflen < 0) {
				eos = true;
				return false;
			} else if (buflen == 0) {
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

	public boolean isEOS() {
		return this.eos;
	}

	public boolean hasNext() {
		skipUnprintable();
		return hasNextByte();
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

	public int nextInt() {
		return (int) nextLong();
	}

	public long[] nextLongList(int n) {
		return nextLongTable(1, n)[0];
	}

	public int[] nextIntList(int n) {
		return nextIntTable(1, n)[0];
	}

	public long[][] nextLongTable(int n, int m) {
		long[][] ret = new long[n][m];
		for (int i = 0; i < n; i ++) {
			for (int j = 0; j < m; j ++) {
				ret[i][j] = nextLong();
			}
		}
		return ret;
	}

	public int[][] nextIntTable(int n, int m) {
		int[][] ret = new int[n][m];
		for (int i = 0; i < n; i ++) {
			for (int j = 0; j < m; j ++) {
				ret[i][j] = nextInt();
			}
		}
		return ret;
	}
}