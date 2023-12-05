public static int mod ( @ Nonnegative int k , int c ) {
  int ret = 0 ;
  for ( String n : String . valueOf ( k ) ) {
    ret = ( ret * 10 + Integer . parseInt ( n ) ) % c ;
  }
  return ret ;
  /* strangeMap(N, a, k, B) */
  IntList route = new IntList ( ) ;
  int idx = a - 1 ;
  while ( ! route . contains ( idx ) ) {
    route . add ( idx ) ;
    idx = B . get ( idx ) - 1 ;
  }
  int cycleStart = idx ;
  if ( k < route . size ( ) ) {
    return route . get ( k ) + 1 ;
  }
  int T = route . indexOf ( cycleStart ) ;
  int C = route . size ( ) - T ;
  return route . get ( ( k - T ) % C + T ) + 1 ;
}
