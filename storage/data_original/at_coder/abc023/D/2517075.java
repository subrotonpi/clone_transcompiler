import java.util.Scanner;
import java.util.StringJoiner;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        long[] hs = new long[N];
        long[] ss = new long[N];

        for (int i = 0; i < N; i++) {
            hs[i] = Integer.parseInt(sc.next());
            ss[i] = Integer.parseInt(sc.next());
        }

        System.out.println( solve(N, hs, ss) );
    }

    private static long solve(int N, long[] hs, long[] ss) {
        // ?????????????????????????????
        long min = Long.MAX_VALUE;
        long max = Long.MIN_VALUE;
        for (int i = 0; i < N; i++) {
            long last = hs[i] + ss[i] * (N - 1);
            min = Math.min(min, last);
            max = Math.max(max, last);
        }

        return findLower(min, max, x -> {
            // x???????????????
            // => x?????????????????????????????
            int[] bin = new int[N];
            for (int i = 0; i < N; i++) {
                long h = hs[i];
                long s = ss[i];

                //?????????x????????????
                if( h > x ) return false;

                // ????????x??????
                // x >= h + s * n-1 ???????n?????
                // ??bin????
                bin[(int)Math.min(N - 1, (x - h) / s)]++;
            }

            for (int i = 0; i < N; i++) {
                // i????????????i+1???????
                if( bin[i] > i + 1 ) return false;

                if( i != N - 1  ) { // last???
                    bin[i+1] += bin[i];
                }
            }
            return true;
        });
    }

    private static long findLower(long low, long high, Predicate<Long> p) {
        long mid;
        while( low < high ) {
            mid = ((high - low) >>> 1) + low; // (high + low) / 2
            if( p.test(mid) ) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    private static int upperBound(int[] array, int value) {
        int low = 0;
        int high = array.length;
        int mid;
        while( low < high ) {
            mid = ((high - low) >>> 1) + low; // (high + low) / 2
            if( array[mid] <= value ) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return low;
    }

    private static void show(int[] array) {
        StringJoiner j = new StringJoiner(" ");
        for (int value : array) {
            j.add("" + value);
        }
        System.err.println( j.toString() );
    }
}