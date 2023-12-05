public static int N = Integer . parseInt ( input ) {
  int [ ] [ ] S = new int [ N ] [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    S [ i ] [ i ] = input . nextInt ( ) ;
  }
  /* Check the sum of the values */
  int cnt = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    cnt += S [ i ] [ i ] + S [ 0 ] [ i ] ;
  }
  System . out . println ( cnt * N ) ;
  return cnt ;
}
