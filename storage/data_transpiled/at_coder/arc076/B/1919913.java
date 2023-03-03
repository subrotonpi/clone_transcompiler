public static int inpl ( ) {
  return Integer . parseInt ( input . nextLine ( ) ) ;
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  X [ ] = new int [ n ] ;
  Y [ ] = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    X [ i ] = inpl ( ) ;
    Y [ i ] = inpl ( ) ;
  }
  Arrays . sort ( X ) ;
  Arrays . sort ( Y ) ;
  G [ ] = new int [ n ] ;
  List < Edge > edges = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    edges . add ( new Edge ( X [ i ] . y , X [ i + 1 ] . y , Math . abs ( X [ i ] . x - X [ i + 1 ] . x ) ) ) ;
    edges . add ( new Edge ( Y [ i ] . y , Y [ i + 1 ] . y , Math . abs ( Y [ i ] . x - Y [ i + 1 ] . x ) ) ) ;
  }
  edges = new ArrayList < > ( edges ) ;
  int [ ] [ ] tree = new int [ n ] [ 2 ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int group ;
    int px = i ;
    int py = i ;
    if ( tree [ i ] [ 0 ] == - 1 ) {
      group = i ;
    }
    else {
      group = find ( tree [ i ] [ 0 ] ) ;
    }
  }
  /* unite the first edge */
  int px = i ;
  int py = i ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int group = i ;
    int group = i ;
    /* unite the second edge */
    px = i ;
    py = i ;
    if ( tree [ px ] [ 1 ] == tree [ py ] [ 1 ] ) {
      tree [ py ] [ 0 ] = px ;
      tree [ px ] [ 1 ] ++ ;
    }
    else {
      if ( tree [ px ] [ 1 ] < tree [ py ] [ 1 ] ) {
        px = py ;
        py = i ;
      }
      tree [ py ] [ 0 ] = px ;
    }
  }
  int res = 0 ;
  for ( Edge s : edges ) {
    int t = s . next ( ) ;
    int w = s . next ( ) ;
    if ( t != - 1