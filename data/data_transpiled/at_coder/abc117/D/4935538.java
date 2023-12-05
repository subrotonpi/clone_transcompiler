public static void main ( String input ) {
  int N = Integer . parseInt ( input ) ;
  int k = Integer . parseInt ( input ) ;
  int [ ] d = new int [ 40 ] ;
  for ( int i = 0 ;
  i < 40 ;
  i ++ ) {
    int n = Integer . parseInt ( input ) ;
    for ( int j = 0 ;
    j < 40 ;
    j ++ ) {
      if ( ( n >> j ) & 1 ) {
        d [ j ] ++ ;
      }
    }
  }
  int ans = 0 ;
  int num = 0 ;
  for ( int i = 39 ;
  i >= 0 ;
  i -- ) {
    if ( num + 2 * i <= k ) {
      if ( N - 2 * d [ i ] < 0 ) {
        ans += 2 * d [ i ] ;
      }
      else {
        ans += 2 * d [ i ] * ( N - d [ i ] ) ;
        num += 2 * i ;
      }
    }
    else {
      ans += 2 * d [ i ] * d [ i ] ;
    }
  }
  System . out . println ( ans ) ;
}
