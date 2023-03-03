@ VisibleForTesting static int factorial ( int N , int P ) {
  int [ ] A = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    A [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  int oddCnt = 0 ;
  int evencnt = 0 ;
  for ( int i = 0 ;
  i < A . length ;
  i ++ ) {
    if ( A [ i ] % 2 == 1 ) {
      oddCnt ++ ;
    }
    else {
      evencnt ++ ;
    }
  }
  int even = 2 * evencnt ;
  int odd = 0 ;
  if ( P == 0 ) {
    for ( int i = 0 ;
    i <= oddCnt ;
    i += 2 ) {
      odd += fact ( oddCnt ) / ( fact ( i ) * fact ( oddCnt - i ) ) ;
    }
  }
  else {
    for ( int i = 1 ;
    i <= oddCnt ;
    i += 2 ) {
      odd += fact ( oddCnt ) / ( fact ( i ) * fact ( oddCnt - i ) ) ;
    }
  }
  return even * odd ;
}
