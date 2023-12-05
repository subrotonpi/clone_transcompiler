@ Function public static String rl ( ) {
  int n = input . nextInt ( ) ;
  List < Integer > a = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < xrange ( n ) ;
  i ++ ) {
    a . add ( rl ( ) ) ;
  }
  int [ ] d = a . toArray ( ) ;
  int [ ] l = a . toArray ( ) ;
  int D = input . nextInt ( ) ;
  int [ ] s = new int [ n ] ;
  s [ 0 ] = 100000000 ;
  for ( int i : xrange ( n ) ) {
    int r = D - d [ i ] ;
    if ( r > l [ i ] ) continue ;
    s [ i ] = r ;
  }
  for ( int i = xrange ( n - 1 , - 1 , - 1 ) ;
  i >= 0 ;
  i -- ) {
    for ( int j : xrange ( i + 1 , n ) ) {
      if ( s [ j ] > l [ j ] ) continue ;
      int dd = d [ j ] - d [ i ] ;
      if ( dd > l [ i ] ) break ;
      if ( dd < s [ j ] ) continue ;
      s [ i ] = Math . min ( s [ i ] , dd ) ;
    }
  }
  return s [ 0 ] <= d [ 0 ] ? "YES" : "NO" ;
}
