@ VisibleForTesting static LinkedHashMap < Integer , Integer > map ( String input ) {
  int n = Integer . parseInt ( input ) ;
  int [ ] l = new int [ n ] ;
  HashMap < Integer , HashSet < Integer >> map = new HashMap < > ( ) ;
  for ( int i = 0 ;
  i < n - 1 ;
  i ++ ) {
    int a = Integer . parseInt ( input ) ;
    int b = Integer . parseInt ( input ) ;
    int c = Integer . parseInt ( input ) ;
    a -- ;
    b -- ;
    if ( map . containsKey ( a ) ) {
      map . get ( a ) . add ( new Integer ( b ) ) ;
    }
    else {
      map . put ( a , new HashSet < > ( ) ) ;
    }
    if ( map . containsKey ( b ) ) {
      map . get ( b ) . add ( new Integer ( a ) ) ;
    }
    else {
      map . put ( b , new HashSet < > ( ) ) ;
    }
  }
  int q = Integer . parseInt ( input ) ;
  int k = Integer . parseInt ( input ) ;
  k -- ;
  Deque < Integer > p = new ArrayDeque < > ( ) ;
  p . add ( k ) ;
  while ( p . size ( ) > 0 ) {
    int w = p . poll ( ) ;
    for ( Integer i : map . get ( w ) ) {
      if ( ( l [ i . intValue ( ) ] == 0 && i . intValue ( ) != k ) || ( l [ i . intValue ( ) ] != 0 && l [ i . intValue ( ) ] > l [ w ] + i . intValue ( ) ) ) {
        l [ i . intValue ( ) ] = l [ w ] + i . intValue ( ) ;
        p . add ( i . intValue ( ) ) ;
      }
    }
  }
  for ( int i = 0 ;
  i < q ;
  i ++ ) {
    int x = Integer . parseInt ( input ) ;
    int y = Integer . parseInt ( input ) ;
    System . out . println ( l [ x - 1 ] + l [ y - 1 ] ) ;
  }
  return map ;
}
