import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.StringTokenizer;

public class Main {

    static int N, X;
    static int[] H;
    static int[] A, B;

    public static void main(String[] args) {
        FastScanner fc = new FastScanner(System.in);
        N = fc.nextInt();
        X = fc.nextInt() - 1;
        H = fc.nextIntArray(N);
        A = new int[N-1];
        B = new int[N-1];
        for (int i = 0; i < N-1; i++) {
            A[i] = fc.nextInt() - 1;
            B[i] = fc.nextInt() - 1;
        }
        System.out.println(solve());
    }

    static int solve() {
        int[][] G = adjB(N, A, B);
        return dfs(-1, X, G).orElse(0);
    }

    static Optional<Integer> dfs(int parent, int node, int[][] G) {
        Optional<Integer> ret = Optional.empty();
        for (int next : G[node]) {
            if( next == parent ) continue;

            ret = orPlus(dfs(node, next, G).map(i -> i+2), ret);
        }
        if( H[node] > 0 ) {
            ret = orPlus(Optional.of(0), ret);
        }
        return ret;
    }

    static Optional<Integer> orPlus(Optional<Integer> a, Optional<Integer> b) {
        if( a.isPresent() && b.isPresent() ) {
            return Optional.of( a.get() + b.get() );
        } else if( a.isPresent() ) {
            return a;
        } else if( b.isPresent() ) {
            return b;
        } else {
            return Optional.empty();
        }
    }

    static int[][] adjB(int n, int[] from, int[] to) {
        int[][] adj = new int[n][];
        int[] cnt = new int[n];
        for (int f : from) {
            cnt[f]++;
        }
        for (int t : to) {
            cnt[t]++;
        }
        for (int i = 0; i < n; i++) {
            adj[i] = new int[cnt[i]];
        }
        for (int i = 0; i < from.length; i++) {
            adj[from[i]][--cnt[from[i]]] = to[i];
            adj[to[i]][--cnt[to[i]]] = from[i];
        }
        return adj;
    }

    @SuppressWarnings("unused")
    static class FastScanner {
        private BufferedReader reader;
        private StringTokenizer tokenizer;

        FastScanner(InputStream in) {
            reader = new BufferedReader(new InputStreamReader(in));
            tokenizer = null;
        }

        String next() {
            if (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        String nextLine() {
            if (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    return reader.readLine();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken("\n");
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        int[] nextIntArray(int n) {
            int[] a = new int[n];
            for (int i = 0; i < n; i++)
                a[i] = nextInt();
            return a;
        }

        long[] nextLongArray(int n) {
            long[] a = new long[n];
            for (int i = 0; i < n; i++)
                a[i] = nextLong();
            return a;
        }
    }
}