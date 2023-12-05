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
  @ SuppressWarnings ( "unchecked" ) LinkedHashMap < String , Integer > graphAB = new LinkedHashMap < String , Integer > ( ) ;
  /* Increment AB */
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( s . charAt ( adj - 1 ) == 'A' ) ali [ i - 1 ] ++ ;
    if ( s . charAt ( adj - 1 ) == 'B' ) bli [ i - 1 ] ++ ;
  }
  /* Decrement AB */
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    edges . add ( new Edge ( Integer . parseInt ( input . readLine ( ) ) ) ) ;
  }
  /* Add AB */
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    edges . add ( new Edge ( Integer . parseInt ( input . readLine ( ) ) ) ) ;
  }
  /* Add AB */
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    edges . add ( new Edge ( Integer . parseInt ( input . readLine ( ) ) ) ) ;
  }
  /* Add AB */
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    edges . add ( new Edge ( Integer . parseInt ( input . readLine ( ) ) ) ) ;
  }
  /* Add AB */
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    edges . add ( new Edge ( Integer . parseInt ( input . readLine ( ) ) ) ) ;
  }
  /* Add AB */
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    edges . add ( new Edge ( Integer . parseInt ( input . readLine ( ) ) ) ) ;
  }
  /* Add AB */
  for ( int i = 0 ;
  i < n ;
  i ++ )