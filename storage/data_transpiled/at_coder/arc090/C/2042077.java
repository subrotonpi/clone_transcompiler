@ MoreRequires ( "x" ) @ VisibleForTesting static Iterable < Integer > iterable ( Scanner in ) {
  final int MOD = 10 * 9 + 7 ;
  final int N = in . nextInt ( ) ;
  final int M = in . nextInt ( ) ;
  final int S = in . nextInt ( ) ;
  final int T = in . nextInt ( ) ;
  final int total = S * M ;
  final int sub = in . nextInt ( ) % MOD ;
  final int inf = in . nextInt ( ) ;
  final int [ ] [ ] E = new int [ N ] [ ] ;
  for ( int i = 0 ;
  i < N ;
  ++ i ) {
    E [ i ] = new int [ M ] ;
  }
  in . nextLine ( ) ;
  for ( int i = 0 ;
  i < N ;
  ++ i ) {
    E [ i ] [ 0 ] = in . nextInt ( ) ;
  }
  final int [ ] dS = new int [ N ] ;
  final int [ ] dT = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  ++ i ) {
    E [ i ] [ 1 ] = in . nextInt ( ) ;
  }
  final int [ ] dS = new int [ N ] ;
  final int [ ] dT = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  ++ i ) {
    E [ i ] [ 0 ] = in . nextInt ( ) ;
  }
  final int [ ] Q = new int [ N ] ;
  Q [ 0 ] = new int [ N ] ;
  Q [ 0 ] = new int [ N ] ;
  Q [ 1 ] = new int [ N ] ;
  Q [ 0 ] = new int [ N ] ;
  Q [ 1 ] = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  ++ i ) {
    Q [ i ] = Q [ i ] [ 0 ] = in . nextInt ( ) ;
  }
  if ( d * 2 > D ) {
    break ;
  }
  final int [ ] dM = dT ? dS : dS ;
  final int [ ] dN = dT ? dS : dT ;
  if ( dM [ v ] > d ) {
    dM [ v ] = d ;
    for ( int i = 0 ;
    i < N ;
    ++ i ) {
      final int u = E [ i ] [ 0 ] ;
      final int dd = E [ i ] [ 1 ] ;
      if ( dM [ v ] > d && ( d + dd ) * 2 <= D