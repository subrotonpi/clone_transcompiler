@ Sys public static double [ ] [ ] solve ( ) {
  /* adj N */
  double [ ] [ ] X = identity ( N ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    double [ ] Y = ( outer ( ones ( N ) , X [ i ] ) + ( N - 1 ) * X ) / N ;
    Y [ i ] = X . length / N ;
    X = Y ;
  }
  /* adj N */
  int T = Integer . parseInt ( stdin . readLine ( ) ) ;
  double [ ] [ ] M = log ( adj ( 1000 ) ) ;
  for ( int t = 1 ;
  t <= T ;
  t ++ ) {
    int N = Integer . parseInt ( stdin . readLine ( ) ) ;
    assert N == 1000 ;
    int [ ] P = new int [ N ] ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      P [ i ] = Integer . parseInt ( stdin . readLine ( ) ) ;
    }
    double l = 0.0 ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) l += M [ i ] [ P [ i ] ] + log ( N ) ;
    System . out . println ( "Case #" + t + ": " + ( l < 0.0 ? "GOOD" : "BAD" ) ) ;
  }
  return M ;
}
