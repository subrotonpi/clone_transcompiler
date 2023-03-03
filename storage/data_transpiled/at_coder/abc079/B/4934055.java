public static int N ( ) {
  int [ ] L = {
    2 , 1 }
    ;
    for ( int i = 2 ;
    i < 87 ;
    i ++ ) {
      L [ i ] = L [ i - 2 ] + L [ i - 1 ] ;
    }
    System . out . println ( L [ N ] ) ;
    return N ;
  }
  