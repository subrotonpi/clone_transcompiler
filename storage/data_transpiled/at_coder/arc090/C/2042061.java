@ VisibleForTesting static Iterable < Pair < Integer , Integer >> iterable ( Scanner in ) {
  final int MOD = 10 * 9 + 7 ;
  final int N = in . nextInt ( ) ;
  final int M = in . nextInt ( ) ;
  final int S = in . nextInt ( ) ;
  final int T = in . nextInt ( ) ;
  final int sub = in . nextInt ( ) % MOD ;
  final int [ ] E = new int [ N ] ;
  final List < Pair < Integer , Integer >> lines = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    lines . add ( it ( in ) ) ;
  }
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    int u = in . nextInt ( ) ;
    int v = in . nextInt ( ) ;
    int d = in . nextInt ( ) % MOD ;
    E [ u - 1 ] = new Pair < > ( v - 1 , d ) ;
    E [ v - 1 ] = new Pair < > ( u , d ) ;
  }
  final int [ ] dS = new int [ N ] ;
  final int [ ] dT = new int [ N ] ;
  final List < Pair < Integer , Integer >> Q = new ArrayList < > ( ) ;
  Q . add ( new Pair < > ( 0 , S , false ) ) ;
  Q . add ( new Pair < > ( 0 , T , true ) ) ;
  double D = Double . POSITIVE_INFINITY ;
  while ( Q . size ( ) > 0 ) {
    int d = in . nextInt ( ) ;
    int v = in . nextInt ( ) ;
    boolean f = in . nextInt ( ) ;
    if ( d * 2 > D ) break ;
    final int [ ] dM = f ? dT : dS ;
    final int [ ] dN = f ? dS : dT ;
    if ( dM [ v ] == 0 ) {
      dM [ v ] = d ;
      for ( int u = 0 ;
      u < E [ v ] . length ;
      u ++ ) {
        final int dd = E [ v ] [ u ] ;
        if ( dM [ u ] == 0 && ( d + dd ) * 2 <= D ) {
          hq ( Q , new Pair < > ( d + dd , u , f ) ) ;
        }
      }
    }
    if ( dN [ v ] != 0 ) D = Math . min ( dN [ v ] + d , D ) ;
  }
  del ( Q ) ;
  return new Iterable