public static void print ( String input ) {
  int H = Integer . parseInt ( input ) ;
  int W = Integer . parseInt ( input ) ;
  String [ ] V = new String [ H ] ;
  for ( int i = 0 ;
  i < H ;
  i ++ ) V [ i ] = input . split ( " " ) ;
  String [ ] B = new String [ H ] ;
  String [ ] R = new String [ H ] ;
  String N = "#" ;
  for ( int i = 0 ;
  i < H ;
  i ++ ) {
    if ( i % 2 == 0 ) {
      B [ i ] = N + V [ i ] . substring ( V [ i ] . length ( ) - 1 ) ;
      R [ i ] = V [ i ] . substring ( 0 , W - 1 ) + "#" ;
    }
    else {
      R [ i ] = V [ i ] . substring ( V [ i ] . length ( ) - 1 ) + N ;
      B [ i ] = "#" + V [ i ] . substring ( 1 ) ;
    }
  }
  for ( int i = 0 ;
  i < H ;
  i ++ ) System . out . println ( B [ i ] ) ;
  System . out . println ( "" ) ;
  for ( int i = 0 ;
  i < H ;
  i ++ ) System . out . println ( R [ i ] ) ;
}
