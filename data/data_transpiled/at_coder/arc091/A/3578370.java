public static int N = Integer . parseInt ( input ) {
  int M = Integer . parseInt ( input . nextLine ( ) ) ;
  if ( N == 2 || M == 2 ) {
    System . out . println ( 0 ) ;
  }
  else if ( N == 1 || M == 1 ) {
    if ( N * M == 1 ) {
      System . out . println ( 1 ) ;
    }
    else {
      System . out . println ( M * N - 2 ) ;
    }
  }
  else {
    System . out . println ( ( N - 2 ) * ( M - 2 ) ) ;
  }
  return M ;
}
