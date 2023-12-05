public static void print ( String input ) {
  int n = Integer . parseInt ( input ) ;
  int [ ] L = {
    2 , 1 }
    ;
    if ( n < 2 ) {
      System . out . println ( L [ L . length - 1 ] ) ;
    }
    else {
      for ( int i = 0 ;
      i < n - 1 ;
      i ++ ) {
        L [ i ] = L [ i ] + L [ i + 1 ] ;
      }
      System . out . println ( L [ L . length - 1 ] ) ;
    }
  }
  