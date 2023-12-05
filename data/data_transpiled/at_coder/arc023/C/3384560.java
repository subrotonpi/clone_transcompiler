public static int n = Integer . parseInt ( input ) {
  int [ ] a = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) a [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  int m = 0 , mod = 10 * 9 + 7 , ans = 1 ;
  /* power k */
  if ( k == 1 ) return n ;
  else if ( k % 2 == 0 ) return power ( ( n * n ) % mod , k / 2 ) ;
  else return ( n * power ( n , k - 1 ) ) % mod ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( a [ i ] + 1 && m > 0 ) {
      int p = 1 , p2 = 1 , x = a [ i ] - s + 1 ;
      for ( int j = x ;
      j <= x + m ;
      j ++ ) p = ( p * j ) % mod ;
      for ( int j = 1 ;
      j <= m ;
      j ++ ) p2 = ( p2 * j ) % mod ;
      ans = ( ans * p * power ( p2 , mod - 2 ) ) % mod ;
      m = 0 ;
      s = a [ i ] ;
    }
    else if ( a [ i ] + 1 ) s = a [ i ] ;
    else if ( m > 0 ) m ++ ;
    else m = 1 ;
  }
  System . out . println ( ans ) ;
  return m ;
}
