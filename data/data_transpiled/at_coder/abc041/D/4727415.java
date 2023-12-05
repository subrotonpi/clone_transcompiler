static final int [ ] getLevels ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int m = Integer . parseInt ( input . nextLine ( ) ) ;
  Map < Integer , Integer > pres = new LinkedHashMap < > ( ) ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    int x = Integer . parseInt ( input . nextLine ( ) ) - 1 ;
    int y = pres . get ( y ) ;
    pres . put ( y , x ) ;
  }
  int [ ] dp = new int [ 2 * n ] ;
  dp [ 0 ] = 1 ;
  for ( int bit = 0 ;
  bit < 2 * n - 1 ;
  bit ++ ) {
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      dp [ bit | ( 1 << i ) ] += dp [ i ] ;
    }
  }
  return dp ;
}
