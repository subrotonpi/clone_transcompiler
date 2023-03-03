public static void print ( String input ) {
  int N = Integer . parseInt ( input ) ;
  int K = Integer . parseInt ( input ) ;
  double [ ] [ ] [ ] dp = new double [ K + 2 ] [ N + 1 ] [ K + 1 ] ;
  for ( int j = 0 ;
  j < K + 1 ;
  j ++ ) {
    dp [ N ] [ j ] [ 1 ] = 1.0 ;
  }
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    for ( int j = 0 ;
    j < K + 1 ;
    j ++ ) {
      if ( j > i ) break ;
      for ( int k = 0 ;
      k < 2 ;
      k ++ ) dp [ i ] [ j ] [ k ] = i / ( i + 1 ) ;
    }
  }
}
