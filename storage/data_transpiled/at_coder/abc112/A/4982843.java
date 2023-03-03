public static int N ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  switch ( N ) {
    case 1 : System . out . println ( "Hello World" ) ;
    break ;
    case 2 : int A = Integer . parseInt ( input . nextLine ( ) ) ;
    int B = Integer . parseInt ( input . nextLine ( ) ) ;
    System . out . println ( A + B ) ;
    break ;
  }
  return N ;
}
