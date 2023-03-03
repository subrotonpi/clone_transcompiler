@ VisibleForTesting static void print ( ) {
  System . setOut ( new PrintStream ( System . out ) ) ;
  int N = Integer . parseInt ( input . readLine ( ) ) ;
  int K = Integer . parseInt ( input . readLine ( ) ) ;
  int L = Integer . parseInt ( input . readLine ( ) ) ;
  List < List < Integer >> pq = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < K ;
  i ++ ) pq . add ( Collections . singletonList ( Integer . parseInt ( input . readLine ( ) ) ) ) ;
  List < List < Integer >> rs = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < L ;
  i ++ ) rs . add ( Collections . singletonList ( Integer . parseInt ( input . readLine ( ) ) ) ) ;
  List < List < Integer >> G_r = new ArrayList < > ( N + 1 ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) G_r . add ( new ArrayList < > ( ) ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    for ( List < Integer > elem : pq ) {
      G_r . get ( elem . get ( 0 ) ) . add ( elem . get ( 1 ) ) ;
      G_r . get ( elem . get ( 1 ) ) . add ( elem . get ( 0 ) ) ;
    }
  }
  List < List < Integer >> G_t = new ArrayList < > ( N + 1 ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    G_t . get ( elem . get ( 0 ) ) . add ( elem . get ( 1 ) ) ;
    G_t . get ( elem . get ( 1 ) ) . add ( elem . get ( 0 ) ) ;
  }
  Integer [ ] field_r = new Integer [ N + 1 ] ;
  {
    Deque < Integer > q = new LinkedList < > ( ) ;
    q . add ( i ) ;
    field_r [ i ] = idx ;
    while ( q . size ( ) > 0 ) {
      Integer tmp = q . pop ( ) ;
      for ( int pos : G_r . get ( tmp ) ) {
        if ( field_r [ pos ] == null ) {
          field_r [ pos ] = idx ;
          q . add ( pos ) ;
        }
        else {
          continue ;
        }
      }
    }
  }
  int idx = 0 ;
  for ( int i = 1 ;
  i <= N ;
  i ++ ) {
    if ( field_r [ i ] == null