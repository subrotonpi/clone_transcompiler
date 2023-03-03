@ VisibleForTesting static void debug ( String ... args ) {
  final Scanner fin = new Scanner ( System . in ) ;
  final int T = Integer . parseInt ( fin . nextLine ( ) ) ;
  for ( int testCase = 1 ;
  testCase <= T ;
  testCase ++ ) {
    final int N = Integer . parseInt ( fin . nextLine ( ) ) ;
    final int K = Integer . parseInt ( fin . nextLine ( ) ) ;
    final List < Double > P = Lists . newArrayList ( Double . parseDouble ( fin . nextLine ( ) ) ) ;
    Collections . sort ( P ) ;
    final int M = K / 2 + 1 ;
    Pair < Integer , Double > best = new Pair < > ( 0 , new Double ( ) ) ;
    for ( int c = 0 ;
    c < K + 1 ;
    c ++ ) {
      final List < Double > combination = P . subList ( 0 , c ) ;
      if ( c < K ) {
        combination . addAll ( P . subList ( K - c , c ) ) ;
      }
      final int [ ] s = new int [ M ] ;
      s [ 0 ] = 1 ;
      for ( final double a1 : combination ) {
        final double a0 = 1 - a1 ;
        final int [ ] ss = new int [ M ] ;
        ss [ 0 ] = s [ 0 ] * a0 ;
        for ( int k = 0 ;
        k < M ;
        k ++ ) {
          ss [ k ] = s [ k - 1 ] * a1 + s [ k ] * a0 ;
        }
        s = ss ;
      }
      best = max ( best , new Pair < > ( s [ s . length - 1 ] , combination ) ) ;
    }
    System . out . println ( "Case #" + testCase + ": " + best . first ( ) ) ;
  }
}
