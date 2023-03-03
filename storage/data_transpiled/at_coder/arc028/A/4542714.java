public static int N = Integer . parseInt ( input ) {
  int A = Integer . parseInt ( input . nextLine ( ) ) ;
  int B = Integer . parseInt ( input . nextLine ( ) ) ;
  if ( N % ( A + B ) == 0 ) {
    System . out . println ( "Bug" ) ;
  }
  else if ( N % ( A + B ) <= A ) {
    System . out . println ( "Ant" ) ;
  }
  else {
    System . out . println ( "Bug" ) ;
  }
  return N ;
}
