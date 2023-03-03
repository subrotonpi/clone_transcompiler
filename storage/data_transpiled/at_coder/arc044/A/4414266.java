public static void input ( ) {
  String n = input . nextLine ( ) ;
  if ( "235" . equals ( n ) ) {
    System . out . println ( "Prime" ) ;
  }
  else if ( "245680" . equals ( n . substring ( n . length ( ) - 1 ) ) || Integer . parseInt ( n ) % 3 == 0 || "1" . equals ( n ) ) {
    System . out . println ( "Not Prime" ) ;
  }
  else {
    System . out . println ( "Prime" ) ;
  }
}
