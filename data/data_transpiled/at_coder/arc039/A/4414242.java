static final void main ( String [ ] args ) {
  System . setSecurityManager ( new SecurityManager ( ) ) ;
  String input = args [ 0 ] ;
  int _A , _B ;
  _A = Integer . parseInt ( input ) ;
  _B = Integer . parseInt ( input ) ;
  A = _A ;
  B = _B ;
  if ( A >= 900 ) {
    if ( A >= 990 ) A = A - ( A % 10 ) + 9 ;
    else A = A - ( ( A / 10 ) % 10 ) * 10 + 90 ;
  }
  else A = A - ( A / 100 ) * 100 + 90 ;
}
