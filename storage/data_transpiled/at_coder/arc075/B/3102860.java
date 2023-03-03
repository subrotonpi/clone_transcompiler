static final int [ ] getLengths ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int a = Integer . parseInt ( input . nextLine ( ) ) ;
  int b = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] h = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    h [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  Arrays . sort ( h ) ;
  int p = a - b ;
  {
    int k = 0 ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      l [ i ] = l [ i ] - b * w ;
      if ( l [ i ] > 0 ) {
        k += l [ i ] / p ;
        if ( l [ i ] % p != 0 ) {
          k ++ ;
        }
      }
    }
    if ( w >= k ) {
      return true ;
    }
  }
  int s = 0 ;
  int f = 10 * 14 ;
  while ( f - s >= 2 ) {
    int m = ( f + s ) / 2 ;
    int [ ] l = h [ 0 ] ;
    if ( l [ m ] > 0 ) {
      f = m ;
    }
    else {
      s = m ;
    }
  }
  int [ ] l = h [ 1 ] ;
  if ( l [ s ] > 0 ) {
    System . out . println ( s ) ;
  }
  else {
    System . out . println ( f ) ;
  }
  return l ;
}
