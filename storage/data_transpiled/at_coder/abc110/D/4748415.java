public static int n = Integer . parseInt ( input ) {
  final int m = Integer . parseInt ( input . nextLine ( ) ) ;
  final int n = Integer . parseInt ( input . nextLine ( ) ) ;
  final int m = Integer . parseInt ( input . nextLine ( ) ) ;
  final Map < Integer , Integer > tds = new LinkedHashMap < > ( ) ;
  for ( int i = 2 ;
  i <= ( int ) Math . sqrt ( n ) ;
  i ++ ) {
    while ( n % i == 0 ) {
      n /= i ;
      primeCount . put ( i , 1 ) ;
    }
  }
  if ( n > 1 ) {
    primeCount . put ( n , 1 ) ;
  }
  return primeCount . size ( ) ;
}
