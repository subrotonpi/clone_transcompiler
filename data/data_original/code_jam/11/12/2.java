import java.util.NavigableSet;
import java.util.Map;
import java.util.Collections;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.math.BigInteger;
import java.util.*;
import java.util.Set;
import java.util.Collection;
import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;
import java.io.*;
import java.util.Iterator;
import java.util.HashSet;
import java.util.Arrays;
import java.util.NoSuchElementException;

/**
 * Generated by Contest helper plug-in
 * Actual solution is at the bottom
 */
public class Main {
	public static void main(String[] args) {
		try {
			System.setIn(new FileInputStream("b.in"));
			System.setOut(new PrintStream(new FileOutputStream("b.out")));
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
		InputReader in = new StreamInputReader(System.in);
		PrintWriter out = new PrintWriter(System.out);
		run(in, out);
	}

	public static void run(InputReader in, PrintWriter out) {
		Solver solver = new TaskB();
		int testCount = in.readInt();
		for (int i = 1; i <= testCount; i++)
			solver.solve(i, in, out);
		Exit.exit(in, out);
	}
}

abstract class InputReader {
	private boolean finished = false;

	public abstract int read();

	public int readInt() {
		int c = read();
		while (isSpaceChar(c))
			c = read();
		int sgn = 1;
		if (c == '-') {
			sgn = -1;
			c = read();
		}
		int res = 0;
		do {
			if (c < '0' || c > '9')
				throw new InputMismatchException();
			res *= 10;
			res += c - '0';
			c = read();
		} while (!isSpaceChar(c));
		return res * sgn;
	}

	public String readString() {
		int c = read();
		while (isSpaceChar(c))
			c = read();
		StringBuffer res = new StringBuffer();
		do {
			res.appendCodePoint(c);
			c = read();
		} while (!isSpaceChar(c));
		return res.toString();
	}

	private boolean isSpaceChar(int c) {
		return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
	}

	public char readCharacter() {
		int c = read();
		while (isSpaceChar(c))
			c = read();
		return (char) c;
	}

	public void setFinished(boolean finished) {
		this.finished = finished;
	}

	public abstract void close();
}

class StreamInputReader extends InputReader {
	private InputStream stream;
	private byte[] buf = new byte[1024];
	private int curChar, numChars;

	public StreamInputReader(InputStream stream) {
		this.stream = stream;
	}

	public int read() {
		if (numChars == -1)
			throw new InputMismatchException();
		if (curChar >= numChars) {
			curChar = 0;
			try {
				numChars = stream.read(buf);
			} catch (IOException e) {
				throw new InputMismatchException();
			}
			if (numChars <= 0)
				return -1;
		}
		return buf[curChar++];
	}

	public void close() {
		try {
			stream.close();
		} catch (IOException ignored) {
		}
	}
}

interface Solver {
	public void solve(int testNumber, InputReader in, PrintWriter out);
}

class Exit {
	private Exit() {
	}

	public static void exit(InputReader in, PrintWriter out) {
		in.setFinished(true);
		in.close();
		out.close();
	}
}

class CollectionUtils {

	public static<T extends Comparable<T>> T maxElement(Iterable<T> collection) {
		T result = null;
		for (T element : collection) {
			if (result == null || result.compareTo(element) < 0)
				result = element;
		}
		return result;
	}

	}

class Pair<U, V> implements Comparable<Pair<U, V>> {
	public final U first;
	public final V second;

	public static<U, V> Pair<U, V> makePair(U first, V second) {
		return new Pair<U, V>(first, second);
	}

	private Pair(U first, V second) {
		this.first = first;
		this.second = second;
	}

	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		Pair pair = (Pair) o;

		return !(first != null ? !first.equals(pair.first) : pair.first != null) && !(second != null ? !second.equals(pair.second) : pair.second != null);

	}

	public int hashCode() {
		int result = first != null ? first.hashCode() : 0;
		result = 31 * result + (second != null ? second.hashCode() : 0);
		return result;
	}

	public String toString() {
		return "(" + first + "," + second + ")";
	}

	public int compareTo(Pair<U, V> o) {
		int value = ((Comparable<U>)first).compareTo(o.first);
		if (value != 0)
			return value;
		return ((Comparable<V>)second).compareTo(o.second);
	}
}

abstract class ReadOnlyIterator<T> implements Iterator<T>  {
	public final void remove() {
		throw new UnsupportedOperationException();
	}
}

class IOUtils {

	public static<T> void printCollection(Iterable<T> collection, PrintWriter out, String delimiter) {
		boolean isFirst = true;
		for (T element : collection) {
			if (isFirst)
				isFirst = false;
			else
				out.print(delimiter);
			out.print(element);
		}
		out.println();
	}

