public static void print ( int n , int m ) {
  LinkedList < String > s = new LinkedList < String > ( ) ;
  List < Edge > edges = new ArrayList < Edge > ( ) ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    edges . add ( new Edge ( Integer . parseInt ( input . readLine ( ) ) ) ) ;
  }
  int [ ] ali = new int [ n ] ;
  int [ ] bli = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    edges . add ( new Edge ( Integer . parseInt ( input . readLine ( ) ) ) ) ;
  }
  @ SuppressWarnings ( "unchecked" ) LinkedHashMap < String , Set < String >> graphAB = new LinkedHashMap < String , Set < String >> ( ) ;
  /* increment a node */
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( s . get ( i - 1 ) . equals ( "A" ) ) ali [ i - 1 ] ++ ;
    if ( s . get ( i - 1 ) . equals ( "B" ) ) bli [ i - 1 ] ++ ;
  }
  /* decrement a node */
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    edges . add ( new Edge ( Integer . parseInt ( input . readLine ( ) ) ) ) ;
  }
  /* adj */
  if ( ali [ i - 1 ] != 0 && bli [ i - 1 ] != 0 ) {
    /* true */
  }
  else {
    /* false */
  }
  Set < String > graphvers = new HashSet < String > ( graphAB . keySet ( ) ) ;
  Set < String > visitset = new HashSet < String > ( ) ;
  for ( int i = 1 ;
  i <= n ;
  i ++ ) {
    if ( ! graphvers . contains ( i ) ) {
      s . add ( i - 1 , "C" ) ;
    }
    else {
      for ( String j : graphAB . get ( i ) ) {
        incrementAB ( i , j ) ;
        if ( ! adjAB . get ( j ) . isEmpty ( ) ) {
          visitset . add ( j ) ;
        }
      }
    }
  }
  while ( Boolean . TRUE . equals ( visitset ) ) {
    String i = visitset . iterator ( ) . next ( ) ;
    for ( String j : graphAB . get ( i ) ) {
      if ( s . get ( j - 1