public static void main ( String input ) {
  int n = Integer . parseInt ( input ) ;
  int m = Integer . parseInt ( input ) ;
  int [ ] p = new int [ n ] ;
  int [ ] q = new int [ n ] ;
  q [ 0 ] ++ ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    int x = Integer . parseInt ( input ) ;
    int y = Integer . parseInt ( input ) ;
    p [ y - 1 ] ++ ;
    p [ x - 1 ] -- ;
    if ( q [ x - 1 ] == 1 ) {
      q [ y - 1 ] = 1 ;
      if ( p [ x - 1 ] == 0 ) q [ x - 1 ] = 0 ;
    }
  }
}
