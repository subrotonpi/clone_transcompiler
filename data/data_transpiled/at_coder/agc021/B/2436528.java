public static double [ ] [ ] eval ( ) {
  int N = Integer . parseInt ( input ( ) ) ;
  List < Integer > P = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    P . add ( Collections . singletonList ( Integer . parseInt ( input ( ) ) ) ) ;
  }
  Map < Integer , Integer > MP = new HashMap < > ( ) ;
  for ( int i = 0 ;
  i < P . size ( ) ;
  i ++ ) {
    MP . put ( Integer . parseInt ( input ( ) ) , i ) ;
  }
  /* cross the C */
  List < Integer > C = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < P . size ( ) ;
  i ++ ) {
    P . add ( P . get ( i ) ) ;
  }
  /* convex hull */
  P . sort ( ) ;
  List < Integer > Q = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < P . size ( ) ;
  i ++ ) {
    while ( ++ i < Q . size ( ) && cross ( Q . get ( Q . size ( ) - 2 ) , Q . get ( Q . size ( ) - 1 ) , P . get ( i ) ) >= 0 ) Q . remove ( i ) ;
    Q . add ( P . get ( i ) ) ;
  }
  int k = Q . size ( ) ;
  for ( int i = P . size ( ) - 1 ;
  i >= 0 ;
  -- i ) {
    while ( k < Q . size ( ) && cross ( Q . get ( Q . size ( ) - 2 ) , Q . get ( Q . size ( ) - 1 ) , P . get ( i ) ) >= 0 ) Q . remove ( k -- ) ;
    Q . add ( P . get ( i ) ) ;
  }
  @ SuppressWarnings ( "unchecked" ) List < Integer > [ ] ans = new ArrayList < > ( N ) ;
  ans [ 0 ] = 0. ;
  for ( int i = 0 ;
  i < K ;
  i ++ ) {
    int [ ] S = Q . get ( i - 1 ) ;
    int [ ] T = Q . get ( i ) ;
    int [ ] U = Q . get ( ( i + 1 ) % K ) ;
    int X0 = T [ 0 ] - S [ 0 ] ;
    int X1 = U [ 0 ] - T [ 0 ] ;
    int Y0 = T [