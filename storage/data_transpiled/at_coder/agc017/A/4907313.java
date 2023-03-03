private static void print ( int N , int P ) {
  int [ ] A = new int [ N ] ;
  for ( int a : input . split ( " " ) ) {
    A [ a ] = ( Integer . parseInt ( a ) % 2 ) ;
  }
  DP [ ] [ ] = new int [ N ] [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    DP [ 0 ] [ A [ i ] ] ++ ;
    DP [ 0 ] [ A [ i ] ] ++ ;
  }
  for ( int i = 1 ;
  i < N ;
  i ++ ) {
    if ( A [ i ] == 0 ) {
      DP [ i ] [ 0 ] = DP [ i - 1 ] [ 0 ] * 2 ;
      DP [ i ] [ 1 ] = DP [ i - 1 ] [ 1 ] * 2 ;
    }
    else {
      DP [ i ] [ 0 ] = DP [ i - 1 ] [ 1 ] + DP [ i - 1 ] [ 0 ] ;
      DP [ i ] [ 1 ] = DP [ i - 1 ] [ 1 ] ;
    }
  }
  System . out . println ( DP [ N - 1 ] [ P ] ) ;
}
