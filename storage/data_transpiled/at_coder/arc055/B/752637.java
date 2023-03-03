static final int [ ] read ( ) {
  return map . get ( input ( ) ) ;
  final int N = input ( ) ;
  if ( N == 1 ) {
    System . out . println ( 1 ) ;
    System . exit ( 0 ) ;
  }
  final int [ ] [ ] dp = new int [ N ] [ K + 1 ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    dp [ i ] [ i ] = 0 ;
  }
  dp [ ( N - 1 ) & 1 ] [ 0 ] = 0 ;
  for ( int s = 1 ;
  s <= K ;
  s ++ ) {
    dp [ ( N - 1 ) & 1 ] [ s ] = 1 / N / ( N - 1 ) ;
  }
  for ( int r = N - 2 ;
  r > 0 ;
  r -- ) {
    dp [ r & 1 ] [ 0 ] = dp [ ( r + 1 ) & 1 ] [ s ] ;
    for ( int s = 1 ;
    s <= K ;
    s ++ ) {
      dp [ r & 1 ] [ s ] = dp [ ( r + 1 ) & 1 ] [ s ] + max ( 1 / N + dp [ ( r + 1 ) & 1 ] [ s - 1 ] , dp [ ( r + 1 ) & 1 ] [ s ] ) / r ;
    }
  }
  int result = Math . max ( 1 / N + dp [ 1 ] [ K - 1 ] , dp [ 1 ] [ K ] ) ;
  System . out . println ( result ) ;
  return dp ;
}
