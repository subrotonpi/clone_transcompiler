static final void main ( String [ ] args ) {
  System . setSecurityManager ( new SecurityManager ( ) ) ;
  String input = args [ 0 ] ;
  int x = Integer . parseInt ( input ) ;
  int y = Integer . parseInt ( input ) ;
  int k = Integer . parseInt ( input ) ;
  int ans = 0 ;
  if ( y >= k ) {
    ans = x + k ;
  }
  else {
    ans = x - ( k - y ) + y ;
  }
  System . out . println ( ans ) ;
}
