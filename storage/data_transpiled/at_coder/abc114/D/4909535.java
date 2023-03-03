public static Map < Integer , Integer > findPrimes ( int n ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  {
    List < Integer > nums = new LinkedList < > ( ) ;
    for ( int i = 2 ;
    i <= n ;
    i ++ ) nums . add ( i ) ;
    Map < Integer , Integer > primes = new ArrayList < > ( ) ;
    while ( nums . size ( ) > 0 ) {
      int p = nums . get ( 0 ) ;
      primes . add ( p ) ;
      for ( int i = 0 ;
      i < 6 ;
      i ++ ) nums . clear ( ) ;
      nums . add ( nums . get ( i ) ) ;
    }
    nums . clear ( ) ;
    for ( int i = 0 ;
    i < nums . size ( ) ;
    i ++ ) nums . add ( nums . get ( i ) ) ;
    assert ( findPrimes ( 30 ) [ 9 ] == 29 ) ;
  }
  {
    List < Integer > nums = new LinkedList < > ( ) ;
    for ( int i = 1 ;
    i <= n ;
    i ++ ) nums . add ( i ) ;
    Map < Integer , Integer > primes = findPrimes ( n ) ;
    Map < Integer , Integer > ret = new HashMap < > ( ) ;
    for ( int i = 0 ;
    i < primes . size ( ) ;
    i ++ ) ret . put ( primes . get ( i ) , 0 ) ;
    for ( int i = 0 ;
    i < primes . size ( ) ;
    i ++ ) {
      int s = Integer . parseInt ( nums . get ( i ) ) ;
      ret . put ( primes . get ( i ) , s ) ;
      while ( s > 0 ) nums . clear ( ) ;
      s = Integer . parseInt ( nums . get ( i ) ) ;
      ret . put ( primes . get ( i ) , s ) ;
    }
    return ret ;
  }
  assert ( primesOfFactor ( 25 ) [ 5 ] == 6 ) ;
  Map < Integer , Integer > primes = primesOfFactor ( N ) ;
  int answer = primes . values ( ) . stream ( ) . filter ( v -> v >= 74 ) . count ( ) ;
  @ SuppressWarnings ( "unchecked" ) Map . Entry < Integer , Integer > entry = primes . entrySet ( ) . stream ( ) . filter ( v -> v >= 2 ) . findFirst ( ) . entrySet ( ) . stream ( ) . filter ( v -> v > 3 ) . findFirst ( ) . entrySet ( ) . stream ( ) .