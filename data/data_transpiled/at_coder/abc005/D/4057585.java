public static int size ( int x , int y ) {
  int N = Integer . parseInt ( input ( ) ) ;
  int [ ] [ ] D = new int [ N ] [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) D [ i ] [ i ] = Integer . parseInt ( input ( ) ) ;
  int Q = Integer . parseInt ( input ( ) ) ;
  int [ ] P = new int [ Q ] ;
  for ( int i = 0 ;
  i < Q ;
  i ++ ) P [ i ] = Integer . parseInt ( input ( ) ) ;
  int [ ] [ ] memRec = new int [ N ] [ N ] ;
  for ( int i = 0 ;
  i < P . length ;
  i ++ ) {
    System . out . println ( size ( p ) ) ;
  }
  int [ ] [ ] memMax = new int [ N ] [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    memMax [ 0 ] [ i ] = 0 ;
    for ( int j = 1 ;
    j < N ;
    j ++ ) memMax [ 0 ] [ j ] = - 1 ;
    for ( int j = 0 ;
    j < N ;
    j ++ ) memMax [ j ] [ i ] = 0 ;
    for ( int x = 1 ;
    x < N ;
    x ++ ) for ( int y = 1 ;
    y <= i ;
    y ++ ) {
      memRec [ y ] [ x ] = D [ y ] [ x ] + memRec [ y ] [ x - 1 ] + memRec [ y - 1 ] [ x ] - memRec [ y - 1 ] [ x - 1 ] ;
      if ( x != y ) memRec [ x ] [ y ] = D [ x ] [ y ] + memRec [ x ] [ y - 1 ] + memRec [ x - 1 ] [ y ] - memRec [ x - 1 ] [ y - 1 ] ;
    }
  }
  /* size */
  int res = 0 ;
  for ( int i = x - 1 ;
  i < N ;
  i ++ ) {
    for ( int j = y - 1 ;
    j < N ;
    j ++ ) {
      int tmp = memRec [ j ] [ i ] ;
      if ( i - x >= 0 ) tmp -= memRec [ j ] [ i - x ] ;
      if ( j - x >= 0 && j - y >= 0 ) tmp += memRec [ j - x ] [ i ] ;
    }
  }
  