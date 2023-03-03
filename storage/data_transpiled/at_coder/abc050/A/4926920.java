public static String print ( String a , String b , String c ) {
  if ( b . equals ( "+" ) ) {
    System . out . println ( Integer . parseInt ( a ) + Integer . parseInt ( c ) ) ;
  }
  else {
    System . out . println ( Integer . parseInt ( a ) - Integer . parseInt ( c ) ) ;
  }
  return a ;
}
