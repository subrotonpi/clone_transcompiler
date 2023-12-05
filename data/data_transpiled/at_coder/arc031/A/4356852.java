static final String print ( ) {
  System . setSecurityManager ( new SecurityManager ( ) ) ;
  Scanner input = new Scanner ( System . in ) ;
  String s = input . nextLine ( ) ;
  s = s . substring ( 0 , s . length ( ) - 1 ) ;
  return s ;
}
