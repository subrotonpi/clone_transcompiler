public static String print ( String a , String op , String b ) {
  if ( op . equals ( "+" ) ) {
    System . out . println ( Integer . parseInt ( a ) + Integer . parseInt ( b ) ) ;
  }
  else if ( op . equals ( "-" ) ) {
    System . out . println ( Integer . parseInt ( a ) - Integer . parseInt ( b ) ) ;
  }
  return a ;
}
