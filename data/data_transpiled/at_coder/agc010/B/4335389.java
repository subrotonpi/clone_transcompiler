public static String print ( String input ) {
  int n = Integer . parseInt ( input ) ;
  int [ ] A = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    A [ i ] = Integer . parseInt ( input ) ;
  }
  int s = Arrays . stream ( A ) . sum ( ) ;
  if ( s % ( ( n * ( n + 1 ) ) / 2 ) != 0 ) {
    System . out . println ( "NO" ) ;
  }
  else {
    int k = s / ( n * ( n + 1 ) / 2 ) ;
    int [ ] D = new int [ n ] ;
    for ( int i = 0 ;
    i < n - 1 ;
    i ++ ) {
      D [ i ] = A [ i + 1 ] - A [ i ] - k ;
    }
    D [ n ] = A [ 0 ] - A [ n - 1 ] - k ;
    String ans = "YES" ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      if ( D [ i ] > 0 || D [ i ] % n != 0 ) {
        ans = "NO" ;
      }
    }
    System . out . println ( ans ) ;
  }
  return ans ;
}
