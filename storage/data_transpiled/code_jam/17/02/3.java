@ org . python . Method ( __doc__ = "" ) public static org . python . Object __test__ ( ) {
  /* Eprint */
  System . out . println ( "Test #" + ( test + 1 ) + ": " + res ) ;
  /* LN */
  /* LN */
  String s = "" ;
  /* LN */
  s = "" ;
  /* LN */
  INF = Double . MAX_VALUE ;
  for ( int test = 0 ;
  test < T ;
  test ++ ) {
    s = "" ;
    /* LN */
    s = "" ;
    /* LN */
    s = "" ;
    /* LN */
    int len = s . length ( ) ;
    /* LN */
    int prev = 9 ;
    /* LN */
    int ind = 0 ;
    /* LN */
    for ( int i = 1 ;
    i < len ;
    i ++ ) {
      if ( s . charAt ( i ) < s . charAt ( i - 1 ) ) {
        /* LN */
        ind = i ;
        break ;
      }
    }
    /* LN */
    if ( ind != 0 ) {
      for ( int i = ind + 1 ;
      i < len ;
      i ++ ) {
        s . charAt ( i ) = 9 ;
      }
      while ( ind != 0 && s . charAt ( ind ) < s . charAt ( ind - 1 ) ) {
        /* LN */
        s . charAt ( ind - 1 ) -- ;
        /* LN */
        ind -- ;
      }
    }
    /* LN */
    res = Integer . parseInt ( s . substring ( 0 , ind ) ) ;
    /* LN */
    System . out . println ( "Case #" + ( test + 1 ) + ": " + res ) ;
  }
  return res ;
}
