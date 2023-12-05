public static int N ( ) {
  int S = Integer . parseInt ( input . nextLine ( ) ) ;
  int T = Integer . parseInt ( input . nextLine ( ) ) ;
  int W = Integer . parseInt ( input . nextLine ( ) ) ;
  int ans = 0 ;
  if ( S <= W && W <= T ) {
    ans ++ ;
  }
  for ( int i = 0 ;
  i < N - 1 ;
  i ++ ) {
    int B = Integer . parseInt ( input . nextLine ( ) ) ;
    W += B ;
    if ( W >= S && W <= T ) {
      ans ++ ;
    }
  }
  return ans ;
}
