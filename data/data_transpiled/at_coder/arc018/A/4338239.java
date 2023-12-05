static public final void main ( String input ) {
  System . setSecurityManager ( new SecurityManager ( ) ) ;
  input = input . trim ( ) ;
  H = map ( Float . parseFloat ( input ) ) ;
  B = map ( Float . parseFloat ( input ) ) ;
  System . out . println ( B * H * H / 10 * * 4 ) ;
}
