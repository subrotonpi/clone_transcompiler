@ VisibleForTesting static int [ ] readIntList ( ) {
  /* read the input list */
  int [ ] state = new int [ 3 ] ;
  /* read the number of integers */
  int [ ] a = new int [ 3 ] ;
  int [ ] b = new int [ 3 ] ;
  int [ ] c = new int [ 3 ] ;
  int [ ] d = new int [ 3 ] ;
  int totalIn = 0 ;
  int totalOut = 0 ;
  /* solve */
  int n = input . nextInt ( ) ;
  int h = input . nextInt ( ) ;
  int [ ] a = new int [ n ] ;
  int [ ] c = new int [ n ] ;
  int [ ] d = new int [ n ] ;
  int nNodes = 2 * h + 1 ;
  int nEdges = n ;
  int [ ] [ ] adj = new int [ nNodes ] ;
  int [ ] [ ] rAdj = new int [ nNodes ] [ ] ;
  for ( int i = 0 ;
  i < nEdges ;
  i ++ ) {
    int l , r ;
    if ( c [ i ] == 0 ) l = a [ i ] ;
    else l = - c [ i ] ;
    if ( d [ i ] == 0 ) r = - b [ i ] ;
    else r = d [ i ] ;
    adj [ l + h ] [ i ] = r + h ;
    rAdj [ r + h ] [ i ] = l + h ;
  }
  int [ ] inDegree = new int [ nNodes ] ;
  int [ ] outDegree = new int [ nNodes ] ;
  for ( int i = 0 ;
  i < nNodes ;
  i ++ ) {
    for ( int j = 0 ;
    j < adj [ i ] . length ;
    j ++ ) {
      outDegree [ i ] ++ ;
      inDegree [ j ] ++ ;
    }
  }
  for ( int i = 0 ;
  i < nNodes ;
  i ++ ) {
    if ( i < h ) {
      if ( ! outDegree [ i ] <= inDegree [ i ] ) {
        return "NO" ;
      }
    }
    if ( h < i ) {
      if ( ! inDegree [ i ] <= outDegree [ i ] ) {
        return "NO" ;
      }
    }
  }
  state = new int [ nNodes ] ;
  /* dfs */
  state [ 0 ] = 1 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( state [ i ] == 0 ) {
      