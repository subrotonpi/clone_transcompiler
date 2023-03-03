public static void input ( ) {
  int ans = 0 ;
  for ( int i = 0 ;
  i < 1 << S . length ;
  i ++ ) {
    String string = Integer . toString ( 0 ) ;
    int tmp = 0 ;
    String [ ] enzan = new String [ 3 ] ;
    for ( int j = 0 ;
    j < S . length ;
    j ++ ) {
      if ( ( ( i >> j ) & 1 ) == 1 ) {
        tmp += Integer . parseInt ( S . substring ( j , j + 1 ) ) ;
        enzan [ 0 ] = "+" ;
      }
      else {
        tmp -= Integer . parseInt ( S . substring ( j , j + 1 ) ) ;
        enzan [ 0 ] = "-" ;
      }
    }
    if ( tmp == 7 ) {
      System . out . println ( S . substring ( 0 , 1 ) + enzan [ 1 ] + S . substring ( 1 , 2 ) + enzan [ 2 ] + S . substring ( 2 , 3 ) + enzan [ 3 ] + S . substring ( 3 , 4 ) + "=7" ) ;
      exit ( ) ;
    }
  }
}
