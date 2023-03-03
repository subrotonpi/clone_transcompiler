public static void print ( String input ) {
  int h = Integer . parseInt ( input . substring ( 0 , 1 ) ) ;
  int w = Integer . parseInt ( input . substring ( 1 , 2 ) ) ;
  String [ ] A = new String [ h ] ;
  for ( int i = 0 ;
  i < h ;
  i ++ ) {
    A [ i ] = input . substring ( 0 , i ) ;
  }
  int count = 0 ;
  for ( String a : A ) {
    count += a . length ( ) ;
  }
  if ( count == h + w - 1 ) {
    System . out . println ( "Possible" ) ;
  }
  else {
    System . out . println ( "Impossible" ) ;
  }
}
