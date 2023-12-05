static final Scanner in = new Scanner ( System . in ) {
  final Scanner in = new Scanner ( System . in ) ;
  {
    final Map < Integer , List < Integer >> composites = new HashMap < > ( ) ;
    int candidate = 2 ;
    do {
      if ( ! composites . containsKey ( candidate ) ) {
        in . next ( ) ;
        composites . put ( candidate * candidate , new ArrayList < > ( ) ) ;
      }
      else {
        for ( int p : composites . get ( candidate ) ) {
          composites . computeIfAbsent ( p + candidate , k -> new ArrayList < > ( ) ) . add ( p ) ;
        }
        composites . remove ( candidate ) ;
      }
      candidate ++ ;
    }
    while ( true ) ;
  }
  while ( true ) {
    if ( ! composites . containsKey ( candidate ) ) {
      in . next ( ) ;
      composites . put ( candidate * candidate , new ArrayList < > ( ) ) ;
    }
    else {
      for ( int p : composites . get ( candidate ) ) {
        composites . computeIfAbsent ( p + candidate , k -> new ArrayList < > ( ) ) . add ( p ) ;
      }
      composites . remove ( candidate ) ;
    }
    candidate ++ ;
  }
  final Set < Integer > powers = new HashSet < > ( ) ;
  final double pmax = 1e12 ;
  for ( int p : genPrimes ( ) ) {
    double power = p * p ;
    if ( power > pmax ) break ;
    while ( power < pmax ) {
      powers . add ( power ) ;
      power *= p ;
    }
  }
  return new Scanner ( in ) {
    @ Override public int getSpread ( int N ) {
      if ( N == 1 ) return 0 ;
      return 1 + Arrays . stream ( powers ) . filter ( N >= p ) . count ( ) ;
    }
  }
  ;
}
