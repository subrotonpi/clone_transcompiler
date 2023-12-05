public static int N = Integer . parseInt ( input ) {
  * P , y ;
  int [ ] M = new int [ N + 1 ] ;
  for ( int i = 0 ;
  i < P . length ;
  i ++ ) {
    M [ i ] = i ;
  }
  int INF = 10 * 9 ;
  {
    int n0 = 2 * ( n - 1 ) . bitLength ( ) ;
    int [ ] data = new int [ n0 * 2 ] ;
    Arrays . fill ( data , INF ) ;
    for ( int i = n0 - 2 ;
    i >= 0 ;
    i -- ) {
      data [ i ] = Math . min ( data [ 2 * i + 1 ] , data [ 2 * i + 2 ] ) ;
    }
    return data [ 0 ] ;
  }
  {
    int n0 = data . length / 2 ;
    l += n0 ;
    r += n0 ;
    while ( l < r ) {
      if ( ( r & 1 ) != 0 ) {
        r -- ;
        data [ r ] = data [ r - 1 ] ;
      }
      if ( ( l & 1 ) != 0 ) {
        data [ l ] = data [ l - 1 ] ;
        l ++ ;
      }
      l >>= 1 ;
      r >>= 1 ;
    }
  }
  {
    int d0 = 0 ;
    int d1 = 0 ;
    for ( int i = 1 ;
    i < N ;
    i ++ ) {
      int xi = data [ i ] ;
      int yi = M [ y ] ;
      if ( xi < 0 ) {
        int xi = M [ x ] ;
        int yi = M [ y ] ;
        if ( xi + 1 < yi ) {
          int xi = M [ xi + 1 ] ;
          int yi = M [ yi ] ;
          if ( yi + 1 < yi ) {
            heappush ( que , ( QueryX ) xi , yi , xi ) ;
          }
        }
      }
    }
    return d0 ;
  }
}
