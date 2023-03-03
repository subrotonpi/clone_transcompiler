static final String solve ( ) {
  psyco . full ( ) ;
  /* Area2 */
  int a [ ] = new int [ 2 ] ;
  int b [ ] = new int [ 2 ] ;
  int c [ ] = new int [ 2 ] ;
  int res [ ] = new int [ 2 ] ;
  for ( int i = 0 ;
  i < 2 ;
  i ++ ) {
    res [ i ] = b [ i ] * a [ i ] - a [ i ] * b [ i ] + c [ i ] * b [ i ] - b [ i ] * c [ i ] + a [ i ] * c [ i ] - c [ i ] * a [ i ] ;
  }
  /* solve */
  for ( int testCase = 0 ;
  testCase < xrange . length ;
  testCase ++ ) {
    int n = Integer . parseInt ( input . nextLine ( ) ) ;
    int m = Integer . parseInt ( input . nextLine ( ) ) ;
    int a = Integer . parseInt ( input . nextLine ( ) ) ;
    int [ ] tri = null ;
    if ( a <= n * m ) {
      for ( int ax = 0 ;
      ax <= n ;
      ax ++ ) {
        if ( tri != null ) break ;
        for ( int ay = 0 ;
        ay <= m ;
        ay ++ ) {
          if ( tri != null ) break ;
          for ( int bx = 0 ;
          bx <= n ;
          bx ++ ) {
            if ( tri != null ) break ;
            for ( int by <= n ) {
              int cx = 0 ;
              int cy = 0 ;
              if ( tri != null ) {
                cx = 0 ;
              }
            }
          }
        }
      }
    }
  }
  return res ;
}
