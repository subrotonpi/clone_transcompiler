static final String getString ( ) {
  Scanner input = new Scanner ( System . in ) ;
  String s = input . nextLine ( ) ;
  if ( s . contains ( "a" ) && s . contains ( "b" ) && s . contains ( "c" ) ) {
    System . out . println ( "Yes" ) ;
  }
  else {
    System . out . println ( "No" ) ;
  }
  return s ;
}
