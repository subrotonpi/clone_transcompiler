@ VisibleForTesting static int factorial ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int K = Integer . parseInt ( input . nextLine ( ) ) ;
  if ( N <= K ) {
    int m = K % N ;
    System . out . println ( factorial ( N ) / factorial ( N - m ) / factorial ( m ) % ( 10 * * 9 + 7 ) ) ;
  }
  else {
    System . out . println ( factorial ( N + K - 1 ) / factorial ( N - 1 ) / factorial ( K ) % ( 10 * * 9 + 7 ) ) ;
  }
  return N ;
}
