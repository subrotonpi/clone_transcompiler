public static void print ( String input ) {
  int a = Integer . parseInt ( input ) ;
  int b = Integer . parseInt ( input ) ;
  boolean [ ] c = new boolean [ 41 ] ;
  c [ a ] = true ;
  int d = 0 ;
  while ( ! c [ b ] ) {
    boolean [ ] k = c . clone ( ) ;
    d ++ ;
    for ( int i = 0 ;
    i < 41 ;
    i ++ ) {
      if ( k [ i ] ) {
        if ( i - 1 != - 1 ) {
          c [ i - 1 ] = true ;
          if ( i - 5 > - 1 ) {
            c [ i - 5 ] = true ;
            if ( i - 10 > - 1 ) {
              c [ i - 10 ] = true ;
            }
          }
        }
        if ( i + 1 < 41 ) {
          c [ i + 1 ] = true ;
          if ( i + 5 < 41 ) {
            c [ i + 5 ] = true ;
            if ( i + 10 < 41 ) {
              c [ i + 10 ] = true ;
            }
          }
        }
      }
    }
  }
  System . out . println ( d ) ;
}
