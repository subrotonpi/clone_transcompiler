public static int [ ] [ ] solve ( int N , int M , int [ ] [ ] board ) {
  int [ ] [ ] before = new int [ M ] [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    for ( int j = 0 ;
    j < M ;
    j ++ ) {
      int v = board [ i ] [ j ] ;
      if ( v > 0 ) {
        before [ i + 1 ] [ j ] = v ;
        board [ i ] [ j ] -= v ;
        board [ i + 2 ] [ j ] -= v ;
        board [ i + 1 ] [ j - 1 ] -= v ;
        board [ i + 1 ] [ j + 1 ] -= v ;
      }
    }
  }
  return before ;
}
