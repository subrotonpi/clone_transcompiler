static final long trialDivisionSqrt ( ) {
  final long n , m = Long . parseLong ( input . nextLine ( ) ) ;
  final long [ ] primeCount = new long [ n ] ;
  for ( int i = 2 ;
  i < ( int ) Math . sqrt ( n ) + 2 ;
  i ++ ) {
    while ( n % i == 0 ) {
      n /= i ;
      primeCount [ i ] ++ ;
    }
  }
  if ( n > 1 ) {
    primeCount [ ( int ) n ] ++ ;
  }
  final long [ ] cnt = trialDivision ( m ) ;
  long ans = 1 ;
  for ( final int item : cnt ) {
    long h = 1 ;
    long kFact = 1 ;
    for ( int i = 0 ;
    i < cnt [ item ] ;
    i ++ ) {
      h *= n + cnt [ item ] - 1 - i ;
      kFact *= ( i + 1 ) ;
    }
    ans *= h ;
    ans = ans / kFact ;
    ans = ans % ( 1000000000 + 7 ) ;
  }
  System . out . println ( ans ) ;
  return ans ;
}
