static final int [ ] [ ] solve ( int N , int M ) {
  int [ ] [ ] result = new int [ N ] [ M ] ;
  for ( int t = 0 ;
  t < N ;
  t ++ ) {
    result [ t ] = input . nextInt ( ) ;
  }
  if ( 4 * N < M && M < 2 * N ) {
    System . out . println ( - 1 , - 1 , - 1 ) ;
    System . exit ( 0 ) ;
  }
  for ( int t = 0 ;
  t < N + 1 ;
  t ++ ) {
    int x = 3 * N - M + t ;
    int y = M - 2 * N - 2 * t ;
    int z = t ;
    if ( x >= 0 && y >= 0 ) {
      break ;
    }
  }
  if ( x >= 0 && y >= 0 ) {
    System . out . println ( x + " " + y + " " + z ) ;
  }
  else {
    System . out . println ( - 1 , - 1 , - 1 ) ;
  }
  return result ;
}
