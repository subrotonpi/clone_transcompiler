public static int [ ] S ( Scanner input ) {
  int N = input . nextInt ( ) ;
  if ( N == 1 ) {
    System . out . println ( 0 ) ;
  }
  else if ( N % 2 == 0 ) {
    int cnt = 0 ;
    for ( int i = 0 ;
    i < N / 2 ;
    i ++ ) {
      if ( S [ i ] != S [ N - i - 1 ] ) {
        cnt ++ ;
      }
    }
    if ( cnt == 1 ) {
      System . out . println ( 25 * N - 2 ) ;
    }
    else {
      System . out . println ( 25 * N ) ;
    }
  }
  else if ( N % 2 == 1 ) {
    int cnt = 0 ;
    for ( int i = 0 ;
    i < N / 2 ;
    i ++ ) {
      if ( S [ i ] != S [ N - i - 1 ] ) {
        cnt ++ ;
      }
    }
    if ( cnt == 0 ) {
      System . out . println ( 25 * ( N - 1 ) ) ;
    }
    else if ( cnt == 1 ) {
      System . out . println ( 25 * N - 2 ) ;
    }
    else {
      System . out . println ( 25 * N ) ;
    }
  }
  else {
    System . out . println ( 25 * N ) ;
  }
  return S ;
}
