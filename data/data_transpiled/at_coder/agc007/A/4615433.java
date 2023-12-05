public static void main ( String input ) {
  int H = Integer . parseInt ( input ) ;
  int W = Integer . parseInt ( input ) ;
  String [ ] A = new String [ H ] ;
  for ( int i = 0 ;
  i < H ;
  i ++ ) {
    A [ i ] = input . split ( " " ) ;
  }
  int c = 0 ;
  for ( String a : A ) {
    c += a . indexOf ( "#" ) ;
  }
  if ( c == H + W - 1 ) {
    System . out . println ( "Possible" ) ;
  }
  else {
    System . out . println ( "Impossible" ) ;
  }
}
