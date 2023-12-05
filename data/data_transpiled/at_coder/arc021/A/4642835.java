{
  maps = Arrays . asList ( Lists . newArrayList ( ) ) ;
  for ( int i = 0 ;
  i < 4 ;
  i ++ ) {
    maps . add ( Lists . newArrayList ( ) ) ;
  }
  for ( int i = 0 ;
  i < 4 ;
  i ++ ) {
    for ( int j = 0 ;
    j < 4 ;
    j ++ ) {
      if ( maps . get ( i ) [ j ] == maps . get ( i + 1 ) [ j ] || maps . get ( i ) [ j ] == maps . get ( i ) [ j + 1 ] ) {
        System . out . println ( "CONTINUE" ) ;
        exit ( ) ;
      }
    }
  }
  else {
    System . out . println ( "GAMEOVER" ) ;
  }
}
