public static int input ( ) {
  int [ ] sl = new int [ S . length ] ;
  for ( int i = 0 ;
  i < 1 << S . length ;
  i ++ ) {
    String string = Integer . toString ( 0 ) ;
    int tmp = 0 ;
    for ( int j = 0 ;
    j < S . length ;
    j ++ ) {
      if ( ( ( i >> j ) & 1 ) == 1 ) {
        tmp += Integer . parseInt ( string ) ;
        string = "0" ;
      }
      else {
        string += Integer . toString ( S [ j ] ) ;
      }
    }
    tmp = tmp + Integer . parseInt ( string ) ;
    ans += tmp ;
  }
  return ans ;
}
