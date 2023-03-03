public static int n ( ) {
  int a = Integer . parseInt ( input . nextLine ( ) ) ;
  int xs [ ] = new int [ n + 1 ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) xs [ i ] = i ;
  int na = n * a ;
  int [ ] [ ] DP = new int [ na + 1 ] [ n + 1 ] ;
  DP [ 0 ] [ 0 ] = 1 ;
  for ( int _ = 0 ;
  _ < n ;
  _ ++ ) {
    int x = xs [ _ ] ;
    int [ ] [ ] next = new int [ na + 1 ] [ n + 1 ] ;
    for ( int i = 0 ;
    i < _ + 1 ;
    i ++ ) {
      for ( int j = 0 ;
      j < na + 1 ;
      j ++ ) {
        next [ i ] [ j ] += DP [ i ] [ j ] ;
        if ( j + x <= na ) {
          next [ i + 1 ] [ j + x ] += DP [ i ] [ j ] ;
        }
      }
    }
    DP = next ;
  }
  int ans = 0 ;
  for ( int i = 1 ;
  i <= n ;
  i ++ ) ans += DP [ i ] [ i * a ] ;
  System . out . println ( ans ) ;
  return ans ;
}
