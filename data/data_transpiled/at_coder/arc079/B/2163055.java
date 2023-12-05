public static int k = Integer . parseInt ( input ) {
  int n = 50 ;
  int p = k / n ;
  int [ ] a = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) a [ i ] = i + p ;
  int m = k % n ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( i < m ) a [ i ] += n - ( m - 1 ) ;
    else a [ i ] -= m ;
  }
  System . out . println ( n ) ;
  return ( int ) a ;
}
