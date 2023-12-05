@ VisibleForTesting static Iterable < Integer > combinations ( int [ ] [ ] bList , int [ ] cList ) {
  int [ ] [ ] bList = new int [ 2 ] [ ] ;
  int [ ] [ ] cList = new int [ 3 ] [ ] ;
  for ( int elem : input ( ) . split ( " " ) ) {
    for ( int i = 0 ;
    i < bList [ 0 ] . length ;
    i ++ ) {
      bList [ 0 ] [ i ] = Integer . parseInt ( input ( ) . split ( " " ) [ 0 ] ) ;
    }
  }
  assert cList [ 0 ] . length == 2 ;
  {
    List < Integer > adj = new ArrayList < > ( ) ;
    for ( int i = 0 ;
    i < 9 ;
    i ++ ) {
      if ( grid [ i ] == - 1 ) {
        List < Integer > nextGrid = new LinkedList < > ( ) ;
        nextGrid . add ( grid [ i ] ) ;
        nextGrid . add ( turn ) ;
        Collections . addAll ( adj , nextGrid ) ;
      }
    }
  }
  {
    List < Integer > nextGrid = new LinkedList < > ( ) ;
    for ( int i = 0 ;
    i < 9 ;
    i ++ ) {
      for ( int j = 0 ;
      j < 3 ;
      j ++ ) {
        if ( nextGrid . get ( i * 3 + j ) != - 1 && nextGrid . get ( i * 3 + j ) == finalGrid . get ( ( i + 1 ) * 3 + j ) ) {
          nextGrid . add ( bList [ i ] [ j ] ) ;
        }
      }
    }
    for ( int i = 0 ;
    i < 3 ;
    i ++ ) {
      for ( int j = 0 ;
      j < 2 ;
      j ++ ) {
        if ( nextGrid . get ( i * 3 + j ) != - 1 && nextGrid . get ( i * 3 + j ) == finalGrid . get ( i * 3 + j + 1 ) ) {
          nextGrid . add ( cList [ i ] [ j ] ) ;
        }
      }
    }
    Map < Integer , Integer > memo = new HashMap < > ( ) ;
    int [ ] [ ] indices = new int [ 9 ] [ ] ;
    for ( int i = 0 ;
    i < 9 ;
    i ++ ) {
      int [ ] nextGrid = new int [ 9 ] ;
      for ( int j = 0 ;
      j < 9 ;
      j ++ ) {
        nextGrid [ j ] = 1 ;
      }
      nextGrid = new int [ 9