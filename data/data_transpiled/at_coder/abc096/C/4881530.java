public static boolean solve ( ) {
  int H = Integer . parseInt ( input . readLine ( ) ) ;
  int W = Integer . parseInt ( input . readLine ( ) ) ;
  String [ ] canvas = new String [ H ] ;
  for ( int i = 0 ;
  i < H ;
  i ++ ) {
    canvas [ i ] = String . valueOf ( input . readLine ( ) ) ;
  }
  /* check border */
  return 0 <= canvas [ 0 ] . length ( ) && canvas [ 0 ] . charAt ( 0 ) == '#' && canvas [ 0 ] . charAt ( 0 ) == '#' ;
}
