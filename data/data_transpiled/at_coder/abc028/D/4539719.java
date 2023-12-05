public static int N = Integer . parseInt ( input ) {
  int K = Integer . parseInt ( input . nextLine ( ) ) ;
  if ( N == 1 ) {
    System . out . println ( 1 ) ;
  }
  else if ( N == 2 ) {
    System . out . println ( 0.5 ) ;
  }
  else {
    if ( K == 1 || K == N ) {
      System . out . println ( ( 1 + 3 * ( N - 1 ) ) / ( N * N * 3 ) ) ;
    }
    else {
      System . out . println ( ( 6 * ( K - 1 ) * ( N - K ) + 3 * ( N - 1 ) + 1 ) / ( N * N * 3 ) ) ;
    }
  }
  return N ;
}
