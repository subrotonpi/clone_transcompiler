static final void main ( String input ) {
  System . setSecurityManager ( new SecurityManager ( ) ) ;
  input = System . console ( ) ;
  int h = Integer . parseInt ( input ) ;
  int m = Integer . parseInt ( input ) ;
  int ams = 0 ;
  if ( m == 0 ) {
    ans = ( 18 - h ) * 60 ;
  }
  else {
    ans = ( 18 - h - 1 ) * 60 + ( 60 - m ) ;
  }
  System . out . println ( ans ) ;
}
