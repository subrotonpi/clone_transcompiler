import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.function.BiFunction;

public class Main {
  Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    new Main().run();
  }

  int n, k;
  double[][][] memo;
  boolean[][][] done;

  double dfs(int i, int j, int b) {
    if (j > k) {
      return 0;
    }
    if (i == n) {
      return b;
    }
    if (done[i][j][b]) {
      return memo[i][j][b];
    }
    double p = 0;
    p += ((double) i / (i + 1)) * dfs(i + 1, j, b);
    double l = ((double) 1 / (i + 1)) * dfs(i + 1, j, 0);
    double r = ((double) 1 / (i + 1)) * dfs(i + 1, j + 1, 1);
    p += Math.max(l, r);

    memo[i][j][b] = p;
    done[i][j][b] = true;
    return memo[i][j][b];
  }

  void run() {
    n = ni();
    k = ni();

    memo = new double[n + 1][k + 1][2];
    done = new boolean[n + 1][k + 1][2];

    System.out.println(dfs(0, 0, 0));
  }

  int ni() {
    return Integer.parseInt(sc.next());
  }

  void debug(Object... os) {
    System.err.println(Arrays.deepToString(os));
  }

  class BIT<T> {
    int n;
    ArrayList<T> bit;
    BiFunction<T, T, T> bif;

    BIT(int n, BiFunction<T, T, T> bif, T defaultValue) {
      this.n = n;
      bit = new ArrayList<>(n + 1);
      for (int i = 0; i < n + 1; ++i) {
        bit.add(defaultValue);
      }
      this.bif = bif;
    }

    void update(int i, T v) {
      for (int x = i; x <= n; x += x & -x) {
        bit.set(x, bif.apply(bit.get(x), v));
      }
    }

    T reduce(int i, T defaultValue) {
      T ret = defaultValue;
      for (int x = i; x > 0; x -= x & -x) {
        ret = bif.apply(ret, bit.get(x));
      }
      return ret;
    }
  }

  long MOD = 1_000_000_007;

  long pow(long a, long r) {
    long sum = 1;
    while (r > 0) {
      if ((r & 1) == 1) {
        sum *= a;
        sum %= MOD;
      }
      a *= a;
      a %= MOD;
      r >>= 1;
    }
    return sum;
  }

  long C(int n, int r) {
    long sum = 1;
    for (int i = n; 0 < i; --i) {
      sum *= i;
      sum %= MOD;
    }
    long s = 1;
    for (int i = r; 0 < i; --i) {
      s *= i;
      s %= MOD;
    }
    sum *= pow(s, MOD - 2);
    sum %= MOD;

    long t = 1;
    for (int i = n - r; 0 < i; --i) {
      t *= i;
      t %= MOD;
    }
    sum *= pow(t, MOD - 2);
    sum %= MOD;

    return sum;
  }
}