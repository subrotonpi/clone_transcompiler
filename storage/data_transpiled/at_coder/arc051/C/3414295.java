static int n ( int a , int b ) {
  int [ ] x = new int [ n ] ;
  for ( int i = 0 ;
  i < x . length ;
  i ++ ) x [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  Arrays . sort ( x ) , y = new int [ 10 * 9 + 7 ] , c = 0 , mod = 10 * 9 + 7 ;
  if ( a - 1 != 0 ) {
    for ( int i = 0 ;
    i < x . length ;
    i ++ ) {
      int m = x [ i ] ;
      while ( m * a < x [ i ] ) {
        m *= a ++ ;
      }
      y [ i ] = m ;
    }
    if ( b <= c ) {
      for ( int i = 0 ;
      i < b ;
      i ++ ) {
        x [ 0 ] *= a ;
        Arrays . sort ( x ) ;
      }
      for ( int i : x ) System . out . println ( i ) ;
    }
    else {
      int d = ( b - c ) / n , e = ( b - c ) % n , y = new int [ y . length ] ;
      for ( int i = 0 ;
      i < e ;
      i ++ ) y [ i ] = ( y [ i ] * Math . pow ( a , d + 1 , mod ) ) % mod ;
      for ( int i = e ;
      i < n ;
      i ++ ) y [ i ] = ( y [ i ] * Math . pow ( a , d , mod ) ) % mod ;
      for ( int i = y . length + y . length ;
      i < e ;
      i ++ ) System . out . println ( y [ i ] ) ;
    }
  }
  else {
    for ( int i : x ) System . out . println ( i ) ;
  }
  return 0 ;
}
