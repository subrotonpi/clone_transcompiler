public static List < Integer > inpl ( ) {
  return Lists . newArrayList ( ) ;
  int N = inpl ( ) ;
  int K = inpl ( ) ;
  int [ ] A = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) A [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] S = new int [ N + 1 ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) S [ i ] = 0 ;
  int tmp = 0 ;
  for ( int i = 0 ;
  i < A . length ;
  i ++ ) {
    tmp += A [ i ] ;
    S [ i ] = tmp ;
  }
  if ( Arrays . binarySearch ( A , K ) == 0 ) {
    System . out . println ( 1 ) ;
    exit ( ) ;
  }
  int [ ] DP = new int [ N ] ;
  DP [ 0 ] = 1 ;
  DP [ 1 ] = 10 * ( N - 1 ) ;
  for ( int i = 1 ;
  i < N ;
  i ++ ) {
    int [ ] DP2 = new int [ N ] ;
    DP2 [ 0 ] = 1 ;
    DP2 [ 1 ] = 10 * ( N - 1 ) ;
    for ( int j = 1 ;
    j <= i ;
    j ++ ) {
      tmp = DP [ j ] * ( S [ i ] - S [ i - 1 ] ) / S [ i - 1 ] + 1 ;
      DP2 [ j + 1 ] = Math . min ( DP [ j + 1 ] , tmp + DP [ j ] , DP2 [ j + 1 ] ) ;
    }
    DP = DP2 ;
  }
  for ( int i = list . size ( ) - 1 ;
  i >= 0 ;
  i -- ) {
    int d = list . get ( i ) ;
    if ( d <= K ) {
      System . out . println ( i ) ;
      break ;
    }
  }
  else {
    System . out . println ( 1 ) ;
  }
  return Lists . newArrayList ( DP ) ;
}
