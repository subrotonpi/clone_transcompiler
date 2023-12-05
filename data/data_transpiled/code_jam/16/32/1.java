private static String solve ( ) {
  r = new Scanner ( System . in ) ;
  int N , K ;
  N = Integer . parseInt ( r . nextLine ( ) ) ;
  K = Integer . parseInt ( r . nextLine ( ) ) ;
  if ( K > 2 * ( N - 2 ) ) return "IMPOSSIBLE" ;
  int [ ] [ ] grid = new int [ N ] [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) for ( int j = i + 1 ;
  j < N ;
  j ++ ) grid [ i ] [ j ] = 1 ;
  for ( int i = 1 ;
  i < N ;
  i ++ ) {
    int exp = Math . max ( N - 2 - i , 0 ) ;
    if ( K >= 2 * exp ) {
      grid [ 0 ] [ i ] = 1 ;
      K -= 2 * exp ;
    }
  }
  return "\n" + "POSSIBLE" + map ( "" , grid ) ;
}
