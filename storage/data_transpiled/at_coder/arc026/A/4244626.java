public static int N = Integer . parseInt ( input ) {
  int A = Integer . parseInt ( input . nextLine ( ) ) ;
  int B = Integer . parseInt ( input . nextLine ( ) ) ;
  if ( N <= 5 ) {
    System . out . println ( N * B ) ;
  }
  else {
    System . out . println ( 5 * B + ( N - 5 ) * A ) ;
  }
  return A ;
}
