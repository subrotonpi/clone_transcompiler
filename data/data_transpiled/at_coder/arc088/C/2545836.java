* , args = "" ) public static void main ( String [ ] args ) {
  int N = args . length ;
  int L = 26 ;
  char ca = 'a' ;
  List < List < Integer >> d = new ArrayList < > ( L ) ;
  for ( int i = 0 ;
  i < S . length ;
  i ++ ) {
    d . get ( i - ca ) . add ( i ) ;
  }
  int odd = 0 ;
  for ( List < Integer > v : d ) {
    if ( v . size ( ) % 2 != 0 ) odd ++ ;
  }
  if ( ! odd <= N % 2 ) {
    System . out . println ( - 1 ) ;
    exit ( 0 ) ;
  }
  int [ ] data = new int [ N + 1 ] ;
  /* add a value */
  while ( k <= N ) {
    data [ k ] += v . get ( ) ;
    k += k & - k ;
  }
  /* get the value */
  int s = 0 ;
  while ( k > 0 ) {
    s += data [ k ] ;
    k -= k & - k ;
  }
  int [ ] M = new int [ N ] ;
  for ( List < Integer > v : d ) {
    int vl = v . size ( ) ;
    for ( int i = 0 ;
    i < vl ;
    i ++ ) {
      if ( ! i <= vl - 1 - i ) break ;
      int p = v . get ( i ) ;
      int q = v . get ( v . size ( ) - i - 1 ) ;
      M [ p ] = q ;
      M [ q ] = p ;
    }
  }
  int cnt = 0 ;
  int [ ] B = new int [ N ] ;
  for ( int i = N - 1 ;
  i >= 0 ;
  i -- ) {
    if ( M [ i ] <= i ) {
      B [ i ] = B [ M [ i ] ] = cnt ++ ;
    }
  }
  int cur = - 1 ;
  int ans = 0 ;
  for ( int i = N - 1 ;
  i >= 0 ;
  i -- ) {
    if ( cur < B [ i ] ) {
      cur = B [ i ] ;
      if ( M [ i ] == i ) ans += N / 2 - cur ;
      else ans += M [ i ] - get ( M [ i ] + 1 ) ;
      /* add the value */
    }
  }
  System . out . println ( ans ) ;
}
