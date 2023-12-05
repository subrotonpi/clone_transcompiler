public static int [ ] ints ( ) {
  return ArrayUtil . ints ( new Scanner ( System . in ) . nextLine ( ) . split ( " " ) ) ;
  int numCases = ints ( ) , M = 1000000 ;
  ArrayList < Integer > primes = new ArrayList < > ( ) ;
  primes . add ( 2 ) ;
  primes . add ( 3 ) ;
  for ( int q : xrange ( 5 , M , 2 ) ) {
    boolean isPrime = true ;
    for ( int p : primes ) {
      if ( p * p > q ) break ;
      if ( q % p == 0 ) {
        isPrime = false ;
        break ;
      }
    }
    if ( isPrime ) {
      primes . add ( q ) ;
    }
  }
  for ( int caseNum : xrange ( 1 , numCases + 1 ) ) {
    int n = Integer . parseInt ( System . in . nextLine ( ) ) ;
    int res = 1 ;
    for ( int p : primes ) {
      int k = 0 ;
      int x = 1 ;
      while ( x <= n ) {
        k ++ ;
        x *= p ;
      }
      res += Math . max ( 0 , k - 2 ) ;
    }
    if ( n == 1 ) {
      res = 0 ;
    }
    System . out . println ( "Case #" + caseNum + ": " + res ) ;
  }
  return new int [ numCases ] ;
}
