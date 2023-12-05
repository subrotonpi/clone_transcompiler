static final void init ( ) {
  System . setSecurityManager ( new SecurityManager ( ) ) ;
  String input = System . getProperty ( "line.separator" ) ;
  int N = Integer . parseInt ( input . trim ( ) ) ;
  String ans = "Blue" ;
  if ( N % 2 == 1 ) {
    ans = "Red" ;
  }
  System . out . println ( ans ) ;
}
