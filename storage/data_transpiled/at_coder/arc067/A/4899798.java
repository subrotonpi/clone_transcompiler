@ VisibleForTesting static LinkedHashMap < Integer , Integer > primes ( ) {
  LinkedHashMap < Integer , Integer > primes = new LinkedHashMap < > ( ) ;
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  final int [ ] primes = new int [ N + 1 ] ;
  for ( int i = 2 ;
  i < primes . length ;
  i ++ ) {
    primes [ i ] ++ ;
  }
  return primes ;
}
