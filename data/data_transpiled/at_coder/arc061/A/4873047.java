public static int input ( ) {
  int ans = 0 ;
  if ( S . length ( ) == 1 ) {
    ans = Integer . parseInt ( S ) ;
  }
  else {
    for ( int i = 0 ;
    i < 2 * ( S . length - 1 ) ;
    i ++ ) {
      char tmp = S [ 0 ] ;
      for ( int j = 0 ;
      j <= S . length - 1 ;
      j ++ ) {
        if ( i >> j & 1 == 0 ) {
          tmp += S [ j + 1 ] ;
        }
        else {
          ans += ( int ) tmp ;
          tmp = S [ j + 1 ] ;
        }
      }
      ans += ( int ) tmp ;
    }
  }
  return ans ;
}
