public static int A = Integer . parseInt ( input ) {
  int A = 0 , B = 0 ;
  if ( A == 1 ) {
    A = 14 ;
  }
  if ( B == 1 ) {
    B = 14 ;
  }
  if ( A == B ) {
    System . out . println ( "Draw" ) ;
  }
  else if ( A > B ) {
    System . out . println ( "Alice" ) ;
  }
  else {
    System . out . println ( "Bob" ) ;
  }
  return A ;
}
