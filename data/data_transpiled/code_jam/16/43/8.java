@ Nullable public static String getFailover ( String P , int i ) {
  int idx = P . indexOf ( i ) ;
  if ( idx % 2 == 0 ) return P . substring ( idx + 1 ) ;
  return P . substring ( idx - 1 ) ;
  /* to start */
  if ( k <= C ) return ( 0 , k , 2 ) ;
  if ( k <= R + C ) return ( k - C ) ;
  if ( k <= R + C ) return ( R - C ) ;
  if ( k <= R + 2 * C ) return ( R + 1 ) ;
  int [ ] B = new int [ R ] ;
  for ( int i = 0 ;
  i < R ;
  ++ i ) {
    B [ i ] = 0 ;
    for ( int j = 0 ;
    j < C ;
    ++ j ) {
      B [ i ] = cur % 2 ;
    }
  }
  if ( check ( R , C , B , P ) ) {
    StringBuilder sb = new StringBuilder ( ) ;
    for ( int i = 0 ;
    i < R ;
    ++ i ) {
      sb . append ( "" ) ;
      for ( int j = 0 ;
      j < C ;
      ++ j ) {
        sb . append ( B [ i ] . charAt ( j ) == '/' ? '\\' : '\\' ) ;
      }
    }
    return sb . toString ( ) ;
  }
  /* print "Case #{}:" */
  for ( String l : res ) System . out . println ( l ) ;
  /* print "Case #{}:" */
  if ( i == 0 ) {
    assert p == 2 ;
    return j ;
  }
  else if ( j == C + 1 ) {
    assert p == 3 ;
    return C + i ;
  }
  else if ( i == R + 1 ) {
    assert p == 0 ;
    return R + C + ( C + 1 - j ) ;
  }
  else if ( j == 0 ) {
    assert p == 1 ;
    return R + 2 * C + ( R + 1 - i ) ;
  }
  /* neighbours */
  int [ ] [ ] ADJ = new int [ ] [ ] {
    {
      3 , 1 }
      , {
        2 , 0 }
        , {
          1 , 3 }
          , {
            0 , 0 , 0 }
            , {
              2 , 3 }
              , {
                3 , 3 }
                , {
                  3 , 3 }
                }
                ;
                int ni = ADJ [ p ] [ B [ i - 1 ] [ j - 1 ] ] ;
                int nj = AD @ @