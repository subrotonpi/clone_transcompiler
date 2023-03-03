@ org . python . Method ( __doc__ = "" ) public static org . python . Object __main ( ) {
  /* Eprint the string */
  System . out . println ( "Case #" + ( test + 1 ) + ": " + best ) ;
  /* ln the string to the list of words */
  String s = "" ;
  /* get the list of words */
  int T = Integer . parseInt ( s ) ;
  /* get the list of words */
  double INF = Double . POSITIVE_INFINITY ;
  for ( int test = 0 ;
  test < T ;
  test ++ ) {
    s = ln ( String . valueOf ( s ) ) ;
    String K = ln ( String . valueOf ( s ) ) ;
    int K = Integer . parseInt ( K ) ;
    int sum = 0 ;
    for ( int i = 0 ;
    i < s . length ( ) - K + 1 ;
    i ++ ) {
      sum += s . charAt ( i ) == '+' ? 0 : 1 ;
    }
    int best = 0 ;
    for ( int i = 0 ;
    i < s . length ( ) - K + 1 ;
    i ++ ) {
      if ( s . charAt ( i ) != 0 ) {
        for ( int j = i ;
        j < i + K ;
        j ++ ) {
          s [ j ] ^= 1 ;
        }
        best ++ ;
      }
    }
    if ( sum != 0 ) {
      best = "IMPOSSIBLE" ;
    }
    System . out . println ( "Case #" + ( test + 1 ) + ": " + best ) ;
  }
  return null ;
}
