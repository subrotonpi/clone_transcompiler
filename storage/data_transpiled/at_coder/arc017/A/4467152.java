static final boolean isPrime ( int n ) {
  /* if (n<2) return false; if n == 2 == 2 return true; if n % 2 == 0 return false; */
  int i = 3 ;
  while ( i * i <= n ) {
    if ( n % i == 0 ) return false ;
    i += 2 ;
  }
  /* main loop */
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  /* print (isPrime(N)? "YES" : "NO"); */
  if ( isPrime ( N ) ) {
    /* print loop */
  }
  /* main loop */
  return true ;
}
