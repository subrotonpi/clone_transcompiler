public static void print ( String input ) {
  int h = Integer . parseInt ( input . substring ( 0 , h ) ) ;
  int w = Integer . parseInt ( input . substring ( w , h ) ) ;
  String [ ] s = Arrays . stream ( input . split ( " " ) ) . map ( s -> s . substring ( 0 , h ) ) . toArray ( String [ ] :: new ) ;
  for ( int i = 0 ;
  i < h ;
  i ++ ) {
    String l = "" ;
    for ( int j = 0 ;
    j < w ;
    j ++ ) {
      if ( s [ i ] . charAt ( j ) == '#' ) {
        l += "#" ;
      }
      else {
        l += Integer . toString ( s [ max ( 0 , j - 1 ) ] . substring ( Math . max ( 0 , j - 1 ) , Math . min ( w , j + 2 ) ) . indexOf ( "#" ) ) ;
      }
    }
    System . out . println ( l ) ;
  }
}
