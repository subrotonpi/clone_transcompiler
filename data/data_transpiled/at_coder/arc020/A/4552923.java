public static int getInt ( ) {
  int a = Integer . parseInt ( input . nextLine ( ) ) ;
  int b = Integer . parseInt ( input . nextLine ( ) ) ;
  if ( Math . abs ( a ) < Math . abs ( b ) ) {
    System . out . println ( "Ant" ) ;
  }
  else if ( Math . abs ( a ) > Math . abs ( b ) ) {
    System . out . println ( "Bug" ) ;
  }
  else {
    System . out . println ( "Draw" ) ;
  }
  return a ;
}
