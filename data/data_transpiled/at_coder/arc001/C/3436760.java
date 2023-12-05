@ CopyOfPointConverter public static void copyOfPointConverter ( final String input ) {
  final int [ ] [ ] square = new int [ 22 ] [ ] ;
  for ( int y = 0 ;
  y < 7 ;
  y ++ ) {
    System . out . println ( "No Answer" ) ;
    exit ( ) ;
  }
  final int [ ] [ ] _a = new int [ 22 ] [ 22 ] ;
  for ( int i = 1 ;
  i <= 8 ;
  i ++ ) {
    for ( int dx = 0 , dy = 0 ;
    dx < 7 ;
    dx ++ , dy ++ ) {
      if ( _a [ y + dy ] [ x + dx ] == "Q" ) {
        return ;
      }
      _a [ y + dy ] [ x + dx ] = "*" ;
    }
  }
  _a [ y ] [ x ] = "Q" ;
  return ;
}
