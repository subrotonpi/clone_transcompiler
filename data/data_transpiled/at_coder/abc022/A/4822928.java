public static int N ( ) {
  int S = Integer . parseInt ( input . nextLine ( ) ) ;
  int T = Integer . parseInt ( input . nextLine ( ) ) ;
  int W = Integer . parseInt ( input . nextLine ( ) ) ;
  int count = 0 ;
  if ( S <= W && W <= T ) {
    count ++ ;
  }
  for ( ;
  ;
  ) {
    int A = Integer . parseInt ( input . nextLine ( ) ) ;
    W += A ;
    if ( S <= W && W <= T ) {
      count ++ ;
    }
  }
  return count ;
}
