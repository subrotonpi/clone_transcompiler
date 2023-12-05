static int N ( ) {
  int C = Integer . parseInt ( input . nextLine ( ) ) ;
  int K = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] T = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) T [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  Arrays . sort ( T ) ;
  int s = 0 ;
  int e = T [ 0 ] + K ;
  int p = 0 ;
  int ans = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    if ( p == C || e < T [ i ] ) {
      ans ++ ;
      s = T [ i ] ;
      e = T [ i ] + K ;
      p = 0 ;
    }
    s = Math . max ( s , T [ i ] ) ;
    e = Math . min ( e , T [ i ] + K ) ;
    p ++ ;
  }
  System . out . println ( ans + 1 ) ;
  return ans ;
}
