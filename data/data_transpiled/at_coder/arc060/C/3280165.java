public static int [ ] [ ] readIntArrayWithDefault ( Scanner input ) {
  int N = input . nextInt ( ) ;
  int [ ] X = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) X [ i ] = input . nextInt ( ) ;
  int L = input . nextInt ( ) ;
  int Q = input . nextInt ( ) ;
  int [ ] V = new int [ N ] ;
  int ib = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    while ( X [ i ] - X [ ib ] > L ) {
      V [ ib ] = i - 1 ;
      ib ++ ;
    }
  }
  while ( ib != N - 1 ) {
    V [ ib ] = N - 1 ;
    ib ++ ;
  }
  int [ ] [ ] dbl = new int [ 18 ] [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    dbl [ i ] = new int [ N ] ;
    for ( int j = 0 ;
    j < N ;
    j ++ ) {
      dbl [ i ] [ j ] = input . nextInt ( ) ;
    }
  }
  dbl [ 0 ] = V ;
  for ( int i = 1 ;
  i < 18 ;
  i ++ ) {
    for ( int j = 0 ;
    j < N ;
    j ++ ) {
      int ii = dbl [ i - 1 ] [ j ] ;
      if ( ii == 0 ) {
        break ;
      }
      dbl [ i ] [ j ] = dbl [ i - 1 ] [ ii ] ;
    }
  }
  for ( int i = 0 ;
  i < Q ;
  i ++ ) {
    int a = Integer . parseInt ( input . next ( ) ) ;
    int b = Integer . parseInt ( input . next ( ) ) ;
    a = new Integer [ a ] ;
    b = new Integer [ b ] ;
    a -- ;
    b -- ;
    int ind = a ;
    int ans = 0 ;
    for ( int j = 17 ;
    j >= 0 ;
    j -- ) {
      if ( dbl [ j ] [ ind ] == 0 ) {
        continue ;
      }
      if ( dbl [ j ] [ ind ] > b ) {
        continue ;
      }
      if ( dbl [ j ] [ ind ] == b ) {
        ans |= 1 << j ;
        break ;
      }
      else {
        ans |= 1 << j ;
        ind = dbl [ j ] [ ind ] ;
      }
    }
    else {
      ans ++ ;
    }
    System . out . println ( ans ) ;
  }
  return dbl ;
}
