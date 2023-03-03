public static String [ ] data ( ) {
  String [ ] data = input ( ) . split ( " " ) ;
  return data [ 0 ] . substring ( 0 , 1 ) . toUpperCase ( ) + data [ 1 ] . substring ( 0 , 1 ) . toUpperCase ( ) + data [ 2 ] . substring ( 0 , 2 ) . toUpperCase ( ) ;
}
