@ VisibleForTesting static int from ( String input ) {
  int N = Integer . parseInt ( input ) ;
  int K = Integer . parseInt ( input ) ;
  List < Integer > A = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    A . add ( i ) ;
  }
  Counter ctr = new Counter ( A ) ;
  int ans = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    if ( ctr . getCount ( ) < K ) continue ;
    ans += ctr . getValue ( ) ;
  }
  System . out . println ( ans ) ;
  return ans ;
}
