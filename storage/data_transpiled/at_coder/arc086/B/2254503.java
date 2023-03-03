public static void print ( int N ) {
  int [ ] A = Integer . parseInt ( input ( ) ) ;
  int maxIndex = 1 ;
  int maxAbs = Math . abs ( A [ 0 ] ) ;
  boolean pos ;
  for ( int i = 1 ;
  i < N ;
  i ++ ) {
    if ( maxAbs < Math . abs ( A [ i ] ) ) {
      maxAbs = Math . abs ( A [ i ] ) ;
      maxIndex = i + 1 ;
      if ( A [ i ] >= 0 ) pos = true ;
      else pos = false ;
    }
  }
  if ( pos ) {
    System . out . println ( 2 * N - 2 ) ;
    for ( int n = 0 ;
    n < N ;
    n ++ ) {
      if ( maxIndex - 1 != n ) {
        System . out . println ( maxIndex + " " + n + 1 ) ;
      }
    }
    for ( int n = 2 ;
    n <= N ;
    n ++ ) {
      System . out . println ( n - 1 + " " + n ) ;
    }
  }
  else {
    System . out . println ( 2 * N - 2 ) ;
    for ( int n = 0 ;
    n < N ;
    n ++ ) {
      if ( maxIndex - 1 != n ) {
        System . out . println ( maxIndex + " " + n + 1 ) ;
      }
    }
    for ( int n = 2 ;
    n <= N ;
    n ++ ) {
      System . out . println ( n + " " + n - 1 ) ;
    }
  }
}
