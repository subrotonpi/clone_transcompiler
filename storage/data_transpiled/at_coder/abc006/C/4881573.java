public static int N = Integer . parseInt ( input ) {
  int M = Integer . parseInt ( input . nextLine ( ) ) ;
  int K = 4 * N - M ;
  if ( M < 2 * N || 4 * N < M ) {
    System . out . println ( - 1 , - 1 , - 1 ) ;
  }
  else {
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      if ( ( K - i ) % 2 == 0 ) {
        int l = i ;
        int k = ( int ) ( ( K - l ) / 2 ) ;
        int m = ( int ) ( N - k - l ) ;
        System . out . println ( k + " " + l + " " + m ) ;
        break ;
      }
      else {
      }
    }
  }
  return M ;
}
