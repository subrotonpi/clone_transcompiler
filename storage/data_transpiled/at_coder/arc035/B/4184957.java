@ Test public static String bContest ( int N , List < Integer > T ) {
  final int MOD = 10 * 9 + 7 ;
  Collections . sort ( T ) ;
  final long penaltyTime = Long . valueOf ( accumulate ( T ) ) ;
  final Map < Integer , Integer > seqCount = new HashMap < > ( T ) ;
  final int seqMaxContain = Collections . max ( seqCount . values ( ) ) ;
  final AtomicInteger factorial = new AtomicInteger ( 1 ) ;
  for ( int k = 1 ;
  k <= seqMaxContain ;
  k ++ ) {
    factorial . set ( ( factorial . get ( factorial . get ( factorial . size ( ) - 1 ) * k ) ) % MOD ) ;
  }
  int combinations = 1 ;
  for ( int v : seqCount . values ( ) ) {
    combinations *= factorial . get ( v ) ;
    combinations %= MOD ;
  }
  final String ans = penaltyTime + "\n" + combinations ;
  return ans ;
}
