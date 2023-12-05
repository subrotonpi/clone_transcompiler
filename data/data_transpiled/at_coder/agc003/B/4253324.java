static final void main ( String input ) {
  System . setSecurityManager ( new SecurityManager ( ) ) ;
  input = System . in ;
  int N = Integer . parseInt ( input ) ;
  int [ ] A = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    A [ i ] = Integer . parseInt ( input ) ;
  }
  A [ N ] = 0 ;
  int ans = 0 ;
  int tmp = 0 ;
  for ( int a : A ) {
    if ( a == 0 ) {
      ans += tmp / 2 ;
      tmp = 0 ;
    }
    else {
      tmp += a ;
    }
  }
  System . out . println ( ans ) ;
}
