public static void input ( ) {
  String s = input . nextLine ( ) ;
  if ( "3" . equals ( s ) || Integer . parseInt ( s ) % 3 == 0 ) {
    System . out . println ( "YES" ) ;
  }
  else {
    System . out . println ( "NO" ) ;
  }
}