	public static String[] readStringArray(InputReader in, int size) {
		String[] array = new String[size];
		for (int i = 0; i < size; i++)
			array[i] = in.readString();
		return array;
	}

	public static char[] readCharArray(InputReader in, int size) {
		char[] array = new char[size];
		for (int i = 0; i < size; i++)
			array[i] = in.readCharacter();
		return array;
	}

	public static char[][] readTable(InputReader in, int rowCount, int columnCount) {
		char[][] table = new char[rowCount][];
		for (int i = 0; i < rowCount; i++)
			table[i] = readCharArray(in, columnCount);
		return table;
	}

	}

abstract class AbstractSequence<T> implements Sequence<T> {

	public Iterator<T> iterator() {
		return new ReadOnlyIterator<T>() {
			private int index = 0;

			public boolean hasNext() {
				return index != size();
			}

			public T next() {
				if (!hasNext())
					throw new NoSuchElementException();
				return get(index++);
			}
		};
	}

	public String toString() {
		StringWriter writer = new StringWriter();
		IOUtils.printCollection(this, new PrintWriter(writer), ",");
		return "[" + writer.toString().substring(0, writer.toString().length() - 1) + "]";
	}

	}

abstract class AbstractWritableSequence<T> extends AbstractSequence<T> implements WritableSequence<T> {

	}

abstract class ArrayWrapper<T> extends AbstractWritableSequence<T> {

	public static WritableSequence<Integer> wrap(int...array) {
		return new IntArrayWrapper(array);
	}

	protected static class IntArrayWrapper extends ArrayWrapper<Integer> {
		protected final int[] array;

		protected IntArrayWrapper(int[] array) {
			this.array = array;
		}

		public int size() {
			return array.length;
		}

		public Integer get(int index) {
			return array[index];
		}

		}

	}

interface Sequence<T> extends Iterable<T> {
	public int size();
	public T get(int index);
}

class MiscUtils {

	public static<T> boolean equals(T first, T second) {
		return first == null && second == null || first != null && first.equals(second);
	}

	}

class SequenceUtils {
	public static<T> int find(Sequence<T> sequence, T value) {
		int size = sequence.size();
		for (int i = 0; i < size; i++) {
			if (MiscUtils.equals(sequence.get(i), value))
				return i;
		}
		return -1;
	}

	public static<T extends Comparable<T>> int maxIndex(Sequence<T> sequence) {
		return find(sequence, CollectionUtils.maxElement(sequence));
	}

	}

class StringWrapper extends AbstractSequence<Character> {
	private final CharSequence string;

	public static Sequence<Character> wrap(CharSequence string) {
		return new StringWrapper(string);
	}

	private StringWrapper(CharSequence string) {
		this.string = string;
	}

	public int size() {
		return string.length();
	}

	public Character get(int index) {
		return string.charAt(index);
	}
}

interface WritableSequence<T> extends Sequence<T> {
	}

class TaskB implements Solver {
	public void solve(int testNumber, InputReader in, PrintWriter out) {
		System.err.println("Case #" + testNumber);
		int wordCount = in.readInt();
		int orderCount = in.readInt();
		String[] words = IOUtils.readStringArray(in, wordCount);
		boolean[][] contains = new boolean[wordCount][26];
		for (int i = 0; i < wordCount; i++) {
			for (char c : StringWrapper.wrap(words[i]))
				contains[i][c - 'a'] = true;
		}
		char[][] orders = IOUtils.readTable(in, orderCount, 26);
		out.print("Case #" + testNumber + ":");
		for (char[] order : orders) {
			int[] type = new int[wordCount];
			for (int i = 0; i < wordCount; i++)
				type[i] = words[i].length();
			int[] result = new int[wordCount];
			for (char c : order) {
				Set<Integer> nonZero = new HashSet<Integer>();
				Pair<Integer, Integer>[] newType = new Pair[wordCount];
				for (int i = 0; i < wordCount; i++) {
					int mask = 0;
					for (int j = 0; j < words[i].length(); j++) {
						mask <<= 1;
						if (words[i].charAt(j) == c)
							mask++;
					}
					if (mask != 0)
						nonZero.add(type[i]);
					newType[i] = Pair.makePair(type[i], mask);
				}
				for (int i = 0; i < wordCount; i++) {
					if (newType[i].second == 0 && nonZero.contains(newType[i].first))
						result[i]++;
				}
				Map<Pair<Integer, Integer>, Integer> index = new HashMap<Pair<Integer, Integer>, Integer>();
				int typeCount = 0;
				for (Pair<Integer, Integer> t : newType) {
					if (!index.containsKey(t))
						index.put(t, typeCount++);
				}
				for (int i = 0; i < wordCount; i++)
					type[i] = index.get(newType[i]);
			}
			out.print(" " + words[SequenceUtils.maxIndex(ArrayWrapper.wrap(result))]);
		}
		out.println();
	}
}
