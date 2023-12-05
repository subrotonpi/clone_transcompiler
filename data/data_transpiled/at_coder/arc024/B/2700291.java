@ VisibleForTesting static int ceil ( int input ) {
  int N = Integer . parseInt ( input ) ;
  int [ ] C = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    C [ i ] = Integer . parseInt ( input ) ;
  }
  Arrays . sort ( C ) ;
  if ( Sets . newHashSet ( C ) . size ( ) == 1 ) {
    System . out . println ( - 1 ) ;
  }
  else {
    int X = 1 ;
    int tmp = 1 ;
    for ( int i = 0 ;
    i < C . length ;
    i ++ ) {
      if ( C [ i ] == C [ i - 1 ] ) {
        tmp ++ ;
      }
      else {
        X = Math . max ( X , tmp ) ;
        tmp = 1 ;
      }
    }
    System . out . println ( Math . ceil ( X / 2 ) ) ;
  }
  return X ;
}
