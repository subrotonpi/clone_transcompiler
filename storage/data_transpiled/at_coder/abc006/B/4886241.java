public static int N = Integer . parseInt ( input ) {
  int [ ] trib = {
    0 , 0 , 1 }
    ;
    for ( int i = 3 ;
    i < N ;
    i ++ ) {
      trib [ i ] = ( trib [ i - 1 ] + trib [ i - 2 ] + trib [ i - 3 ] ) % 10007 ;
    }
    System . out . println ( trib [ N - 1 ] ) ;
    return N ;
  }
  