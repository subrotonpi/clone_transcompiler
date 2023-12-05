static final void main ( String [ ] args ) {
  System . setSecurityManager ( new SecurityManager ( ) ) ;
  String input = args [ 0 ] ;
  int A = Integer . parseInt ( input ) ;
  int B = Integer . parseInt ( input ) ;
  int ans ;
  if ( A >= 0 ) {
    ans = B - A ;
  }
  else if ( B <= 0 ) {
    ans = B - A ;
  }
  else {
    ans = B - A - 1 ;
  }
  System . out . println ( ans ) ;
}
