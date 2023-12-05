public static int input ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int a = Integer . parseInt ( input . nextLine ( ) ) ;
  int x = Integer . parseInt ( input . nextLine ( ) ) ;
  int dp [ ] [ ] = new int [ n + 1 ] [ n + 1 ] ;
  for ( int i = 0 ;
  i < n + 1 ;
  i ++ ) {
    dp [ 0 ] [ i ] = 0 ;
  }
  dp [ 0 ] [ 0 ] = 1 ;
  for ( int i = 1 ;
  i <= n ;
  i ++ ) {
    for ( int k = 0 ;
    k < i ;
    k ++ ) {
      for ( int j = 0 ;
      j < Integer . parseInt ( input . nextLine ( ) ) ;
      j ++ ) {
        if ( dp [ i - 1 ] [ k ] [ j ] != 0 ) {
          dp [ i ] [ k + 1 ] [ j + x - i - 1 ] += dp [ i - 1 ] [ k ] [ j ] ;
        }
      }
    }
    for ( int k = 0 ;
    k < i ;
    k ++ ) {
      for ( int j = 0 ;
      j < Integer . parseInt ( input . nextLine ( ) ) ;
      j ++ ) {
        if ( dp [ i - 1 ] [ k ] [ j ] != 0 ) {
          dp [ i ] [ k ] [ j ] += dp [ i - 1 ] [ k ] [ j ] ;
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
      if ( j == i * a ) {
        ans += dp [ n ] [ i ] [ j ] ;
      }
    }
  }
  System . out . println ( ans ) ;
  return ans ;
}
