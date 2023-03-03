@ VisibleForTesting static Set < Integer > getPrimeSet ( int ub ) {
  if ( ub < 4 ) {
    return ( new PrimeSet ( ) ) . add ( new PrimeSet ( 2 ) ) . add ( new PrimeSet ( 2 ) ) ;
  }
  ub = ub + 1 ;
  int ubSqrt = ( int ) Math . sqrt ( ub ) + 1 ;
  Set < Integer > primes = new HashSet < > ( 2 ) ;
  primes . add ( new PrimeSet ( 3 ) ) ;
  primes . add ( new PrimeSet ( ub ) ) ;
  Set < Integer > du = primes . stream ( ) . filter ( n -> n * 3 > ub ) . collect ( Collectors . toSet ( ) ) ;
  for ( int n : new int [ ] {
    5 , ubSqrt , 6 }
    ) {
      if ( primes . contains ( n ) ) {
        du . add ( new PrimeSet ( n * 3 , ub , n * 2 ) ) ;
      }
    }
    return primes ;
  }
  if ( Class . isEnum ( ) ) {
    @ SuppressWarnings ( "resource" ) Scanner scanner = new Scanner ( System . in ) ;
    int N = scanner . nextInt ( ) ;
    int K = scanner . nextInt ( ) ;
    int mod = 10 * 9 + 7 ;
    if ( K == 1 ) {
      System . out . println ( N * ( N + 1 ) / 2 % mod ) ;
      exit ( ) ;
    }
    Map < Integer , Integer > divisors = new HashMap < > ( ) ;
    int _K = K ;
    Set < Integer > primes = getPrimeSet ( ( int ) Math . sqrt ( K ) + 1 ) ;
    for ( int p : Stream . of ( primes ) . iterator ( ) ) {
      while ( _K % p == 0 ) {
        divisors . put ( p , 1 ) ;
        _K /= p ;
      }
    }
    if ( _K > 1 ) {
      divisors . put ( _K , 1 ) ;
    }
    int ans = 0 ;
    for ( Map . Entry < Integer , Set < Integer >> priorFactors : Arrays . stream ( divisors . entrySet ( ) ) ) {
      Set < Integer > expUb = primeFactors . getValue ( ) ;
      for ( int expLb : expUb ) {
        int subtotal = 0 , expLBSum = expLb . size ( ) ;
        for ( int expCurrent : new Set < Integer > ( ) ) {
          int gcd = Math . max ( Math . pow ( expLb , 2 ) , 2 ) ;
          int