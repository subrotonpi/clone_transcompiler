import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

    static String A;

    public static void main(String[] args) {
        FastScanner sc = new FastScanner(System.in);
        A = sc.next();

        System.out.println( solve() );
    }

    static String solve() {
        int[] prev = new int[26];
        int[] dp = new int[A.length()];
        for (int i = A.length()-1; i >= 0; i--) {
            char c = A.charAt(i);
            int cn = c - 'a';

            int min = Integer.MAX_VALUE / 2;
            for (int j = 0; j < 26; j++) {
                min = Math.min(prev[j], min);
            }
            dp[i] = min+1;
            prev[cn] = dp[i];
        }

        StringBuilder ans = new StringBuilder();
        Set<Character> chars = new HashSet<>();
        int[] charDist = new int[26];
        int[] charDistIndex = new int[26];
        Arrays.fill(charDist, -1);
        for (int i = 0; i < A.length(); i++) {
            char c = A.charAt(i);
            chars.add(c);
            int dist = dp[i];

            if( charDist[c - 'a'] == -1 ) {
                charDist[c - 'a'] = dist;
                charDistIndex[c - 'a'] = i;
            }

            if( chars.size() == 26 ) {
                for (int j = 0; j < 26; j++) {
                    if( charDist[j] == dist ) {
                        char a = (char)('a' + j);
                        ans.append(a);
                        i = charDistIndex[j]; // ?????????????...
                        break;
                    }
                }

                chars.clear();
                Arrays.fill(charDist, -1);
            }
        }

        for (int i = 0; i < 26; i++) {
            if( charDist[i] == -1 ) {
                ans.append((char)(i + 'a'));
                break;
            }
        }

        return ans.toString();
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