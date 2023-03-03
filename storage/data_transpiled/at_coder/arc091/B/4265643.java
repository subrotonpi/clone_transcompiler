static final void main ( String [ ] args ) {
  System . setSecurityManager ( new SecurityManager ( ) ) ;
  String input = System . getProperty ( "line.separator" ) ;
  int N = Integer . parseInt ( input ) ;
  int K = Integer . parseInt ( input ) ;
  int ans = 0 ;
  if ( K == 0 ) {
    ans = N * N ;
  }
  else {
    for ( int b = K + 1 ;
    b <= N ;
    b ++ ) {
      ans += ( N / b ) * ( b - K ) ;
      int r = N % b ;
      if ( K <= r && r < b ) ans += Math . max ( 0 , r - K + 1 ) ;
    }
  }
  System . out . println ( ans ) ;
}
