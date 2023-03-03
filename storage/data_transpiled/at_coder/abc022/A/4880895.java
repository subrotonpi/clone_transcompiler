public static int N ( ) {
  int S = Integer . parseInt ( input . nextLine ( ) ) ;
  int T = Integer . parseInt ( input . nextLine ( ) ) ;
  int bestCnt = 0 ;
  if ( S <= W && W <= T ) {
    bestCnt ++ ;
  }
  for ( int i = 0 ;
  i < N - 1 ;
  i ++ ) {
    W += Integer . parseInt ( input . nextLine ( ) ) ;
    if ( S <= W && W <= T ) {
      bestCnt ++ ;
    }
  }
  return bestCnt ;
}
