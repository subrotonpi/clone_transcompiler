public static double [ ] mult ( double [ ] X , double [ ] Y ) {
  double [ ] C = new double [ xrange ( X . length + Y . length - 1 ) ] ;
  for ( int i = 0 ;
  i < X . length ;
  i ++ ) {
    double x = X [ i ] ;
    for ( int j = 0 ;
    j < Y . length ;
    j ++ ) {
      C [ i + j ] += x * Y [ j ] ;
    }
  }
  /* sol */
  double [ ] [ ] pols = new double [ xrange ( X . length + Y . length - 1 ) ] [ ] ;
  for ( int i = 0 ;
  i < P . length ;
  i ++ ) {
    pols [ i ] = new double [ ] {
      P [ i ] , 1 - P [ i ] }
      ;
    }
    for ( int i = 0 ;
    i < xrange ( 1 , N ) ;
    i ++ ) {
      pols [ 0 ] = mult ( pols [ 0 ] , pols [ i ] ) ;
    }
    return pols [ 0 ] [ N / 2 ] ;
  }
  