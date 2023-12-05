public static void print ( int N ) {
  int [ ] L = {
    2 , 1 }
    ;
    for ( int i = 0 ;
    i < N - 1 ;
    i ++ ) {
      int A = L [ i ] + L [ i + 1 ] ;
      L [ i ] = A ;
    }
    System . out . println ( L [ L . length - 1 ] ) ;
  }
  