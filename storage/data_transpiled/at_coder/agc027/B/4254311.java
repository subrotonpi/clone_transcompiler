@ VisibleForTesting static Iterable < Integer > accumulate ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int X = Integer . parseInt ( input . nextLine ( ) ) ;
  List < Integer > dustAcc = new ArrayList < > ( 0 ) ;
  dustAcc . add ( 0 ) ;
  Collections . addAll ( dustAcc , Collections . singletonList ( 0 ) ) ;
  dustAcc . add ( dustAcc . size ( ) - 1 ) ;
  int [ ] coef = new int [ N - 1 ] ;
  for ( int i = 0 ;
  i < N - 1 ;
  i ++ ) {
    coef [ i ] = 5 ;
    coef [ i ] = 5 + i * 2 ;
  }
  int ans = Integer . MAX_VALUE ;
  for ( int robotCount = 1 ;
  robotCount <= N ;
  robotCount ++ ) {
    int cost = Math . pow ( ( plus - minus ) * coef [ robotCount ] , N ) + robotCount * X ;
    if ( ans > cost ) {
      ans = cost ;
    }
  }
  System . out . println ( ans + N * X ) ;
  return dustAcc ;
}
