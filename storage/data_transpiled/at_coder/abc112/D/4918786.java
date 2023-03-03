public static int N = Integer . parseInt ( input ) {
  int M = Integer . parseInt ( input . nextLine ( ) ) ;
  /*if N == 1 return M;*/
  if ( M - N < M / N ) {
    for ( int n = N ;
    n <= M ;
    n ++ ) {
      if ( M % n == 0 ) {
        return M ;
      }
    }
  }
  return M ;
}
