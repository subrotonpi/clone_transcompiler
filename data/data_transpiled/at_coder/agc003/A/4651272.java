public static String S ( ) {
  String S = input . nextLine ( ) ;
  if ( S . contains ( "N" ) && S . contains ( "S" ) ) {
    if ( ( S . contains ( "W" ) && S . contains ( "E" ) ) || ( ! S . contains ( "W" ) && ! S . contains ( "E" ) ) ) {
      System . out . println ( "Yes" ) ;
    }
    else {
      System . out . println ( "No" ) ;
    }
  }
  else if ( S . contains ( "N" ) || S . contains ( "S" ) ) {
    System . out . println ( "No" ) ;
  }
  else {
    if ( S . contains ( "W" ) && S . contains ( "E" ) ) {
      System . out . println ( "Yes" ) ;
    }
    else {
      System . out . println ( "No" ) ;
    }
  }
  return S ;
}
