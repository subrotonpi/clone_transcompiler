public static int [ ] [ ] getans ( ) {
  int K = Integer . parseInt ( input . nextLine ( ) ) ;
  if ( K == 1 ) {
    System . out . println ( 1 ) ;
    System . out . println ( 1 ) ;
    exit ( ) ;
  }
  int N = 2 * ( ( K + 3 ) / 4 ) ;
  int [ ] [ ] ans = new int [ N ] [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    ans [ i ] [ 0 ] = 0 ;
  }
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    for ( int j = 0 ;
    j < N ;
    j ++ ) {
      ans [ i ] [ j ] = ( i + j ) % N + 1 ;
      if ( i % 2 && ans [ i ] [ j ] + N <= K ) {
        ans [ i ] [ j ] += N ;
      }
    }
  }
  System . out . println ( N ) ;
  for ( int row [ ] : ans ) {
    System . out . println ( ( int [ ] [ ] ) row ) ;
  }
  return ans ;
}
