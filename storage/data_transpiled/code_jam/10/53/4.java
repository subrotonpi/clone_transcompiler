@ VisibleForTesting static void main ( String input ) {
  if ( input . equals ( "" ) ) {
    for ( int testCase = 0 ;
    testCase < 1 ;
    testCase ++ ) {
      Map < Integer , Integer > cnt = new HashMap < > ( ) ;
      int C = Integer . parseInt ( scanner . nextLine ( ) ) ;
      for ( ;
      testCase < C ;
      testCase ++ ) {
        int p = Integer . parseInt ( scanner . nextLine ( ) ) ;
        int v = Integer . parseInt ( scanner . nextLine ( ) ) ;
        cnt . put ( p , v ) ;
      }
      int res = 0 ;
      while ( true ) {
        Integer found = null ;
        for ( int p = 0 ;
        p < cnt . size ( ) ;
        p ++ ) {
          if ( cnt . get ( p ) > 1 ) {
            found = p ;
            break ;
          }
        }
        if ( found == null ) {
          break ;
        }
        cnt . size ( ) - = 2 ;
        if ( cnt . size ( ) == 0 ) {
          -- cnt . size ( ) ;
        }
        cnt . get ( p - 1 ) ++ ;
        cnt . get ( p + 1 ) ++ ;
        res ++ ;
      }
      System . out . printf ( "Case #%d: %d%n" , testCase + 1 , res ) ;
    }
  }
}
