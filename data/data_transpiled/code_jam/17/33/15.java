public static double check ( double V , double U , double [ ] P ) {
  return check ( V , U , P ) ;
  /* solve N and K */
  double L = 0.0 , R = 1.0 ;
  if ( ( R = check ( R , U , P ) ) == 0 ) return R ;
  while ( R - L > 1e-10 ) {
    double M = ( L + R ) / 2.0 ;
    if ( check ( M , U , P ) ) L = M ;
    else R = M ;
  }
  double res = 1.0 ;
  for ( int i = 0 ;
  i < P . length ;
  i ++ ) res *= Math . max ( P [ i ] , L ) ;
  /* check N and K */
  int T = Integer . parseInt ( readLine ( ) ) ;
  for ( int t = 0 ;
  t < T ;
  t ++ ) {
    N = Integer . parseInt ( readLine ( ) ) ;
    K = Integer . parseInt ( readLine ( ) ) ;
    U = Double . parseDouble ( readLine ( ) ) ;
    P = Double . parseDouble ( readLine ( ) ) ;
    double res = solve ( N , K , U , P ) ;
    System . out . println ( "Case #" + ( t + 1 ) + ": " + res ) ;
  }
  return res ;
}
