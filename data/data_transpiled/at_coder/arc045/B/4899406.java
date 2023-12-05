public static int [ ] [ ] getIndices ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int m = Integer . parseInt ( input . nextLine ( ) ) ;
  List < List < Integer >> info = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) info . add ( Collections . singletonList ( input . nextLine ( ) ) ) ;
  int [ ] classOverlap = new int [ n + 1 ] ;
  int [ ] cursum = new int [ n + 1 ] ;
  List < Integer > ans = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    classOverlap [ info . get ( i ) . get ( 0 ) - 1 ] ++ ;
    classOverlap [ info . get ( i ) . get ( 1 ) ] -- ;
  }
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    classOverlap [ i + 1 ] += classOverlap [ i ] ;
  }
  for ( int i = 0 ;
  i < n + 1 ;
  i ++ ) {
    if ( classOverlap [ i ] == 1 ) classOverlap [ i ] = 0 ;
    if ( classOverlap [ i ] > 1 ) classOverlap [ i ] = 1 ;
  }
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    cursum [ i + 1 ] = cursum [ i ] + classOverlap [ i ] ;
  }
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    if ( cursum [ info . get ( i ) . get ( 1 ) ] - cursum [ info . get ( i ) . get ( 0 ) - 1 ] == info . get ( i ) . get ( 1 ) - info . get ( i ) . get ( 0 ) + 1 ) {
      ans . add ( i + 1 ) ;
    }
  }
  System . out . println ( ans . size ( ) ) ;
  for ( int num : ans ) {
    System . out . println ( num ) ;
  }
  return ans . toArray ( new Integer [ ans . size ( ) ] [ ] ) ;
}
