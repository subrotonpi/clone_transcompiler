public static int compareTo ( String input ) {
  int a = Integer . parseInt ( input ) ;
  int b = Integer . parseInt ( input ) ;
  if ( a > b ) {
    System . out . println ( "GREATER" ) ;
  }
  else if ( a < b ) {
    System . out . println ( "LESS" ) ;
  }
  else {
    System . out . println ( "EQUAL" ) ;
  }
  return a ;
}
