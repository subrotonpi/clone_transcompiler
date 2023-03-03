static final String print ( String str ) {
  int inf = 10 * 20 ;
  int mod = 10 * 9 + 7 ;
  /* LI */
  int [ ] [ ] a = new int [ 3 ] [ 3 ] ;
  int [ ] b = new int [ 3 ] [ 3 ] ;
  int [ ] d = new int [ 3 ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int x = li [ i ] ;
    int y = li [ i ] ;
    if ( x < y ) a [ i ] [ x ] = y ;
    else b [ i ] [ x ] = y ;
  }
  /* LS */
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int x = li [ i ] ;
    int y = li [ i ] ;
    if ( x < y ) b [ i ] [ x ] = y ;
    else d [ i ] [ x ] = y ;
  }
  /* S */
  int n = Integer . parseInt ( str ) ;
  int [ ] a = new int [ n ] ;
  int [ ] b = new int [ n ] ;
  int [ ] d = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int x = li [ i ] ;
    int y = li [ i ] ;
    if ( x < y ) a [ i ] = x ;
    else b [ i ] = y ;
  }
  /* R */
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int x = li [ i ] ;
    int y = li [ i ] ;
    if ( x < y ) a [ i ] = x ;
    else b [ i ] = y ;
  }
  /* R */
  System . out . println ( str ) ;
  return str ;
}
