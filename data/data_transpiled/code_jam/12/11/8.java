@ VisibleForTesting static void solve ( Scanner in ) {
  int T = in . nextInt ( ) ;
  for ( int t = 1 ;
  t <= T ;
  t ++ ) {
    int A = in . nextInt ( ) , B = in . nextInt ( ) ;
    double [ ] P = in . nextDouble ( ) ;
    double best = B + 2 ;
    double probCorr = 1.0 ;
    for ( int bs = A ;
    bs >= 0 ;
    bs -- ) {
      double curr = probCorr * ( 2 * bs + B - A + 1 ) + ( 1 - probCorr ) * ( 2 * bs + B - A + 1 + B + 1 ) ;
      best = Math . min ( best , curr ) ;
      if ( bs > 0 ) probCorr *= P [ A - bs ] ;
    }
    System . out . printf ( "Case #%d: %.13f%n" , t , best ) ;
  }
}
