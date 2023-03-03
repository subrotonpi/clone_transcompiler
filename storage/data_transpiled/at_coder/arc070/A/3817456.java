public static int n ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  for ( int t = 0 ;
  t < 10 * 9 ;
  t ++ ) {
    n -= t ;
    if ( n <= 0 ) System . out . println ( t ) ;
    break ;
  }
  return n ;
}
