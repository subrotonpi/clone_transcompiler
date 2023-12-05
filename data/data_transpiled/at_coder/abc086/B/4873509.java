static final double sqrt ( double s ) {
  final String s = input . nextLine ( ) ;
  s = Integer . parseInt ( s . replace ( " " , "" ) ) ;
  if ( ( Math . sqrt ( s ) == Math . floor ( Math . sqrt ( s ) ) ) ) {
    System . out . println ( "Yes" ) ;
  }
  else {
    System . out . println ( "No" ) ;
  }
  return s ;
}
