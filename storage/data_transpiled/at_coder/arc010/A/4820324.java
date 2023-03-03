static void n ( int m , int a , int b ) {
  int cnt = 0 ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    if ( n <= a ) n += b ;
    cnt ++ ;
    int c = Integer . parseInt ( input . nextLine ( ) ) ;
    n -= c ;
    if ( n < 0 ) {
      System . out . println ( cnt ) ;
      exit ( ) ;
    }
  }
  System . out . println ( "complete" ) ;
}
