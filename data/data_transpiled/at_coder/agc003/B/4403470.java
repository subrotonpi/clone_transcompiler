public static void main ( String input ) {
  int n = Integer . parseInt ( input ) ;
  int [ ] a = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    a [ i ] = Integer . parseInt ( input ) ;
  }
  int ans = 0 ;
  for ( int i = 0 ;
  i < n - 1 ;
  i ++ ) {
    if ( a [ i ] >= 2 ) {
      ans += a [ i ] / 2 ;
      a [ i ] = a [ i ] % 2 ;
    }
    if ( a [ i ] == 1 ) {
      if ( a [ i ] == 1 ) {
        ans ++ ;
        a [ i ] -- ;
      }
    }
  }
  ans = ans + a [ n - 1 ] / 2 ;
  System . out . println ( ans ) ;
}
