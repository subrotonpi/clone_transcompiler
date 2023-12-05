static final int [ ] getUnits ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  List < Integer > Units = new ArrayList < > ( ) ;
  int count = 0 ;
  List < List < Integer >> relations = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int l , m , s ;
    l = input . nextLine ( ) ;
    m = Integer . parseInt ( m ) ;
    if ( ! Units . contains ( l ) ) {
      Units . add ( l ) ;
      count ++ ;
      relations = new ArrayList < > ( ) ;
      for ( List < Integer > a : relations ) {
        a . add ( a . size ( ) + 1 ) ;
      }
      relations . add ( new ArrayList < > ( ) ) ;
    }
    if ( ! Units . contains ( s ) ) {
      Units . add ( s ) ;
      count ++ ;
      relations = new ArrayList < > ( ) ;
      for ( List < Integer > a : relations ) {
        a . add ( a . size ( ) + 1 ) ;
      }
      relations . add ( new ArrayList < > ( ) ) ;
    }
    relations . get ( Units . indexOf ( l ) ) . set ( Units . indexOf ( s ) , m ) ;
    relations . get ( Units . indexOf ( s ) ) . set ( Units . indexOf ( l ) , 1 / m ) ;
  }
  Queue < Integer > dq = new ArrayDeque < > ( ) ;
  dq . add ( new Integer ( 1 ) ) ;
  int u = Units . size ( ) ;
  boolean [ ] searchFlags = new boolean [ u ] ;
  for ( int i = 0 ;
  i < u ;
  i ++ ) {
    searchFlags [ i ] = false ;
  }
  int [ ] values = new int [ u ] ;
  values [ 0 ] = 1 ;
  values [ 0 ] = 1 ;
  while ( ( dq . size ( ) > 0 ) ) {
    final int m = dq . poll ( ) ;
    if ( searchFlags [ unit ] ) continue ;
    searchFlags [ unit ] = true ;
    final List < Integer > l = relations . get ( unit ) ;
    for ( int i = 0 ;
    i < u ;
    i ++ ) {
      if ( l . get ( i ) > 0 ) {
        if ( ! searchFlags [ i ] ) {
          values [ i ] = m * l . get ( i ) ;
          dq . add ( new Integer ( m * l . get ( i ) ) ) ;
        }
      }
      