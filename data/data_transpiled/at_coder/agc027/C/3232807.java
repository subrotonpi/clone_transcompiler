public static void print ( String input ) {
  int n = Integer . parseInt ( input ) ;
  int m = Integer . parseInt ( input ) ;
  byte [ ] s = new byte [ n ] ;
  int [ ] ali = new int [ n ] ;
  int [ ] bli = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    s [ i ] = 0 ;
  }
  @ SuppressWarnings ( "unchecked" ) LinkedHashMap < Integer , Integer > graphAB = ( LinkedHashMap < Integer , Integer > ) new LinkedHashMap < Integer , Integer > ( ) ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    int u = Integer . parseInt ( input ) ;
    int v = Integer . parseInt ( input ) ;
    graphAB . put ( u , v ) ;
    graphAB . put ( v , u ) ;
  }
  {
    int i ;
    /* increment a node */
    if ( s [ i - 1 ] == 65 ) {
      ali [ i - 1 ] ++ ;
    }
    if ( s [ i - 1 ] == 66 ) {
      bli [ i - 1 ] ++ ;
    }
  }
  {
    /* decrement a node */
    if ( s [ i - 1 ] == 65 ) {
      ali [ i - 1 ] -- ;
    }
    if ( s [ i - 1 ] == 66 ) {
      bli [ i - 1 ] -- ;
    }
  }
  {
    /* adjAB */
    if ( ali [ i - 1 ] && bli [ i - 1 ] ) {
      /* true */
    }
    else {
      /* false */
    }
    Set < Integer > graphvers = new HashSet < Integer > ( graphAB . keySet ( ) ) ;
    Set < Integer > visitset = new HashSet < Integer > ( ) ;
    for ( int i = 1 ;
    i <= n ;
    i ++ ) {
      if ( ! graphvers . contains ( i ) ) {
        s [ i - 1 ] = 67 ;
      }
      else {
        for ( int j : graphAB . get ( i ) ) {
          /* increment a node */
          if ( ! graphvers . contains ( j ) ) {
            /* false */
            visitset . add ( j ) ;
          }
        }
      }
    }
    while ( Boolean . valueOf ( visitset . contains ( i ) ) ) {
      int i = visitset . iterator ( ) . next ( ) ;
      for ( int j : StreamUtils . stream ( graphvers ) . filter ( i -> s [ i - 1 ] != 67 )