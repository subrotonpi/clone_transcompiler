static final void solve ( ) {
  System . setSecurityManager ( new SecurityManager ( ) ) ;
  String input = System . getProperty ( "line.separator" ) ;
  int N = Integer . parseInt ( input ) ;
  int K = Integer . parseInt ( input ) ;
  /* solve */
  int prev = 0 ;
  int l = 0 ;
  int r = 0 ;
  int ans = 0 ;
  int [ ] A = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    A [ i ] = Integer . parseInt ( input ) ;
  }
  while ( r < N ) {
    if ( A [ r ] > prev ) {
      prev = A [ r ] ;
      r ++ ;
    }
    else {
      prev = 0 ;
      if ( r - l >= K ) ans += ( r - l ) - K + 1 ;
    }
  }
  System . out . println ( ans ) ;
}
