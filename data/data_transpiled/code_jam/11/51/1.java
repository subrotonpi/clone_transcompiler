static public int [ ] solve ( int W , int [ ] [ ] L , int [ ] [ ] U , int [ ] [ ] G ) {
  int area = 0 ;
  for ( int i = 0 ;
  i < L . length - 1 ;
  i ++ ) {
    area -= ( L [ i + 1 ] [ 0 ] - L [ i ] [ 0 ] ) * ( L [ i + 1 ] [ 1 ] + L [ i ] [ 1 ] ) ;
  }
  int [ ] [ ] U = new int [ U . length - 1 ] [ ] ;
  for ( int i = 0 ;
  i < U . length - 1 ;
  i ++ ) {
    area += ( U [ i + 1 ] [ 0 ] - U [ i ] [ 0 ] ) * ( U [ i + 1 ] [ 1 ] + U [ i ] [ 1 ] ) ;
  }
  int [ ] [ ] res = solve ( W , L , U , G ) ;
  int N = Integer . parseInt ( readLine ( ) ) ;
  for ( int test = 0 ;
  test < N ;
  test ++ ) {
    int [ ] answer = doTest ( input ) ;
    System . out . println ( "Case #" + ( test + 1 ) + ":" ) ;
    for ( int x = 0 ;
    x < answer . length ;
    x ++ ) System . out . flush ( ) ;
  }
  double part = area * 1. / G ;
  int [ ] cuts = new int [ G . length - 1 ] ;
  int iL = 0 ;
  int iU = 0 ;
  double w = U [ 0 ] [ 1 ] - L [ 0 ] [ 1 ] ;
  double a = 0 ;
  double x = 0 ;
  do {
    double sL = ( L [ iL + 1 ] [ 1 ] - L [ iL ] [ 1 ] ) * 1. / ( L [ iL + 1 ] [ 0 ] - L [ iL ] [ 0 ] ) ;
    double sU = ( U [ iU + 1 ] [ 1 ] - U [ iU ] [ 1 ] ) * 1. / ( U [ iU + 1 ] [ 0 ] - U [ iU ] [ 0 ] ) ;
    double s = sU - sL ;
    int nxL = L [ iL + 1 ] [ 0 ] ;
    int nxU = U [ iU + 1 ] [ 0 ] ;
    int nx = Math . min ( nxL , nxU ) ;
    double na = 2 * w