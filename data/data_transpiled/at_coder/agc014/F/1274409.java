static void checkP2 ( int N , int [ ] P , int [ ] f ) {
  int i , j ;
  int f = N ;
  for ( j = 0 ;
  j < N ;
  j ++ ) {
    P [ i ] = i ;
  }
  int [ ] P2 = new int [ N + 1 ] ;
  int i = N - 1 ;
  int T = 0 ;
  for ( j = 0 ;
  j < N ;
  j ++ ) {
    P2 [ i ] = j + 1 ;
  }
  while ( i >= 0 ) {
    if ( P2 [ i ] > P2 [ i + 1 ] ) {
      T = 1 ;
      f = i + 1 ;
      i = i - 1 ;
      break ;
    }
    i = i - 1 ;
  }
  while ( i > 0 ) {
    if ( ( f + 1 ) * ( P2 [ i ] - P2 [ i ] ) * ( P2 [ i ] - P2 [ f ] ) * ( P2 [ f ] - P2 [ i + 1 ] ) > 0 ) {
      T = T + 1 ;
      f = i + 1 ;
    }
    i = i - 1 ;
  }
  System . out . println ( T ) ;
}
