static final int [ ] [ ] minDis ( ) {
  int [ ] [ ] minDis = new int [ 10 ] [ 10 ] ;
  minDis [ 0 ] [ 10 ] = 10 * 18 ;
  int [ ] [ ] edge = new int [ 10 ] [ 10 ] ;
  for ( int i = 0 ;
  i < 10 ;
  i ++ ) minDis [ i ] [ i ] = 0 ;
  int h = Integer . parseInt ( input . nextLine ( ) ) ;
  int w = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] [ ] mat = new int [ h ] [ w ] ;
  for ( int i = 0 ;
  i < 10 ;
  i ++ ) edge [ i ] = new int [ 10 ] ;
  for ( int i = 0 ;
  i < h ;
  i ++ ) mat [ i ] = new int [ 10 ] ;
  for ( int i = 0 ;
  i < w ;
  i ++ ) mat [ i ] [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  for ( int start = 0 ;
  start < 10 ;
  start ++ ) {
    int [ ] dis = new int [ 10 ] ;
    Set < Integer > points = new HashSet < Integer > ( ) ;
    for ( int i = 0 ;
    i < 10 ;
    i ++ ) points . add ( i ) ;
    dis [ start ] = 0 ;
    while ( points . size ( ) > 0 ) {
      int md = 10 * 18 + 1 ;
      int idx = start ;
      for ( int j = 0 ;
      j < points . size ( ) ;
      j ++ ) {
        int point = points . get ( j ) ;
        if ( dis [ point ] < md ) {
          md = dis [ point ] ;
          idx = point ;
        }
      }
      points . remove ( idx ) ;
      for ( int neighbour = 0 ;
      neighbour < 10 ;
      neighbour ++ ) {
        if ( neighbour == idx ) continue ;
        dis [ neighbour ] = Math . min ( dis [ neighbour ] , dis [ idx ] + edge [ idx ] [ neighbour ] ) ;
      }
    }
    minDis [ start ] = dis ;
  }
  int res = 0 ;
  for ( int i = 0 ;
  i < h ;
  i ++ ) {
    for ( int j = 0 ;
    j < w ;
    j ++ ) {
      if ( mat [ i ] [ j ] == - 1 ) continue ;
      res += minDis [ mat [ i ] [ j ] ] [ 1 ] ;
    }
  }
  System . out . println ( res ) ;
  return mat