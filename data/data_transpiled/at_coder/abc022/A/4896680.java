public static int N ( ) {
  int S = Integer . parseInt ( input . nextLine ( ) ) ;
  int T = Integer . parseInt ( input . nextLine ( ) ) ;
  int W = Integer . parseInt ( input . nextLine ( ) ) ;
  int count = S <= W && W <= T ;
  for ( int n = 0 ;
  n < N - 1 ;
  n ++ ) {
    W += Integer . parseInt ( input . nextLine ( ) ) ;
    if ( S <= W && W <= T ) {
      count ++ ;
    }
  }
  return count ;
}
