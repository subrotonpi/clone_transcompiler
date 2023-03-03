public static int find ( int x ) {
  if ( par [ x ] == x ) {
    return x ;
  }
  else {
    return find ( par [ x ] ) ;
  }
  /* unite the first */
  x = find ( x ) ;
  y = find ( y ) ;
  if ( x != y ) {
    if ( rank [ x ] < rank [ y ] ) {
      par [ x ] = y ;
      size [ y ] += size [ x ] ;
    }
    else {
      par [ y ] = x ;
      size [ x ] += size [ y ] ;
      if ( rank [ x ] == rank [ y ] ) rank [ x ] ++ ;
    }
  }
  /* same in case of an array of integers */
  int n = Integer . parseInt ( input ( ) ) ;
  int [ ] a = Integer . parseInt ( input ( ) ) ;
  par = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) par [ i ] = i ;
  rank = new int [ n ] ;
  size = new int [ n ] ;
  rank [ 0 ] = 1 ;
  size [ 0 ] = 1 ;
  int [ ] b = new int [ n + 1 ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) b [ a [ i ] ] = i ;
  int ans = 0 ;
  for ( int i = n ;
  i > 0 ;
  i -- ) {
    int k = b [ i ] ;
    int left = 0 ;
    int right = 0 ;
    if ( k - 1 >= 0 && a [ k - 1 ] > a [ k ] ) {
      left = size [ indexOf ( k - 1 ) ] ;
      unite ( k - 1 , k ) ;
    }
    if ( k + 1 <= n - 1 && a [ k + 1 ] > a [ k ] ) {
      right = size [ indexOf ( k + 1 ) ] ;
      unite ( k + 1 , k ) ;
    }
    ans += ( left + 1 ) * ( right + 1 ) * a [ k ] ;
  }
  System . out . println ( ans ) ;
  return ans ;
}
