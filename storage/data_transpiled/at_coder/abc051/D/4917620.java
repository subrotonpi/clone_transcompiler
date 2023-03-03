public static int [ ] [ ] [ ] map ( String input ) {
  int N = Integer . parseInt ( input ) ;
  int M = Integer . parseInt ( input ) ;
  /*for (int k = 0; k < N; k++) {
  for (int i = 0; i < n; i++) {
  for (int j = 0; j < n; j++) {
  dist[i][j]=Math.min(dist[i][j],dist[i][k]+dist[k][j]);
  }
  }
  }*/
  double [ ] [ ] dist = new double [ N ] [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    dist [ i ] [ i ] = Double . POSITIVE_INFINITY ;
  }
  int [ ] [ ] xyz = new int [ M ] [ N ] ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    int x = Integer . parseInt ( input ) ;
    int y = Integer . parseInt ( input ) ;
    int z = Integer . parseInt ( input ) ;
    xyz [ i ] [ 0 ] = x - 1 ;
    xyz [ i ] [ 1 ] = y - 1 ;
    dist [ i ] [ 2 ] = z ;
    dist [ i ] [ 3 ] = z ;
    dist [ i ] [ 4 ] = z ;
  }
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    dist [ i ] [ i ] = 0 ;
  }
  wf = warshallFloyd ( dist , N ) ;
  int ans = M ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    int j = 0 ;
    int flag = 0 ;
    for ( j = 0 ;
    j < N ;
    j ++ ) {
      if ( wf [ j ] [ xyz [ i ] [ 0 ] ] + xyz [ i ] [ 2 ] == wf [ j ] [ xyz [ i ] [ 1 ] ] ) {
        flag = 1 ;
        break ;
      }
    }
    if ( flag == 1 ) {
      ans -- ;
    }
    flag = 0 ;
  }
  System . out . println ( ans ) ;
  return dist ;
}
