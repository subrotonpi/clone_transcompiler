public static void main ( String [ ] args ) {
  List < List < Integer >> coord = Arrays . asList ( Lists . newArrayList ( ) ) ;
  for ( int y = 0 ;
  y < 4 ;
  y ++ ) {
    for ( int x = 1 ;
    x < 4 ;
    x ++ ) {
      if ( coord . get ( y ) . get ( x ) == coord . get ( y ) . get ( x - 1 ) ) {
        System . out . println ( "CONTINUE" ) ;
        return ;
      }
    }
  }
  for ( int y = 1 ;
  y < 4 ;
  y ++ ) {
    for ( int x = 0 ;
    x < 4 ;
    x ++ ) {
      if ( coord . get ( y ) . get ( x ) == coord . get ( y - 1 ) . get ( x ) ) {
        System . out . println ( "CONTINUE" ) ;
        return ;
      }
    }
  }
  System . out . println ( "GAMEOVER" ) ;
}
