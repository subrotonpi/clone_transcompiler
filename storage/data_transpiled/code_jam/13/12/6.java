public static int T = Integer . parseInt ( input ) {
  for ( int tc = 0 ;
  tc < T ;
  tc ++ ) {
    int E = Integer . parseInt ( input . nextLine ( ) ) ;
    int R = Integer . parseInt ( input . nextLine ( ) ) ;
    int N = Integer . parseInt ( input . nextLine ( ) ) ;
    int [ ] v = Lists . newArrayList ( ) ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) v [ i ] = Lists . newArrayList ( ) ;
    float gainz = 0 ;
    int e = E ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      int spend = e ;
      for ( int j = i ;
      j < N ;
      j ++ ) {
        if ( v [ j ] > v [ i ] ) spend = Math . min ( spend , e + R * ( j - i ) - E ) ;
      }
      spend = Math . max ( spend , 0 ) ;
      e -= spend ;
      e = Math . min ( e + R , E ) ;
      gainz += v [ i ] * spend ;
    }
    System . out . println ( "Case #" + ( tc + 1 ) + ": " + gainz ) ;
  }
  return T ;
}
