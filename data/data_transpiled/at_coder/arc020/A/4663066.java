public static int solve ( ) {
  int A = Integer . parseInt ( input . nextLine ( ) ) , B = Integer . parseInt ( input . nextLine ( ) ) ;
  if ( Math . abs ( A ) < Math . abs ( B ) ) {
    System . out . println ( "Ant" ) ;
  }
  else if ( Math . abs ( A ) == Math . abs ( B ) ) {
    System . out . println ( "Draw" ) ;
  }
  else {
    System . out . println ( "Bug" ) ;
  }
  return A ;
}
