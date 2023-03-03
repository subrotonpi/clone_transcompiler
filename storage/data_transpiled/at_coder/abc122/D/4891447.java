public static int N = Integer . parseInt ( input ) {
  int [ ] [ ] [ ] dp = new int [ 101 ] [ 101 ] [ 101 ] ;
  dp [ 0 ] [ 3 ] [ 3 ] [ 3 ] = 1 ;
  for ( int n = 0 ;
  n <= 100 ;
  n ++ ) {
    for ( int i = 0 ;
    i <= 4 ;
    i ++ ) {
      for ( int j = 0 ;
      j <= 4 ;
      j ++ ) {
        for ( int k = 0 ;
        k <= 4 ;
        k ++ ) {
          for ( int l = 0 ;
          l <= 4 ;
          l ++ ) {
            if ( dp [ n ] [ i ] [ j ] [ k ] == 0 ) {
              continue ;
            }
            if ( ( j == 0 && k == 2 && l == 1 ) || ( j == 0 && k == 1 && l == 2 ) || ( j == 2 && k == 0 && l == 1 ) || ( i == 0 && k == 2 && l == 1 ) || ( i == 0 && j == 2 && l == 1 ) ) {
              continue ;
            }
            dp [ n + 1 ] [ j ] [ k ] [ l ] += dp [ n ] [ i ] [ j ] [ k ] ;
          }
        }
      }
    }
  }
  int ans = 0 ;
  for ( int i = 0 ;
  i <= 4 ;
  i ++ ) {
    for ( int j = 0 ;
    j <= 4 ;
    j ++ ) {
      for ( int k = 0 ;
      k <= 4 ;
      k ++ ) {
        ans += dp [ N ] [ i ] [ j ] [ k ] ;
        ans %= Math . pow ( 10 , 9 ) + 7 ;
      }
    }
  }
  System . out . println ( ans ) ;
  return ans ;
}
