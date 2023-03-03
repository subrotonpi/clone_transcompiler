public static int n ( ) {
  int w = Integer . parseInt ( input . nextLine ( ) ) ;
  int dp [ ] [ ] = new int [ 4 * n + 1 ] [ 4 * n + 1 ] ;
  for ( int j = 0 ;
  j < n + 1 ;
  j ++ ) {
    for ( int i = 0 ;
    i < n + 1 ;
    i ++ ) {
      dp [ j ] [ i ] = new int [ 4 * n + 1 ] ;
    }
  }
  dp [ 0 ] [ 0 ] [ 0 ] = 0 ;
  int w1 = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int ws = Integer . parseInt ( input . nextLine ( ) ) ;
    int vs = Integer . parseInt ( input . nextLine ( ) ) ;
    if ( i == 0 ) {
      w1 = ws ;
    }
    ws -= w1 ;
    for ( int j = 0 ;
    j < i + 2 ;
    j ++ ) {
      for ( int k = 0 ;
      k < 4 * n ;
      k ++ ) {
        if ( j - 1 >= 0 && k - ws >= 0 && dp [ i ] [ j ] [ k ] - ws >= 0 ) {
          dp [ i + 1 ] [ j ] [ k ] = Math . max ( dp [ i ] [ j ] [ k ] , dp [ i ] [ j - 1 ] [ k - ws ] + vs ) ;
        }
        else {
          dp [ i + 1 ] [ j ] [ k ] = dp [ i ] [ j ] [ k ] ;
        }
      }
    }
  }
  int ans = 0 ;
  for ( int j = 0 ;
  j < n + 1 ;
  j ++ ) {
    for ( int k = 0 ;
    k < 4 * n ;
    k ++ ) {
      if ( w1 * j + k <= w ) {
        ans = Math . max ( ans , dp [ n - 1 ] [ j ] [ k ] ) ;
      }
    }
  }
  System . out . println ( ans ) ;
  return ans ;
}
