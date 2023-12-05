@ VisibleForTesting static int binarySearch ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int C = Integer . parseInt ( input . nextLine ( ) ) ;
  int K = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] t = new int [ N ] ;
  Arrays . sort ( t ) ;
  int ans = 0 ;
  int idx = 0 ;
  while ( idx < N ) {
    int inTimeIdx = Arrays . binarySearch ( t , t [ idx ] + K ) ;
    if ( ( inTimeIdx - 1 ) - idx + 1 <= C ) {
      idx = inTimeIdx ;
    }
    else {
      idx += C ;
    }
    ans ++ ;
  }
  return ans ;
}
