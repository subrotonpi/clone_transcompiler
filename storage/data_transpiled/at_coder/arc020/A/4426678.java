public static void print ( String input ) {
  int a = Integer . parseInt ( input ) ;
  int b = Integer . parseInt ( input ) ;
  a = Math . abs ( a ) ;
  b = Math . abs ( b ) ;
  if ( a == b ) {
    System . out . println ( "Draw" ) ;
  }
  else if ( a > b ) {
    System . out . println ( "Bug" ) ;
  }
  else {
    System . out . println ( "Ant" ) ;
  }
}
