public static int N = Integer . parseInt ( input ) {
  int M = Integer . parseInt ( input . nextLine ( ) ) ;
  if ( N == 1 && M == 1 ) {
    System . out . println ( 1 ) ;
  }
  else if ( N == 1 || M == 1 ) {
    System . out . println ( N * M - 2 ) ;
  }
  else {
    System . out . println ( N * M - N * 2 - M * 2 + 4 ) ;
  }
  return M ;
}
