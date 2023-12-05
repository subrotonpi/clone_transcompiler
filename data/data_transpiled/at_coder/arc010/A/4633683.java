static int n = Integer . parseInt ( input ) {
  int m = Integer . parseInt ( input . nextLine ( ) ) ;
  int a = Integer . parseInt ( input . nextLine ( ) ) ;
  int b = Integer . parseInt ( input . nextLine ( ) ) ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    if ( n <= a ) n += b ;
    n -= Integer . parseInt ( input . nextLine ( ) ) ;
    if ( n < 0 ) {
      System . out . println ( i + 1 ) ;
      break ;
    }
    if ( i + 1 == m ) System . out . println ( "complete" ) ;
  }
  return m ;
}
