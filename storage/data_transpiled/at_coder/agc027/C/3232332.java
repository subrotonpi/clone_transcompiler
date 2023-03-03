public static void print ( String input ) {
  int n = Integer . parseInt ( input ) ;
  int m = Integer . parseInt ( input ) ;
  LinkedList < Integer > s = new LinkedList < Integer > ( ) ;
  int [ ] ali = new int [ n ] ;
  int [ ] bli = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int u = Integer . parseInt ( input ) ;
    int v = Integer . parseInt ( input ) ;
    graphAB . put ( u , v ) ;
    graphAB . get ( v ) . add ( u ) ;
  }
  /* increment a node */
  if ( s . get ( adj - 1 ) == 'A' ) ali [ n - 1 ] ++ ;
  if ( s . get ( adj - 1 ) == 'B' ) bli [ n - 1 ] ++ ;
  /* decrement a node */
  if ( s . get ( adj - 1 ) == 'A' ) ali [ n - 1 ] -- ;
  if ( s . get ( adj - 1 ) == 'B' ) bli [ n - 1 ] -- ;
  /* adj */
  if ( ali [ n - 1 ] != 0 && bli [ n - 1 ] != 0 ) {
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
      s . add ( i - 1 ) ;
    }
    else {
      for ( int j : graphAB . get ( i ) ) {
        incrementAB ( i , j ) ;
      }
      if ( ! adjAB ( i ) ) {
        visitset . add ( i ) ;
      }
    }
  }
  while ( Boolean . TRUE . equals ( visitset ) ) {
    Integer i = visitset . iterator ( ) . next ( ) ;
    List < Integer > gen = ( List < Integer > ) graphAB . get ( i ) ;
    for ( int j : gen ) {
      decrementAB ( j , i ) ;
      if ( ! adjAB ( j ) ) {
        visitset . add ( j ) ;
      }
    }
    s . add ( i - 1 ) ;
  }
  Set < Integer > sset = new HashSet < Integer > ( s ) ;
  sset . add