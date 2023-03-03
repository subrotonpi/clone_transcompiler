static int n ( int m , int a , int b ) {
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    if ( n <= a ) {
      n += b ;
    }
    int c = Integer . parseInt ( input . nextLine ( ) ) ;
    n -= c ;
    if ( n < 0 ) {
      System . out . println ( i + 1 ) ;
      exit ( ) ;
    }
  }
  System . out . println ( "complete" ) ;
  return 0 ;
}
