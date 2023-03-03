static int N = Integer . parseInt ( input ) {
  int M = Integer . parseInt ( input . nextLine ( ) ) ;
  int A = Integer . parseInt ( input . nextLine ( ) ) ;
  int B = Integer . parseInt ( input . nextLine ( ) ) ;
  int * c = Integer . parseInt ( input . nextLine ( ) ) ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    if ( N <= A ) N += B ;
    if ( N < c [ i ] ) {
      System . out . println ( i + 1 ) ;
      break ;
    }
    N -= c [ i ] ;
    if ( i == M - 1 ) System . out . println ( "complete" ) ;
  }
  return M ;
}
