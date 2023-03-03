public static int N = Integer . parseInt ( input ) {
  int K = Integer . parseInt ( input . nextLine ( ) ) ;
  int best = 10 * 9 ;
  for ( int i = 0 ;
  i < 2 * N ;
  i ++ ) {
    int v = 1 ;
    for ( int j = 0 ;
    j < N ;
    j ++ ) {
      if ( ( i >> j ) & 1 ) {
        v *= 2 ;
      }
      else {
        v += K ;
      }
    }
    best = Math . min ( best , v ) ;
  }
  return best ;
}
