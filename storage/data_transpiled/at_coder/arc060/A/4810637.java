public static int n ( ) {
  int a = Integer . parseInt ( input . nextLine ( ) ) ;
  int X = Integer . parseInt ( input . nextLine ( ) ) ;
  int dp [ ] [ ] = new int [ n + 1 ] [ n + 1 ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    dp [ 0 ] [ i ] = 0 ;
  }
  dp [ 0 ] [ 0 ] [ 0 ] = 1 ;
  for ( int i = 1 ;
  i <= n ;
  i ++ ) {
    for ( int k = 0 ;
    k < i ;
    k ++ ) {
      for ( int s = 0 ;
      s < Integer . parseInt ( input . nextLine ( ) ) ;
      s ++ ) {
        if ( dp [ i - 1 ] [ k ] [ s ] != 0 ) {
          dp [ i ] [ k + 1 ] [ s + X + i - 1 ] += dp [ i - 1 ] [ k ] [ s ] ;
          dp [ i ] [ k ] [ s ] += dp [ i - 1 ] [ k ] [ s ] ;
        }
      }
    }
  }
  int ans = 0 ;
  for ( int i = 1 ;
  i <= n ;
  i ++ ) {
    for ( int j = 1 ;
    j <= Integer . parseInt ( input . nextLine ( ) ) ;
    j ++ ) {
      if ( j == i * a ) ans += dp [ n ] [ i ] [ j ] ;
    }
  }
  System . out . println ( ans ) ;
  return ans ;
}
