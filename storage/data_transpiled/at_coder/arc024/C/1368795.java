static final String print ( String str ) {
  int inf = 10 * 20 ;
  int mod = 10 * 9 + 7 ;
  /* LI */
  int [ ] li = str . split ( " " ) ;
  /* LI_ */
  int [ ] li = new int [ li . length ] ;
  for ( int i = 0 ;
  i < li . length ;
  i ++ ) li [ i ] = Integer . parseInt ( str . substring ( i , i + 1 ) ) ;
  /* LF */
  for ( int i = 0 ;
  i < li . length ;
  i ++ ) li [ i ] = Integer . parseInt ( li [ i ] ) - 1 ;
  /* LS */
  for ( int i = 0 ;
  i < li . length ;
  i ++ ) li [ i ] = Integer . parseInt ( li [ i ] ) ;
  /* I */
  for ( int i = 0 ;
  i < li . length ;
  i ++ ) li [ i ] = Integer . parseInt ( li [ i ] ) - 97 ;
  /* F */
  for ( int i = 0 ;
  i < li . length ;
  i ++ ) {
    /* S */
  }
  /* main */
  int n = li . length ;
  int k = li . length ;
  char [ ] s = new char [ 26 ] ;
  for ( char c : S ) s [ i ] = ( char ) c - 97 ;
  int [ ] ts = new int [ n ] ;
  ts [ 0 ] = 0 ;
  Map < Integer , Integer > map = new LinkedHashMap < Integer , Integer > ( ) ;
  for ( int i = 0 ;
  i < k - 1 ;
  i ++ ) {
    ts [ s [ i ] ] ++ ;
  }
  for ( int i = 0 ;
  i < n - k + 1 ;
  i ++ ) {
    if ( i > 0 ) ts [ s [ i - 1 ] ] -- ;
    ts [ s [ i + k - 1 ] ] ++ ;
    int t = new int [ ts . length ] ;
    if ( map . get ( t ) == 0 ) map . put ( t , i + 1 ) ;
    else if ( map . get ( t ) + k <= i + 1 ) return "YES" ;
  }
  System . out . println ( str ) ;
  return str ;
}
