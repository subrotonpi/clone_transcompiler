static final String print ( char [ ] s ) {
  System . setSecurityManager ( new SecurityManager ( ) ) ;
  Scanner input = new Scanner ( System . in ) ;
  String s = input . nextLine ( ) ;
  s = s . substring ( 0 , s . length ( ) ) ;
  return s ;
}
