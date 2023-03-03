public static String enter ( ) {
  String C1 = input . nextLine ( ) ;
  String C2 = input . nextLine ( ) ;
  if ( C1 . length ( ) > 0 && C1 . charAt ( 0 ) == C2 ) {
    System . out . println ( "YES" ) ;
  }
  else {
    System . out . println ( "NO" ) ;
  }
  return C1 ;
}
