public static int A = Integer . parseInt ( input ) {
  int B = Integer . parseInt ( input . nextLine ( ) ) ;
  if ( Math . abs ( A ) > Math . abs ( B ) ) {
    System . out . println ( "Bug" ) ;
  }
  else if ( Math . abs ( A ) < Math . abs ( B ) ) {
    System . out . println ( "Ant" ) ;
  }
  else {
    System . out . println ( "Draw" ) ;
  }
  return A ;
}
