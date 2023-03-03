static final void debug ( String ... args ) {
  final String s = System . getProperty ( "line.separator" ) ;
  debug ( s ) ;
  final BufferedReader fin = new BufferedReader ( new InputStreamReader ( System . in ) ) ;
  final int T = Integer . parseInt ( fin . readLine ( ) ) ;
  for ( int testCase = 1 ;
  testCase <= T ;
  testCase ++ ) {
    int N , M , K ;
    N = Integer . parseInt ( fin . readLine ( ) ) ;
    M = Integer . parseInt ( fin . readLine ( ) ) ;
    K = Integer . parseInt ( fin . readLine ( ) ) ;
    N = Math . min ( N , M ) ;
    M = Math . max ( N , M ) ;
    int result = K ;
    if ( N == 1 ) {
      result = K ;
    }
    else {
      for ( int l = 0 ;
      l <= M - 1 ;
      l ++ ) {
        for ( int h1 = 0 ;
        h1 <= N - 1 ;
        h1 ++ ) {
          for ( int h2 = 0 ;
          h2 <= h1 + 1 ;
          h2 ++ ) {
            int stones = l * 2 + h1 + h2 ;
            int diff = h1 - h2 ;
            if ( diff >= l ) continue ;
            int rect = l * h1 ;
            int triangle = diff * ( diff + 1 ) / 2 ;
            int covered = rect - triangle + stones ;
            if ( covered > K ) continue ;
            int required = stones + K - covered ;
            result = Math . min ( result , required ) ;
          }
        }
      }
    }
    debug ( "Case #" + testCase + ": " + result ) ;
  }
}
