@ VisibleForTesting static void fordFulkerson ( Map < Integer , Map < Integer , Integer >> graph , int start , int end ) {
  final int INF = 10 * 9 ;
  final Map < Integer , Integer > [ ] network = new Map [ h + w + 1 ] ;
  for ( int i = 0 ;
  i < h ;
  i ++ ) {
    network [ i ] = new HashMap < Integer , Integer > ( ) ;
  }
  final Set < Integer > visited = new HashSet < Integer > ( ) ;
  for ( Map . Entry < Integer , Integer > paths : graph . entrySet ( ) ) {
    for ( int i = 0 ;
    i < w ;
    i ++ ) {
      if ( paths . getKey ( ) . equals ( "o" ) ) {
        graph [ i ] . put ( h + j , 1 ) ;
        graph [ h + i ] . put ( i , 1 ) ;
      }
    }
  }
  System . out . println ( fordFulkerson ( graph , si , ti ) ) ;
  for ( Map . Entry < Integer , Integer > entry : network ) {
    Integer next_ = entry . getKey ( ) ;
    int capacity = entry . getValue ( ) ;
    Integer remainingPath = entry . getValue ( ) ;
    if ( remainingPath != null ) {
      return ;
    }
    int minMargin = INF ;
    if ( path . isEmpty ( ) ) {
      return minMargin ;
    }
    final int capacity = path . size ( ) ;
    final int remainingPath = path . size ( ) ;
    network [ end ] . put ( next_ , capacity ) ;
    network [ end ] . put ( next , Math . min ( minMargin , capacity ) ) ;
  }
  final int [ ] [ ] path = new int [ h ] [ w ] ;
  for ( int i = 0 ;
  i < h ;
  i ++ ) {
    path [ i ] = path [ i ] ;
  }
  final int [ ] [ ] path = new int [ h ] [ w ] ;
  for ( int i = 0 ;
  i < w ;
  i ++ ) {
    path [ i ] = path [ i ] ;
  }
  final int [ ] [ ] path = new int [ h ] [ w ] ;
  for ( int i = 0 ;
  i < h ;
  i ++ ) {
    path [ i ] [ 0 ] = path [ i ] ;
  }
  for ( int i = 0 ;
  i < h ;
  i ++ ) {
    path [ i ] [ 1 ] = path [ i ] ;
  }
  System . out . println ( fordFulkerson ( path , path