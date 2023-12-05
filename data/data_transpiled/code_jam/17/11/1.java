public static int T = Integer . parseInt ( input ) {
  for ( int t = 1 ;
  t <= T ;
  t ++ ) {
    int R = Integer . parseInt ( input . nextLine ( ) ) ;
    int C = Integer . parseInt ( input . nextLine ( ) ) ;
    List < List < Integer >> A = new ArrayList < > ( ) ;
    for ( int r = 0 ;
    r < R ;
    r ++ ) {
      A . add ( new ArrayList < > ( ) ) ;
    }
    for ( int c = 1 ;
    c < C ;
    c ++ ) {
      if ( Arrays . equals ( A . get ( r ) , A . get ( c ) ) ) {
        for ( int r = 0 ;
        r < R ;
        r ++ ) {
          A . set ( r , c , A . get ( r ) . get ( c - 1 ) ) ;
        }
      }
    }
    for ( int c = C - 2 ;
    c >= 0 ;
    c -- ) {
      if ( Arrays . equals ( A . get ( r ) , A . get ( c ) ) ) {
        for ( int r = 0 ;
        r < R ;
        r ++ ) {
          A . set ( r , c , A . get ( r ) . get ( c + 1 ) ) ;
        }
      }
    }
    for ( int r = 1 ;
    r < R ;
    r ++ ) {
      for ( int c = 0 ;
      c < C ;
      c ++ ) {
        if ( A . get ( r ) . get ( c ) . equals ( A . get ( r ) ) ) {
          A . set ( r , c , A . get ( r - 1 ) . get ( c ) ) ;
        }
      }
    }
    for ( int r = R - 2 ;
    r >= 0 ;
    r -- ) {
      for ( int c = 0 ;
      c < C ;
      c ++ ) {
        if ( A . get ( r ) . get ( c ) . equals ( A . get ( r ) ) ) {
          A . set ( r , c , A . get ( r + 1 ) . get ( c ) ) ;
        }
      }
    }
    System . out . println ( "Case #" + t + ":" ) ;
    for ( int r = 0 ;
    r < R ;
    r ++ ) System . out . println ( A . get ( r ) ) ;
  }
  return T ;
}
