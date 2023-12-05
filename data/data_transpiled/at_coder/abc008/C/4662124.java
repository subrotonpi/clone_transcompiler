@ VisibleForTesting static int solve ( int [ ] C , int i , int N ) {
  int divisorSum = 0 ;
  for ( int j = 0 ;
  j < N ;
  j ++ ) {
    if ( j == i ) {
      continue ;
    }
    else if ( C [ i ] % C [ j ] == 0 ) {
      divisorSum ++ ;
    }
  }
  if ( divisorSum != 0 ) {
    return ( ceil ( ( divisorSum + 1 ) / 2 ) / ( divisorSum + 1 ) ) ;
  }
  else {
    return 1 ;
  }
}
