public static String [ ] [ ] split ( String input ) {
  int h = ( int ) input . length ( ) , w = ( int ) input . length ( ) ;
  String [ ] a = new String [ h ] ;
  for ( int i = 0 ;
  i < h ;
  i ++ ) a [ i ] = input . substring ( 0 , i ) ;
  String [ ] [ ] r = new String [ h ] [ w ] ;
  String [ ] [ ] b = new String [ w ] [ w ] ;
  return r ;
}
