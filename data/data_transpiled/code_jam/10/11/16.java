static public String [ ] [ ] rotate ( String [ ] [ ] board ) throws IOException {
  String [ ] [ ] rotated = new String [ board . length ] [ board [ 0 ] . length ] ;
  int size = board . length ;
  for ( int i = 0 ;
  i < size ;
  i ++ ) {
    StringBuilder row = new StringBuilder ( ) ;
    for ( int j = 0 ;
    j < size ;
    j ++ ) row . append ( '.' ) ;
    rotated [ i ] = row . toString ( ) ;
  }
  for ( int rotatedCol = 0 ;
  rotatedCol < size ;
  ) {
    int rotatedRow = 0 ;
    int originalCol = size - 1 ;
    String winner ;
    do {
      while ( originalCol >= 0 && board [ rotatedCol ] [ originalCol ] . equals ( "." ) ) {
        originalCol -- ;
      }
      if ( originalCol < 0 ) break ;
      winner = "Neither" ;
      Arrays . fill ( board , - 1 ) ;
      board = new String [ N ] ;
      for ( int i = 0 ;
      i < N ;
      i ++ ) {
        board [ i ] = new String ( ) ;
        for ( int j = 0 ;
        j < N ;
        j ++ ) row . append ( board [ i ] [ j ] ) ;
      }
      board [ rotatedRow ] = board [ rotatedCol ] [ originalCol ] ;
      originalCol -- ;
      rotatedRow ++ ;
    }
    while ( true ) ;
  }
  return rotated ;
}
