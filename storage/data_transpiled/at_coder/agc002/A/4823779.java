public static int getInt ( ) {
  int a = Integer . parseInt ( input . nextLine ( ) ) ;
  int b = Integer . parseInt ( input . nextLine ( ) ) ;
  if ( a > 0 || ( b < 0 && ( b - a ) % 2 ) ) {
    System . out . println ( "Positive" ) ;
  }
  else if ( b < 0 ) {
    System . out . println ( "Negative" ) ;
  }
  else {
    System . out . println ( "Zero" ) ;
  }
  return a ;
}
