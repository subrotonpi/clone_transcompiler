public static int [ ] getN ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] e = new int [ N + 1 ] ;
  for ( int i = 2 ;
  i <= N ;
  i ++ ) {
    int cur = i ;
    for ( int j = 2 ;
    j <= i ;
    j ++ ) {
      while ( cur % j == 0 ) {
        e [ j ] ++ ;
        cur /= j ;
      }
    }
  }
  return e ;
}
