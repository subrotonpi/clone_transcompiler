static int N = Integer . parseInt ( input ) {
  int [ ] [ ] S = new int [ N ] [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    S [ i ] = input . nextInt ( ) ;
  }
  /* Check for a small number of letters */
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    for ( int j = i + 1 ;
    j < N ;
    j ++ ) {
      if ( S [ i ] [ j ] != S [ j ] [ i ] ) {
        return 0 ;
      }
    }
  }
  int cnt = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    cnt += check ( S , i , S [ i ] [ 0 ] , 0 , i ) ;
  }
  System . out . println ( cnt * N ) ;
  return cnt ;
}
