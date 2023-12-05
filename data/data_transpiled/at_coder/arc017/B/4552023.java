static final void main ( String [ ] args ) {
  System . setSecurityManager ( new SecurityManager ( ) ) ;
  String input = args [ 0 ] ;
  int N = Integer . parseInt ( input ) ;
  int K = Integer . parseInt ( input ) ;
  int prev = 0 ;
  int l = 0 ;
  int r = 0 ;
  int seq = 1 ;
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
      if ( r - l == K ) {
        ans ++ ;
        l ++ ;
      }
    }
    else {
      prev = 0 ;
      l = r ;
    }
  }
  System . out . println ( ans ) ;
}
