public static void UnionFindTree ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] parent = new int [ N + 1 ] ;
  int [ ] rank = new int [ N + 1 ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int group ;
    if ( parent [ i ] == - 1 ) group = i ;
    else {
      group = find ( parent [ i ] ) ;
      parent [ i ] = group ;
    }
  }
  unite ( Integer . MIN_VALUE , Integer . MAX_VALUE , parent ) ;
  int px , py ;
  int i ;
  for ( i = 0 ;
  i < N ;
  i ++ ) {
    px = parent [ i ] ;
    py = parent [ i ] ;
    if ( px != py ) {
      if ( rank [ px ] == rank [ py ] ) rank [ px ] ++ ;
      else if ( rank [ px ] < rank [ py ] ) px = py ;
      py = px ;
    }
    parent [ i ] = px ;
  }
  long size [ ] = size [ N ] ;
  for ( i = 0 ;
  i < N ;
  i ++ ) {
    size [ N ] = i ;
  }
}
