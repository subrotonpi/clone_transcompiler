public static void input ( Scanner in ) {
  int n = in . nextInt ( ) , m = in . nextInt ( ) ;
  int [ ] box = new int [ n ] ;
  int [ ] boxz = new int [ n ] ;
  box [ 0 ] = 1 ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    int x = in . nextInt ( ) , y = in . nextInt ( ) ;
    box [ y - 1 ] ++ ;
    box [ x - 1 ] -- ;
    if ( boxz [ x - 1 ] == 1 ) {
      boxz [ y - 1 ] = 1 ;
      if ( box [ x - 1 ] == 0 ) {
        boxz [ x - 1 ] = 0 ;
      }
    }
  }
  System . out . println ( Arrays . toString ( boxz ) ) ;
}
