public static int K = Integer . parseInt ( input ) {
  int N = 50 ;
  int [ ] A = new int [ N ] ;
  int [ ] Ans = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    A [ i ] += ( res + 1 ) ;
    for ( int j = 0 ;
    j < res ;
    j ++ ) {
      A [ j ] -- ;
    }
  }
  return A [ N ] ;
}
