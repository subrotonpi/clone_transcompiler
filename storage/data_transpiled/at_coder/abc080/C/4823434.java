public static int [ ] [ ] parse ( String input ) {
  int N = Integer . parseInt ( input ) ;
  int [ ] [ ] F = new int [ N ] [ N ] ;
  int [ ] [ ] P = new int [ N ] [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    F [ i ] [ 0 ] = Integer . parseInt ( input ) ;
  }
  int [ ] [ ] P = new int [ N ] [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    P [ i ] [ 0 ] = Integer . parseInt ( input ) ;
  }
  int ans = - 10 * 10 ;
  for ( int b = 1 ;
  b < 2 * 10 ;
  b ++ ) {
    String binStr = format ( b , "010b" ) ;
    int p = 0 ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      int c = 0 ;
      for ( int j = 0 ;
      j < 10 ;
      j ++ ) {
        c += F [ i ] [ j ] * Integer . parseInt ( binStr . substring ( j , j + 1 ) ) ;
      }
      p += P [ i ] [ c ] ;
    }
    ans = Math . max ( ans , p ) ;
  }
  System . out . println ( ans ) ;
  return F ;
}
