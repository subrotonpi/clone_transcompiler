public static int [ ] S ( Scanner input ) {
  int N = input . nextInt ( ) ;
  if ( N == 1 ) {
    System . out . println ( 0 ) ;
  }
  else if ( N % 2 == 1 ) {
    int same = 0 ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      if ( S [ i ] == S [ N - 1 - i ] ) {
        same ++ ;
      }
    }
    same -- ;
    same = ( same / 2 ) ;
    if ( same == ( N / 2 ) ) {
      System . out . println ( 25 * ( N / 2 ) * 2 ) ;
    }
    else if ( same == ( N / 2 ) - 1 ) {
      System . out . println ( 25 * ( N / 2 - 1 ) * 2 + 24 * 2 + 25 ) ;
    }
    else {
      System . out . println ( 25 * N ) ;
    }
  }
  else {
    int same = 0 ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      if ( S [ i ] == S [ N - 1 - i ] ) {
        same ++ ;
      }
    }
    same = ( same / 2 ) ;
    if ( same == ( N / 2 ) ) {
      System . out . println ( 25 * N ) ;
    }
    else if ( same == ( N / 2 ) - 1 ) {
      System . out . println ( 25 * ( N / 2 - 1 ) * 2 + 24 * 2 ) ;
    }
    else {
      System . out . println ( 25 * N ) ;
    }
  }
  return S ;
}
