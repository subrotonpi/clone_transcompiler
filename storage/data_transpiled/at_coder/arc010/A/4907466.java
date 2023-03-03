static final int solve ( ) {
  int n , m , a , b ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    int x = Integer . parseInt ( input . nextLine ( ) ) ;
    if ( n <= a ) {
      n = n + b ;
    }
    n = n - x ;
    if ( n < 0 ) {
      System . out . println ( i + 1 ) ;
      System . exit ( 0 ) ;
    }
  }
  System . out . println ( "complete" ) ;
}
