public static String y ( ) {
  String m = y ;
  String d = y ;
  if ( Integer . parseInt ( m . substring ( 0 , 1 ) ) == 1 ) {
    System . out . println ( "TBD" ) ;
  }
  else if ( Integer . parseInt ( m . substring ( 1 , 4 ) ) > 4 ) {
    System . out . println ( "TBD" ) ;
  }
  else {
    System . out . println ( "Heisei" ) ;
  }
  return d ;
}
