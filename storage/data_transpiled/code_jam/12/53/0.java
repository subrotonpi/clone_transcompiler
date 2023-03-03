@ org . python . Method ( __doc__ = "" ) public static int [ ] readInts ( ) {
  /* read ints from stdin */
  int [ ] ints = new int [ 3 ] ;
  for ( int i = 0 ;
  i < ints . length ;
  i ++ ) {
    ints [ i ] = Integer . parseInt ( new String ( ints [ i ] ) ) ;
  }
  /* score M, S0, C0, S */
  int m = Math . min ( ( M - t * C0 ) / p , t * ( S - S0 ) ) ;
  if ( m >= 0 ) {
    return t * S0 + m ;
  }
  else {
    return - 1 ;
  }
  final int T = Integer . parseInt ( new String ( "" ) ) ;
  for ( int cas = 1 ;
  cas <= T ;
  cas ++ ) {
    final int M = Integer . parseInt ( new String ( "" ) ) ;
    final int F = Integer . parseInt ( new String ( "" ) ) ;
    final int N = Integer . parseInt ( new String ( "" ) ) ;
    final int [ ] [ ] food = new int [ N ] [ ] ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      food [ i ] = readInts ( ) ;
    }
    Arrays . sort ( food ) ;
    int ans = 0 ;
    int S = 0 ;
    int C = F ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      final int [ ] foo = food [ i ] ;
      final int p = foo [ 0 ] ;
      final int s = foo [ 1 ] + 1 ;
      if ( s > S ) {
        S0 = S ;
        C0 = C ;
        S = s ;
        C += ( S - S0 ) * p ;
        final int minT = M / ( p * ( S - S0 ) + C0 ) ;
        ans = Math . max ( ans , score ( M , S0 , C0 , S , minT , p ) ) ;
        ans = Math . max ( ans , score ( M , S0 , C0 , S , minT + 1 , p ) ) ;
        final int maxT = M / C0 ;
        ans = Math . max ( ans , score ( M , S0 , C0 , S , maxT , p ) ) ;
      }
    }
  }
  System . out . println ( "Case #" + cas + ": " + ans ) ;
  return ints ;
}
