public static void print ( int N ) {
  int [ ] L = {
    2 , 1 }
    ;
    for ( int i = 2 ;
    i <= N ;
    i = i + 2 ) {
      L [ i ] = L [ i - 1 ] + L [ i - 2 ] ;
    }
    System . out . println ( L [ N ] ) ;
  }
  