static final int [ ] [ ] getCopy ( ) {
  final int N = Integer . parseInt ( input . nextLine ( ) ) ;
  final int M = Integer . parseInt ( input . nextLine ( ) ) ;
  final int [ ] [ ] edge = new int [ M ] [ ] ;
  final List < int [ ] > passEdge = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    int a = Integer . parseInt ( input . nextLine ( ) ) ;
    int b = Integer . parseInt ( input . nextLine ( ) ) ;
    if ( a < b ) {
      a = b ;
      b = a ;
    }
    if ( a == b ) {
      passEdge . add ( Arrays . copyOfRange ( edge , a , b ) ) ;
    }
    else {
      edge [ i ] [ a ] = Arrays . copyOfRange ( edge , a , b ) ;
    }
  }
  final List < int [ ] > sortedEdge = new ArrayList < > ( edge ) ;
  final Map < Integer , List < Integer >> bridge = new HashMap < > ( ) ;
  for ( int i = 1 ;
  i <= N ;
  i ++ ) {
    bridge . put ( i , new ArrayList < > ( ) ) ;
  }
  int [ ] latestBridge = {
    0 , 0 }
    ;
    for ( int [ ] edgeI : sortedEdge ) {
      if ( latestBridge == edgeI ) {
        passEdge . add ( edge ) ;
        pass ( ) ;
      }
      else {
        latestBridge = edgeI ;
        for ( int port = 0 ;
        port < 2 ;
        port ++ ) {
          bridge . put ( edgeI [ port ] , bridge . get ( edgeI [ port ] ) + Arrays . copyOfRange ( edgeI [ port - 1 ] , edgeI [ port ] ) ) ;
        }
      }
    }
    /* check */
    final int a = edge [ 0 ] [ 0 ] ;
    final int b = edge [ 1 ] [ 0 ] ;
    used . add ( a ) ;
    final Map < Integer , Integer > copyBridge = new HashMap < > ( bridge ) ;
    copyBridge . put ( a , Collections . < Integer > emptySet ( ) ) ;
    final List < Integer > move = copyBridge . get ( a ) ;
    int isolate = 1 ;
    while ( move . size ( ) > 0 ) {
      final int pos = move . remove ( ) ;
      if ( used . contains ( pos ) ) {
        pass ( ) ;
      }
      else if ( pos == b ) {
        isolate = 0 ;
      }
      else {
        