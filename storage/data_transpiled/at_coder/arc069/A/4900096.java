public static int N ( ) {
  int M = Integer . parseInt ( input . nextLine ( ) ) ;
  if ( M <= 2 * N ) {
    System . out . println ( M / 2 ) ;
  }
  else {
    System . out . println ( N + ( M - 2 * N ) / 4 ) ;
  }
  return M ;
}
