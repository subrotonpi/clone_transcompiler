public static int N = Integer . parseInt ( input ) {
  int M = Integer . parseInt ( input . nextLine ( ) ) ;
  int A = Integer . parseInt ( input . nextLine ( ) ) ;
  int B = Integer . parseInt ( input . nextLine ( ) ) ;
  int meishi = N ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    int c = Integer . parseInt ( input . nextLine ( ) ) ;
    if ( meishi <= A ) meishi += B ;
    meishi -= c ;
    if ( meishi < 0 ) {
      System . out . println ( i + 1 ) ;
      break ;
    }
  }
  else System . out . println ( "complete" ) ;
  return M ;
}
