static final double [ ] [ ] t ( int n , int m , int k ) {
  Scanner in = new Scanner ( System . in ) ;
  int nSets = in . nextInt ( ) ;
  int n = in . nextInt ( ) ;
  int m = in . nextInt ( ) ;
  int n = in . nextInt ( ) ;
  System . out . println ( "Case #1:" ) ;
  ArrayList < Integer > possibilities = new ArrayList < > ( ) ;
  double [ ] [ ] probabilities = new double [ n ] [ ] ;
  int resultLength = 100000 ;
  for ( int i = 0 ;
  i < resultLength ;
  i ++ ) {
    int [ ] p = new int [ n ] ;
    for ( int j = 0 ;
    j < n ;
    j ++ ) p [ j ] = in . nextInt ( ) ;
    Arrays . sort ( p ) ;
    if ( possibilities . contains ( p ) ) probabilities [ possibilities . indexOf ( p ) ] += 1.0 / resultLength ;
    else {
      possibilities . add ( p ) ;
      probabilities [ possibilities . indexOf ( p ) ] += 1.0 / resultLength ;
    }
  }
  /* if (pas == 0) {
  return 1.0;
  } else {
  return 0.0;
  }*/
  double prob = 0.5 * probInSet ( n , m ) ;
  if ( n % m == 0 ) prob += 0.5 * probInSet ( n , m / n ) ;
  for ( int i = 0 ;
  i < nSets ;
  i ++ ) {
    int [ ] set = new int [ n ] ;
    for ( int j = 0 ;
    j < n ;
    j ++ ) {
      set [ j ] = in . nextInt ( ) ;
    }
    int best = possibilities . get ( best ) ;
    double bestProb = 0 ;
    for ( int p = 0 ;
    p < possibilities . size ( ) ;
    p ++ ) {
      double prob = probabilities [ p ] [ 0 ] ;
      for ( int s : set ) prob *= probInSet ( possibilities . get ( p ) , s ) ;
      if ( prob > bestProb ) {
        bestProb = prob ;
        best = possibilities . get ( p ) ;
      }
    }
    System . out . println ( Arrays . toString ( best ) ) ;
  }
  return probabilities ;
}
