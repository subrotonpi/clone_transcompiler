public static void print ( String input ) {
  int a = Integer . parseInt ( input ) ;
  int b = Integer . parseInt ( input ) ;
  if ( Math . abs ( a ) < Math . abs ( b ) ) {
    System . out . println ( "Ant" ) ;
  }
  else if ( Math . abs ( a ) == Math . abs ( b ) ) {
    System . out . println ( "Draw" ) ;
  }
  else {
    System . out . println ( "Bug" ) ;
  }
}
