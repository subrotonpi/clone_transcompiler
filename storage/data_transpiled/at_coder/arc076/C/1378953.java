static final int coord_on_edge ( int x , int y , int R , int C ) {
  if ( y == 0 ) {
    return x ;
  }
  if ( x == R ) {
    return R + y ;
  }
  if ( y == C ) {
    return R + C + R - x ;
  }
  if ( x == 0 ) {
    return 2 * ( R + C ) - y ;
  }
  /* on edge */
  int x1 = 0 ;
  int y1 = 0 ;
  int x2 = 0 ;
  int y2 = 0 ;
  int R = 0 ;
  int C = 0 ;
  int i = 0 ;
  List < Integer > edgePoints = new ArrayList < Integer > ( ) ;
  for ( int j = 0 ;
  j < N ;
  j ++ ) {
    int x1 = Integer . parseInt ( input . readLine ( ) ) ;
    int y1 = Integer . parseInt ( input . readLine ( ) ) ;
    int x2 = Integer . parseInt ( input . readLine ( ) ) ;
    int y2 = Integer . parseInt ( input . readLine ( ) ) ;
    onEdge ( x1 , y1 , x2 , y2 , R , C , i , edgePoints ) ;
  }
  Queue < Integer > q = new LinkedList < Integer > ( ) ;
  while ( edgePoints . size ( ) > 0 ) {
    int c = edgePoints . get ( 0 ) ;
    int i = q . size ( ) ;
    if ( q . size ( ) > 0 && q . get ( q . size ( ) - 1 ) == i ) {
      q . remove ( q . size ( ) - 1 ) ;
    }
    else {
      q . add ( i ) ;
    }
  }
  if ( q . size ( ) > 0 ) {
    return "NO" ;
  }
  return "YES" ;
}
