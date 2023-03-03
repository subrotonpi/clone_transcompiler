public static int N ( ) {
  int A = Integer . parseInt ( input . nextLine ( ) ) ;
  int B = Integer . parseInt ( input . nextLine ( ) ) ;
  if ( N > 5 ) {
    System . out . println ( ( N - 5 ) * A + 5 * B ) ;
  }
  else {
    System . out . println ( B * N ) ;
  }
  return A ;
}
