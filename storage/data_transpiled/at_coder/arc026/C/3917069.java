static int N = Integer . parseInt ( input ) {
  int N0 = 2 * ( L ) ;
  final int INF = 10 * 15 ;
  int [ ] data = new int [ 2 * N0 ] ;
  {
    update ( ) ;
    int k = 0 ;
  }
  {
    k += N0 - 1 ;
    data [ k ] = 0 ;
    while ( k >= 0 ) {
      k = ( k - 1 ) / 2 ;
      data [ k ] = Math . min ( data [ 2 * k + 1 ] , data [ 2 * k + 2 ] ) ;
    }
  }
  {
    int L = l + N0 ;
    int R = r + N0 ;
    int s = INF ;
    while ( L < R ) {
      if ( ( R & 1 ) != 0 ) {
        R -- ;
        s = Math . min ( s , data [ R - 1 ] ) ;
      }
      if ( ( L & 1 ) != 0 ) {
        s = Math . min ( s , data [ L - 1 ] ) ;
        L ++ ;
      }
      L >>= 1 ;
      R >>= 1 ;
    }
  }
}
List < Integer > P = new ArrayList < > ( ) ;
for ( int i = 0 ;
i < N ;
i ++ ) {
  P . add ( Collections . singletonList ( i ) ) ;
}
Collections . sort ( P , new Comparator < Integer > ( ) {
  int [ ] {
    1 }
    ) ;
    int [ ] V = new int [ L + 1 ] ;
    V [ 0 ] = 0 ;
    update ( 0 , 0 ) ;
    for ( int l = 0 ;
    l < P . size ( ) ;
    l ++ ) {
      int r = P . get ( l ) ;
      int c = P . get ( r ) ;
      int v = query ( l , r ) ;
      if ( v + c <= V [ r ] ) {
        V [ r ] = v + c ;
        update ( r , v + c ) ;
      }
    }
    System . out . println ( V [ L ] ) ;
  }
  