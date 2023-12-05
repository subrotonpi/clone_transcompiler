import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;

public class Main implements Runnable{

	public static void main(String[] args) {
		Thread.setDefaultUncaughtExceptionHandler((t,e) -> System.exit(1));
		new Thread(null, new Main(), "", 1024L * 1024L * 64).start();
	}

	@Override
	public void run() {
		System.out.println(solve() ? "YES" : "NO");
	}
	
	public boolean solve() {
		IO io = new IO();
		int n = io.nextInt();
		long[] a = io.nextLongArray(n);
		if (n == 2) {
			return a[0] == a[1];
		}
		ArrayList<Integer>[] t = new ArrayList[n];
		for(int i=0;i<n;i++) {
			t[i] = new ArrayList<>();
		}
		for(int i=0;i<n-1;i++) {
			int u = io.nextInt() - 1;
			int v = io.nextInt() - 1;
			t[u].add(v);
			t[v].add(u);
		}
		for(int i=0;i<n;i++) {
			if (t[i].size() >= 2) {
				try {
					return dfs(-1,i,t,a) == 0;
				} catch(FailedException e) {
					return false;
				}
			}
		}
		throw new RuntimeException("unreachable");
	}
	
	public long dfs(int p,int v,ArrayList<Integer>[] t,long[] a) {
		if (t[v].size() == 1) {
			return a[v];
		}
		long sum = 0;
		long max = 0;
		
		for(int u:t[v]) {
			if (u == p) continue;
			long x = dfs(v,u,t,a);
			sum += x; 
			max = Math.max(max, x);
		}
		long nGamma = sum - a[v];
		if (nGamma < 0) {
			throw new FailedException();
		}
		long nI = a[v] - nGamma;
		if (nI < 0) {
			throw new FailedException();
		}
		if (max - nI > sum - max) {
			throw new FailedException();
		}
		return nI;
	}
}
class FailedException extends RuntimeException {
	
}
class IO extends PrintWriter {
	private final InputStream in;
	private final byte[] buffer = new byte[1024];
	private int ptr = 0;
	private int buflen = 0;
	
	public IO() { this(System.in);}
	public IO(InputStream source) { super(System.out); this.in = source;}
	private boolean hasNextByte() {
		if (ptr < buflen) {
			return true;
		}else{
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
	private int readByte() { if (hasNextByte()) return buffer[ptr++]; else return -1;}
	private static boolean isPrintableChar(int c) { return 33 <= c && c <= 126;}
	private static boolean isNewLine(int c) { return c == '\n' || c == '\r';}
	public boolean hasNext() { while(hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++; return hasNextByte();}
	public boolean hasNextLine() { while(hasNextByte() && isNewLine(buffer[ptr])) ptr++; return hasNextByte();}
	public String next() {
		if (!hasNext()) {
			throw new NoSuchElementException();
		}
		StringBuilder sb = new StringBuilder();
		int b = readByte();
		while(isPrintableChar(b)) {
			sb.appendCodePoint(b);
			b = readByte();
		}
		return sb.toString();
	}
	public char[] nextCharArray(int len) {
		if (!hasNext()) {
			throw new NoSuchElementException();
		}
		char[] s = new char[len];
		int i = 0;
		int b = readByte();
		while(isPrintableChar(b)) {
			if (i == len) {
				throw new InputMismatchException();
			}
			s[i++] = (char) b;
			b = readByte();
		}
		return s;
	}
	public String nextLine() {
		if (!hasNextLine()) {
			throw new NoSuchElementException();
		}
		StringBuilder sb = new StringBuilder();
		int b = readByte();
		while(!isNewLine(b)) {
			sb.appendCodePoint(b);
			b = readByte();
		}
		return sb.toString();
	}
	public long nextLong() {
		if (!hasNext()) {
			throw new NoSuchElementException();
		}
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
		while(true){
			if ('0' <= b && b <= '9') {
				n *= 10;
				n += b - '0';
			}else if(b == -1 || !isPrintableChar(b)){
				return minus ? -n : n;
			}else{
				throw new NumberFormatException();
			}
			b = readByte();
		}
	}
	public int nextInt() {
		long nl = nextLong();
		if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE) {
			throw new NumberFormatException();
		}
		return (int) nl;
	}
	public char nextChar() {
		if (!hasNext()) {
			throw new NoSuchElementException();
		}
		return (char) readByte();
	}
	public double nextDouble() { return Double.parseDouble(next());}
	public int[] nextIntArray(int n) { int[] a = new int[n]; for(int i=0;i<n;i++) a[i] = nextInt(); return a;}
	public long[] nextLongArray(int n) { long[] a = new long[n]; for(int i=0;i<n;i++) a[i] = nextLong(); return a;}
	public double[] nextDoubleArray(int n) { double[] a = new double[n]; for(int i=0;i<n;i++) a[i] = nextDouble(); return a;}
	public void nextIntArrays(int[]... a) { for(int i=0;i<a[0].length;i++) for(int j=0;j<a.length;j++) a[j][i] = nextInt();}
	public int[][] nextIntMatrix(int n,int m) { int[][] a = new int[n][]; for(int i=0;i<n;i++) a[i] = nextIntArray(m); return a;}
	public char[][] nextCharMap(int n,int m) { char[][] a = new char[n][]; for(int i=0;i<n;i++) a[i] = nextCharArray(m); return a;}
	public void close() { super.close(); try {in.close();} catch (IOException e) {}}
} Note: ./Main.java uses unchecked or unsafe operations.
Note: Recompile with -Xlint:unchecked for details.