public static int A = Integer . parseInt ( input ) {
  int B = Integer . parseInt ( input . nextLine ( ) ) ;
  if ( A == 1 || B == 1 ) {
    if ( A == B ) {
      System . out . println ( "Draw" ) ;
    }
    else {
      if ( A == 1 ) {
        System . out . println ( "Alice" ) ;
      }
      else {
        System . out . println ( "Bob" ) ;
      }
    }
  }
  else {
    if ( A == B ) {
      System . out . println ( "Draw" ) ;
    }
    else if ( A > B ) {
      System . out . println ( "Alice" ) ;
    }
    else {
      System . out . println ( "Bob" ) ;
    }
  }
  return A ;
}
