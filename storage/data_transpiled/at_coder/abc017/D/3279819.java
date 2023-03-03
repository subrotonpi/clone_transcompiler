public static int [ ] input ( ) {
  int n = Integer . parseInt ( input . readLine ( ) ) ;
  int m = Integer . parseInt ( input . readLine ( ) ) ;
  int [ ] f = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) f [ i ] = Integer . parseInt ( input . readLine ( ) ) ;
  int [ ] dp = new int [ n + 1 ] ;
  dp [ 0 ] = 1 ;
  dp [ 1 ] = 1 ;
  int [ ] x = new int [ m ] ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) x [ f [ i ] - 1 ] = 1 ;
  int [ ] sums = new int [ n + 1 ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) sums [ i ] = 0 ;
  sums [ i ] = 1 ;
  sums [ i ] = 2 ;
  final long mod = 1000000007 ;
  int left = 0 ;
  for ( int i = 1 ;
  i < n ;
  i ++ ) {
    left = Math . max ( left , x [ f [ i ] - 1 ] ) ;
    if ( left == 0 ) {
      dp [ i + 1 ] = ( dp [ i ] * 2 ) % mod ;
      sums [ i + 1 ] = ( sums [ i ] + dp [ i + 1 ] ) % mod ;
      x [ f [ i ] - 1 ] = i + 1 ;
    }
    else {
      dp [ i + 1 ] = 0 ;
    }
  }
  System . out . println ( dp [ dp [ i - 1 ] % mod ] ) ;
  return dp ;
}
