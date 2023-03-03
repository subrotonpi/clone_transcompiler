static private boolean paint ( String [ ] [ ] picture , int r , int c ) {
  final int t = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
  /* paint picture */
  for ( int y = 0 ;
  y < r ;
  y ++ ) {
    for ( int x = 0 ;
    x < c ;
    x ++ ) {
      if ( picture [ y ] [ x ] . equals ( "#" ) && picture [ y ] [ x + 1 ] . equals ( "#" ) && picture [ y + 1 ] [ x ] . equals ( "#" ) && picture [ y + 1 ] [ x + 1 ] . equals ( "#" ) ) {
        picture [ y ] [ x ] = picture [ y + 1 ] [ x + 1 ] = '/' ;
        picture [ y ] [ x + 1 ] = picture [ y + 1 ] [ x + 1 ] = '\\' ;
      }
    }
  }
  for ( int y = 0 ;
  y < picture . length ;
  y ++ ) {
    if ( "#" . equals ( picture [ y ] [ x ] ) ) {
      return false ;
    }
  }
  /* printPicture */
  for ( int i = 0 ;
  i < r ;
  i ++ ) {
    System . out . println ( "Case #" + ( i + 1 ) + ":" ) ;
    r = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
    c = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
    List < String > picture = new ArrayList < String > ( ) ;
    for ( int j = 0 ;
    j < r ;
    j ++ ) {
      picture . add ( new LinkedList < String > ( ) ) ;
    }
    picture . add ( ( c + 5 ) . add ( "....." ) ) ;
    if ( paint ( picture , r , c ) ) {
      printPicture ( picture , r , c ) ;
    }
    else {
      System . out . println ( "Impossible" ) ;
    }
  }
  return true ;
}
