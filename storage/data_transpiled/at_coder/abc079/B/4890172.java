public static void print ( int N ) {
  int [ ] luca = {
    2 , 1 }
    ;
    while ( luca . length <= N ) {
      luca [ N - 2 ] = luca [ N - 1 ] + 1 ;
    }
    System . out . println ( luca [ N ] ) ;
  }
  