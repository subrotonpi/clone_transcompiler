public static int [ ] a ( ) {
  int [ ] b = new int [ input . length ( ) ] ;
  for ( int _ : input ) {
    b [ _ ] = Integer . parseInt ( _ ) ;
  }
  return ( max ( a + b , a - b , a * b ) ) ;
}
