public static int t = Integer . parseInt ( input ) {
  for ( int test = 0 ;
  test <= t ;
  test ++ ) {
    int a = Integer . parseInt ( input . nextLine ( ) ) , n = Integer . parseInt ( input . nextLine ( ) ) ;
    int [ ] v = new int [ n ] ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      v [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
    }
    Arrays . sort ( v ) ;
    int ans = n ;
    for ( int i = 0 ;
    i <= n ;
    i ++ ) {
      int t = i ;
      int b = a ;
      for ( int j = 0 ;
      ( j <= n - i ) && ( t < ans ) ;
      j ++ ) {
        while ( v [ j ] >= b ) {
          t = t + 1 ;
          b = b + ( b - 1 ) ;
          if ( ( b == 1 ) && ( t < ans ) ) {
            t = n + 1 ;
            break ;
          }
        }
        b = b + v [ j ] ;
      }
      if ( t < ans ) ans = t ;
    }
    System . out . println ( "Case #" + ( test + 1 ) + ": " + ans ) ;
  }
  return t ;
}
