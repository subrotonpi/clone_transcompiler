public static String input ( ) {
  String a , b ;
  a = input . split ( " " ) [ 0 ] ;
  b = input . split ( " " ) [ 1 ] ;
  if ( a . equals ( "H" ) ) {
    System . out . println ( b ) ;
  }
  else if ( a . equals ( "D" ) && b . equals ( "H" ) ) {
    System . out . println ( "D" ) ;
  }
  else {
    System . out . println ( "H" ) ;
  }
  return a ;
}
