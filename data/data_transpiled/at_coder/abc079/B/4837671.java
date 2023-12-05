public static void print ( int n ) {
  int [ ] L = {
    2 , 1 }
    ;
    for ( int i = 0 ;
    i < 100 ;
    i ++ ) {
      L [ i ] = L [ L . length - 1 ] + L [ L . length - 2 ] ;
    }
    System . out . println ( L [ n ] ) ;
  }
  