public static int N = Integer . parseInt ( input ) {
  int [ ] e = new int [ N + 1 ] ;
  for ( int i = 0 ;
  i < N + 1 ;
  i ++ ) {
    int cur = i ;
    for ( int j = 2 ;
    j <= i ;
    j ++ ) {
      while ( cur % j == 0 ) {
        e [ j ] ++ ;
        cur = cur / j ;
      }
    }
  }
  return tmp ;
}
