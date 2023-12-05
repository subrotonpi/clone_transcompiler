public static int N = Integer . parseInt ( input ) {
  int A = Integer . parseInt ( input . nextLine ( ) ) ;
  int B = Integer . parseInt ( input . nextLine ( ) ) ;
  if ( N * A < B ) {
    System . out . println ( N * A ) ;
  }
  else {
    System . out . println ( B ) ;
  }
  return A ;
}
