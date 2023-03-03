public static int N = Integer . parseInt ( input ) {
  int A = Integer . parseInt ( input . nextLine ( ) ) ;
  int B = Integer . parseInt ( input . nextLine ( ) ) ;
  if ( ( N * A > B ) && ( N * B > A ) ) {
    System . out . println ( B ) ;
  }
  else {
    System . out . println ( N * A ) ;
  }
  return A ;
}
