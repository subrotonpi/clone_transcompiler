static final int mod = 10 * 9 + 7 ;
{
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  if ( n == 1 ) {
    System . out . println ( 1 ) ;
    return 0 ;
  }
  int [ ] dp = new int [ n + 1 ] ;
  dp [ 1 ] = n % mod ;
  dp [ 2 ] = n * n % mod ;
  int [ ] acc = new int [ n + 1 ] ;
  acc [ 1 ] = dp [ 1 ] % mod ;
  acc [ 2 ] = ( dp [ 1 ] + dp [ 2 ] ) % mod ;
  for ( int k = 3 ;
  k <= n ;
  k ++ ) {
    dp [ k ] = ( dp [ k - 1 ] + ( n - 1 ) * dp [ k ] + acc [ k - 3 ] + n - k + 2 ) % mod ;
    acc [ k ] = ( acc [ k - 1 ] + dp [ k ] ) % mod ;
  }
  int ans = dp [ n ] ;
  System . out . println ( ans ) ;
}
