private static void print ( int N , int M ) {
  boolean [ ] DP = new boolean [ N ] ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    int a = ( i + 1 ) / M ;
    int b = ( i + 1 ) / M ;
    for ( int j = a ;
    j <= b ;
    j ++ ) {
      DP [ j - 1 ] = ! DP [ j - 1 ] ;
    }
  }
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    if ( DP [ i ] ) {
      System . out . println ( "NO" ) ;
      break ;
    }
  }
  else {
    System . out . println ( "YES" ) ;
  }
}
