@ VisibleForTesting static int from ( String input ) {
  int N = Integer . parseInt ( input ) ;
  int M = Integer . parseInt ( input ) ;
  int AN = Math . abs ( N ) ;
  int MOD = 10 * 9 + 7 ;
  Map < Integer , Integer > factors = new HashMap < > ( ) ;
  int p = 2 ;
  int n = AN ;
  while ( p * p <= AN ) {
    while ( n % p == 0 ) {
      n /= p ;
      factors . put ( p , ++ p ) ;
    }
    p ++ ;
  }
  if ( n != 1 ) {
    factors . put ( n , ++ p ) ;
  }
  return ( a * b ) % MOD ;
}
