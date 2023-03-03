public static int N = Integer . parseInt ( input ) {
  int [ ] A = new int [ N ] ;
  for ( int i = 0 ;
  i < A . length ;
  i ++ ) {
    A [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  int minIdx = 0 ;
  for ( int i = 0 ;
  i < A . length ;
  i ++ ) {
    if ( minIdx == 0 || A [ minIdx ] > A [ i ] ) {
      minIdx = i ;
    }
  }
  while ( true ) {
    int nextMinIdx = 0 ;
    for ( int i = 0 ;
    i < A . length ;
    i ++ ) {
      if ( minIdx == i ) continue ;
      A [ i ] = A [ i ] % A [ minIdx ] ;
      if ( A [ i ] > 0 ) {
        if ( nextMinIdx == 0 || A [ nextMinIdx ] > A [ i ] ) {
          nextMinIdx = i ;
        }
      }
    }
    if ( nextMinIdx == 0 ) {
      System . out . println ( A [ minIdx ] ) ;
      exit ( ) ;
    }
    minIdx = nextMinIdx ;
  }
}
