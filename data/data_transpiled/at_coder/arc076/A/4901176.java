static final int N = Integer . parseInt ( input ) {
  int M = Integer . parseInt ( input . nextLine ( ) ) ;
  if ( N == M ) {
    System . out . println ( ( 2 * Math . factorial ( N ) * Math . factorial ( M ) ) % ( 10 * * 9 + 7 ) ) ;
  }
  else if ( N == M + 1 || N + 1 == M ) {
    System . out . println ( ( Math . factorial ( N ) * Math . factorial ( M ) ) % ( 10 * * 9 + 7 ) ) ;
  }
  else {
    System . out . println ( 0 ) ;
  }
  return M ;
}
