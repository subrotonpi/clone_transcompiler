public static int compareTo ( String input ) {
  int a = Integer . parseInt ( input ) ;
  int b = Integer . parseInt ( input ) ;
  if ( a == b ) {
    System . out . println ( "EQUAL" ) ;
  }
  else if ( a > b ) {
    System . out . println ( "GREATER" ) ;
  }
  else if ( a < b ) {
    System . out . println ( "LESS" ) ;
  }
  return a ;
}
