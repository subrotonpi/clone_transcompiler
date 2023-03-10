import java.io.*;
import java.util.*;
import java.util.function.BiFunction;

public class Main {
  private static boolean debug = false;
  private static boolean elapsed = false;

  private static PrintWriter _err = new PrintWriter(System.err);

  private int N;
  private List<Pair> boxList = new ArrayList<>();

  private void solve(Scanner sc, PrintWriter out) {
    N = sc.nextInt();

    int maxW = Integer.MIN_VALUE;
    for (int i = 0; i < N; ++i) {
      int w = sc.nextInt();
      int h = sc.nextInt();

      boxList.add(new Pair(w, h));
      maxW = Math.max(maxW, w);
    }
    Collections.sort(boxList, (a, b) -> {
      if (a.b == b.b) {
        return b.a - a.a;
      } else {
        return a.b - b.b;
      }
    });

    BIT<Integer> bit = new BIT<>(maxW, Integer::max, 0);
    int[] dp = new int[N];
    int max = 0;
    for (int i = 0; i < N; ++i) {
      Pair box = boxList.get(i);
      dp[i] = bit.reduce(box.a - 1, 0) + 1;
      bit.update(box.a, dp[i]);
      max = Math.max(max, dp[i]);
    }
    out.println(max);
  }
  private long C(long n, long r) {
    long res = 1;
    for (long i = n; i > n - r; --i) {
      res *= i;
    }
    for (long i = r; i > 1; --i) {
      res /= i;
    }
    return res;
  }
  private long P(long n, long r) {
    long res = 1;
    for (long i = n; i > n - r; --i) {
      res *= i;
    }
    return res;
  }
  private long ceil2pow(long n) {
    if (n == 0) {
      return 1;
    }
    n--;
    n |= (n >>> 1);
    n |= (n >>> 2);
    n |= (n >>> 4);
    n |= (n >>> 8);
    n |= (n >>> 16);
    n++;
    return n;
  }
  private static class BIT<T> {
    int n;
    List<T> bit;
    BiFunction<T, T, T> bif;
 
    public BIT(int n, BiFunction<T, T, T> bif, T defaultValue) {
      this.n = n;
      bit = new ArrayList<>(n + 1);
      for (int i = 0; i < n + 1; ++i) {
        bit.add(defaultValue);
      }
      this.bif = bif;
    }
 
    public void update(int i, T v) {
      for (int x = i; x <= n; x += x & -x) {
        bit.set(x, bif.apply(bit.get(x), v));
      }
    }
 
    public T reduce(int i, T defaultValue) {
      T ret = defaultValue;
      for (int x = i; x > 0; x -= x & -x) {
        ret = bif.apply(ret, bit.get(x));
      }
      return ret;
    }
  }
  private static class Pair {
    int a;
    int b;
    public Pair(int a, int b) {
      this.a = a;
      this.b = b;
    }
    public String toString() {
      return "[" + a + ", " + b + "]";
    }
  }
  /*
   * 10^10 > Integer.MAX_VALUE = 2147483647 > 10^9
   * 10^19 > Long.MAX_VALUE = 9223372036854775807L > 10^18
   */
  public static void main(String[] args) {
    long S = System.currentTimeMillis();

    Scanner sc = new Scanner(System.in);
    PrintWriter out = new PrintWriter(System.out);
    new Main().solve(sc, out);
    out.flush();

    long G = System.currentTimeMillis();
    if (elapsed) {
      _err.println((G - S) + "ms");
    }
    _err.flush();
  }
}