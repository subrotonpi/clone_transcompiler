static final int factorial ( ) {
  double N = Math . factorial ( Integer . parseInt ( input . nextLine ( ) ) ) ;
  double i = 2 ;
  double ans = 1 ;
  double M = 10 * 9 + 7 ;
  while ( i * i <= N ) {
    int cnt = 1 ;
    while ( N % i == 0 ) {
      cnt ++ ;
      N /= i ;
    }
    ans *= cnt ;
    i ++ ;
  }
  if ( N != 1 ) ans *= 2 ;
  System . out . println ( ( int ) ( ans % M ) ) ;
  return N ;
}
