@ VisibleForTesting static int kruskal ( int vCount , @ Nonnull List < Edge > edges , int wage ) {
  final int [ ] tree = new int [ vCount ] ;
  Arrays . fill ( tree , - 1 ) ;
  {
    int x = 0 ;
    int y = 0 ;
    for ( int i = 0 ;
    i < vCount ;
    i ++ ) {
      if ( tree [ x ] < 0 ) {
        return x ;
      }
      tree [ x ] = getRoot ( tree [ x ] ) ;
    }
    {
      int big = ( x < 0 ) ? - 1 : x ;
      int small = ( y < 0 ) ? - 1 : y ;
      tree [ big ] += tree [ small ] ;
      tree [ small ] = big ;
    }
  }
  {
    int cost = 0 ;
    List < Edge > list = new ArrayList < > ( edges . size ( ) ) ;
    for ( int i = 0 ;
    i < edges . size ( ) ;
    i ++ ) {
      int a = edges . get ( i ) , b = edges . get ( i ) ;
      int c = edges . get ( i ) ;
      int t = edges . get ( i ) ;
      if ( c != t ) {
        int big = ( x < 0 ) ? - 1 : x ;
        int small = ( y < 0 ) ? - 1 : y ;
        list . add ( big ) ;
        list . add ( tree [ small ] ) ;
        list . add ( big ) ;
      }
    }
    return cost ;
  }
  {
    int inf = Float . MAX_VALUE ;
    int border = Integer . MIN_VALUE ;
    int count = 1 ;
    for ( int i = 0 ;
    i < border ;
    i ++ ) {
      int w = edges . get ( i ) ;
      int _s = edges . get ( i ) ;
      int _t = edges . get ( i ) ;
      count += unite ( _s , _t ) ;
      cost += w ;
    }
    if ( count < N ) {
      for ( int i = border ;
      i < N ;
      i ++ ) {
        int w = edges . get ( i ) ;
        int _s = edges . get ( i ) ;
        int _t = edges . get ( i ) ;
        if ( unite ( _s , _t ) ) {
          count ++ ;
          cost += w ;
          if ( count == N ) {
            break ;
          }
        }
      }
    }
    return cost ;
  }
}
