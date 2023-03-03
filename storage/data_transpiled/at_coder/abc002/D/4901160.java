public static int N ( ) {
  int M = ( int ) input . nextInt ( ) ;
  int [ ] [ ] group = new int [ N ] [ M ] ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    int x = ( int ) input . nextInt ( ) ;
    int y = ( int ) input . nextInt ( ) ;
    group [ x - 1 ] [ y ] = y ;
    group [ y - 1 ] [ x ] = x ;
  }
  int ans = 1 ;
  for ( int i = 0 ;
  i < 2 * N ;
  i ++ ) {
    int [ ] cli = new int [ N ] ;
    for ( int j = 0 ;
    j < N ;
    j ++ ) {
      if ( ( int ) ( i / ( 2 * j ) ) % 2 != 0 ) cli [ j ] = j + 1 ;
    }
    if ( cli . length > ans ) {
      if ( ( Arrays . binarySearch ( group [ cli [ j ] - 1 ] , cli ) < 0 ) ) ans = cli . length ;
    }
  }
  System . out . println ( ans ) ;
  return ans ;
}
