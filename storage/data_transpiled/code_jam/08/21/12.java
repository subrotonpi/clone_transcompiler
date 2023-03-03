@ VisibleForTesting static void readMap ( ) {
  for ( int testCase = 0 ;
  testCase < 3 ;
  testCase ++ ) {
    int n = Integer . parseInt ( readLine ( ) ) ;
    int A = Integer . parseInt ( readLine ( ) ) ;
    int B = Integer . parseInt ( readLine ( ) ) ;
    int C = Integer . parseInt ( readLine ( ) ) ;
    int D = Integer . parseInt ( readLine ( ) ) ;
    int x0 = x0 ;
    int y0 = y0 ;
    int M = Integer . parseInt ( readLine ( ) ) ;
    int x = x0 ;
    int y = y0 ;
    HashMap < Point , Integer > map = new HashMap < Point , Integer > ( ) ;
    for ( int i = 0 ;
    i < 3 ;
    i ++ ) {
      for ( int j = 0 ;
      j < 3 ;
      j ++ ) {
        map . put ( new Point ( i , j ) , 0 ) ;
      }
    }
    map . put ( new Point ( x % 3 , y % 3 ) , 1 ) ;
    for ( int i = 1 ;
    i < n ;
    i ++ ) {
      x = ( A * x + B ) % M ;
      y = ( C * y + D ) % M ;
      map . put ( new Point ( x % 3 , y % 3 ) , 1 ) ;
    }
    int cnt = 0 ;
    for ( Point i : map . keySet ( ) ) {
      for ( Point j : map . keySet ( ) ) {
        int k = ( 3 - ( ( i . x + j . x ) % 3 ) ) % 3 ;
        int [ ] v = new int [ 3 ] ;
        v [ 0 ] = i ;
        v [ 1 ] = j ;
        v [ 2 ] = k ;
        if ( v . length != 3 ) continue ;
        int [ ] dv = new int [ 3 ] ;
        for ( int k = 0 ;
        k < 3 ;
        k ++ ) {
          dv [ k ] = map . get ( k ) ;
        }
        if ( dv [ 0 ] == 0 ) continue ;
        int vv = 0 ;
        if ( v [ 0 ] == v [ 1 ] && v [ 1 ] == v [ 2 ] ) vv = dv [ 0 ] * ( dv [ 1 ] - 1 ) * ( dv [ 2 ] - 2 ) / 6 ;
        else if ( v [ 0 ] == v [ 1 ] ) vv = dv [ 0 ] * ( dv [ 1 ] - 1 ) * dv [ 2 ] / 2 ;
        else if ( v [ 2 ] == v [ 1 ] ) vv = dv [