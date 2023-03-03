static int m ( int [ ] tab , int i ) {
  int m = '9' ;
  for ( int x : tab ) {
    if ( x > i ) {
      m = Math . min ( m , x ) ;
    }
  }
  /* main program */
  int n = Integer . parseInt ( readLine ( ) ) ;
  for ( int nr = 1 ;
  nr <= n ;
  nr ++ ) {
    String line = readLine ( ) ;
    StringBuilder t = new StringBuilder ( ) ;
    t . append ( '0' ) ;
    t . append ( line ) ;
    t . append ( ' ' ) ;
    String [ ] rev = t . toString ( ) . split ( " " ) ;
    int prev = rev [ 0 ] ;
    for ( int pos = 1 , i = rev . length ;
    pos < i ;
    pos ++ ) {
      int p = pos + 2 ;
      if ( prev > i ) {
        int [ ] subtab = rev . clone ( ) ;
        int x = m ( subtab , i ) ;
        subtab [ i ] = x ;
        ret = new ArrayList ( subtab ) ;
        System . arraycopy ( rev , 0 , ret , 0 , p ) ;
      }
      break ;
    }
    ret = t . toString ( ) . substring ( 0 , n ) ;
    System . out . println ( "Case #" + nr + ": " + Integer . parseInt ( ret ) ) ;
  }
  return n ;
}
