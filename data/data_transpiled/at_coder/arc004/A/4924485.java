public static int N = Integer . parseInt ( input ) {
  int [ ] [ ] M = new int [ N ] [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    M [ i ] = new int [ N ] ;
  }
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    M [ i ] = new int [ N ] ;
  }
  int D = 0 ;
  for ( int i = 0 ;
  i < N - 1 ;
  i ++ ) {
    for ( int j = i + 1 ;
    j < N ;
    j ++ ) {
      int [ ] a = M [ i ] ;
      int [ ] b = M [ j ] ;
      int d = ( ( a [ 0 ] - b [ 0 ] ) * ( a [ 1 ] - b [ 1 ] ) * ( a [ 2 ] - b [ 2 ] ) ) * ( 1 / 2 ) ;
      if ( d > D ) {
        D = d ;
      }
      else {
        continue ;
      }
    }
  }
  System . out . println ( D ) ;
  return D ;
}
