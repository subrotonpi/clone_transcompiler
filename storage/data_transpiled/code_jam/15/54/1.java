@ VisibleForTesting static String input ( ) {
  int T = Integer . parseInt ( input ( ) ) ;
  for ( int testCase = 1 ;
  testCase <= T ;
  testCase ++ ) {
    int P = Integer . parseInt ( input ( ) ) ;
    int E = Integer . parseInt ( input ( ) ) ;
    int F = Integer . parseInt ( input ( ) ) ;
    int neg = Math . min ( E , F ) ;
    E = Math . max ( P , F ) ;
    F = Math . min ( P , F ) ;
    int c = new HashMap < > ( Collections . nCopies ( E , F ) ) ;
    List < Integer > ans = new ArrayList < > ( ) ;
    while ( c > 1 ) {
      ans . add ( 0 ) ;
      Map < Integer , Integer > map = new HashMap < > ( ) ;
      for ( Integer k : c ) {
        map . put ( k , c / 2 ) ;
      }
      c = map ;
    }
    c -- ;
    while ( c > 0 ) {
      int e = Math . min ( c , c ) ;
      ans . add ( e ) ;
      c -- ;
      Map < Integer , Integer > map = new HashMap < > ( ) ;
      for ( Integer k : new ArrayList < > ( c ) ) {
        if ( c . get ( k ) > 0 ) {
          map . put ( k , c . get ( k ) ) ;
          assert c . containsKey ( k + e ) ;
          c . get ( k + e ) - = c . get ( k ) ;
        }
      }
      c = map ;
    }
    while ( neg > 0 ) {
      int t = Math . max ( ans . size ( ) , - neg ) ;
      ans . remove ( ans . indexOf ( t ) ) ;
      ans . add ( - t ) ;
      neg += t ;
    }
    Collections . sort ( ans ) ;
    String ans = StringUtils . join ( ans , " " ) ;
    System . out . println ( "Case #" + testCase + ": " + ans ) ;
  }
  return ans ;
}
