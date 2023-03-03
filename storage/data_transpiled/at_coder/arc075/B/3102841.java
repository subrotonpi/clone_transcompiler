static final int [ ] resize ( int [ ] input ) {
  int n = input . length ;
  int a = input [ 0 ] ;
  int b = input [ 1 ] ;
  int [ ] h = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) h [ i ] = Integer . parseInt ( input [ 2 ] ) ;
  int p = a - b ;
  {
    int k = 0 ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      l [ i ] = l [ i ] - b * w ;
      if ( l [ i ] > 0 ) {
        k += l [ i ] / p ;
        if ( l [ i ] % p != 0 ) k ++ ;
      }
    }
    if ( w >= k ) return true ;
  }
  int s = 0 ;
  int f = 10 * 9 ;
  while ( f - s >= 2 ) {
    int m = ( f + s ) / 2 ;
    int [ ] l = h . clone ( ) ;
    if ( c ( m ) ) f = m ;
    else s = m ;
  }
  int [ ] l = h . clone ( ) ;
  if ( c ( s ) ) System . out . println ( s ) ;
  else System . out . println ( f ) ;
  return l ;
}
