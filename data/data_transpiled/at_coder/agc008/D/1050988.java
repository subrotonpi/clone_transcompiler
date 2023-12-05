public static int [ ] [ ] X ( ) {
  N = Integer . parseInt ( input . nextLine ( ) ) ;
  List < Integer > X = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) X . add ( Integer . parseInt ( input . nextLine ( ) ) ) ;
  int [ ] A = new int [ N * N ] ;
  List < Integer > sortedX = new ArrayList < > ( X ) ;
  Collections . sort ( sortedX ) ;
  int firstEmpty = 0 ;
  int lastEmpty = N * N - 1 ;
  int failFlag = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int x = sortedX . get ( i ) ;
    int K = X . indexOf ( x ) + 1 ;
    if ( A [ x - 1 ] == - 1 ) {
      A [ x - 1 ] = K ;
    }
    else {
      System . out . println ( "No" ) ;
      failFlag = 1 ;
      break ;
    }
    int K_rest = K - 1 ;
    while ( K_rest > 0 ) {
      do {
        if ( A [ firstEmpty ] == - 1 ) break ;
        firstEmpty = firstEmpty + 1 ;
      }
      while ( firstEmpty < x - 1 ) ;
      A [ firstEmpty ] = K ;
      K_rest = K_rest - 1 ;
      firstEmpty = firstEmpty + 1 ;
    }
    while ( K_rest > 0 ) ;
    if ( failFlag == 1 ) break ;
  }
  if ( failFlag == 0 ) {
    for ( int i = N - 1 ;
    i >= 0 ;
    i -- ) {
      int x = sortedX . get ( i ) ;
      int K = X . indexOf ( x ) + 1 ;
      int K_rest = N - K ;
      while ( K_rest > 0 ) {
        do {
          if ( A [ lastEmpty ] == - 1 ) break ;
          lastEmpty = lastEmpty - 1 ;
        }
        while ( lastEmpty > x - 1 ) ;
        A [ lastEmpty ] = K ;
        K_rest = K_rest - 1 ;
        lastEmpty = lastEmpty - 1 ;
      }
      while ( K_rest > 0 ) ;
      if ( lastEmpty > x - 1 ) {
        A [ lastEmpty ] = K ;
        K_rest = K_rest - 1 ;
        lastEmpty = lastEmpty - 1 ;
      }
      else {
        System . out . println ( "No" ) ;
        failFlag = 1 ;
        break ;
      }
    }
    if ( failFlag == 1 ) break ;
  }
  if ( failFlag == 0 ) {
    System . out . println