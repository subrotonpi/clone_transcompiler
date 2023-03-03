public static void print ( String n ) {
  n = String . valueOf ( input . nextLine ( ) ) ;
  if ( n . equals ( n . substring ( n . length ( ) , n . length ( ) ) ) ) {
    System . out . println ( "Yes" ) ;
  }
  else {
    System . out . println ( "No" ) ;
  }
}
