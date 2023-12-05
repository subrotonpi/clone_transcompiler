public static int [ ] split ( String input ) {
  int X , Y = map ( Integer . parseInt , input . split ( ) ) ;
  return ( Math . abs ( X - Y ) >= 2 ? 'Alice' : 'Brown' ) ;
}
