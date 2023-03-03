public static void main ( String [ ] args ) {
  int [ ] [ ] a = new int [ 4 ] [ 3 ] ;
  for ( String s : input . split ( " " ) ) {
    a [ 0 ] [ 0 ] = Integer . parseInt ( s ) ;
  }
  if ( solve ( a ) ) {
    System . out . println ( "CONTINUE" ) ;
  }
  else {
    System . out . println ( "GAMEOVER" ) ;
  }
}
