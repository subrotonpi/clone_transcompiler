II = new II ( ) {
  public static int getInt ( String input ) {
    return Integer . parseInt ( input ) ;
  }
  public static int getInt ( String input ) {
    return Integer . parseInt ( input ) ;
  }
  public static int getInt ( String input ) {
    int N = II . getInt ( ) ;
    int [ ] A = new int [ N + 1 ] ;
    int [ ] B = new int [ N + 1 ] ;
    int [ ] C = new int [ N + 1 ] ;
    int [ ] s = new int [ N + 1 ] ;
    for ( int i = 1 ;
    i <= N ;
    i ++ ) {
      s [ i ] = i ;
    }
    int ia = N - 1 ;
    int [ ] ns = new int [ N ] ;
    ns [ 0 ] = 0L ;
    for ( int ib = N - 1 ;
    ib >= 0 ;
    ib -- ) {
      while ( ia >= 0 && A [ ia ] >= B [ ib ] ) {
        ia -- ;
      }
      if ( ia >= 0 ) {
        ns [ ib ] = s [ ia ] ;
      }
      else {
        ns [ ib ] = 0 ;
      }
    }
    for ( int i = 1 ;
    i <= N ;
    i ++ ) {
      ns [ i ] += ns [ i - 1 ] ;
    }
    s = ns ;
    int ib = N - 1 ;
    ns = new int [ N ] ;
    for ( int ic = N - 1 ;
    ic >= 0 ;
    ic -- ) {
      while ( ib >= 0 && B [ ib ] >= C [ ic ] ) {
        ib -- ;
      }
      if ( ib >= 0 ) {
        ns [ ic ] = s [ ib ] ;
      }
      else {
        ns [ ic ] = 0 ;
      }
    }
    return Integer . parseInt ( ns [ 0 ] ) ;
  }
  public static void main ( String [ ] args ) {
    int i ;
    int [ ] A = new int [ N + 1 ] ;
    int [ ] B = new int [ N + 1 ] ;
    int [ ] C = new int [ N + 1 ] ;
    for ( int i = 1 ;
    i <= N ;
    i ++ ) {
      A [ i ] = A [ i ] ;
      B [ i ] = B [ i ] ;
      C [ i ] = C [ i ] ;
    }
    int [ ] s = new int [ N + 1 ] ;
    for ( int i = 1 ;
    i <= N ;
    i ++ ) {
      s [ i ] = i ;
    }
    int ia = N - 1 ;
    int [ ] ns = new int [ N ] ;
    for ( int