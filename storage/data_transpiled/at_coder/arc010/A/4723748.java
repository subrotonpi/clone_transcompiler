static int n ( int m , int a , int b ) {
  int [ ] c = new int [ m ] ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) c [ i ] = Integer . parseInt ( input ( ) ) ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    if ( n <= a ) n += b ;
    n -= c [ i ] ;
    if ( n < 0 ) {
      System . out . println ( i + 1 ) ;
      exit ( 0 ) ;
    }
  }
  System . out . println ( "complete" ) ;
  return 0 ;
}
