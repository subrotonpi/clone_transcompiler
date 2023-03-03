static final int input ( ) {
  int n = Integer . parseInt ( input . readLine ( ) ) , y = Integer . parseInt ( input . readLine ( ) ) ;
  if ( n * 10000 < y || y % 1000 == 0 ) {
    System . out . println ( "-1 -1 -1" ) ;
    System . exit ( 0 ) ;
  }
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    for ( int j = 0 ;
    j < n - i ;
    j ++ ) {
      int k = n - i - j ;
      if ( k * 10000 < y ) {
        System . out . println ( k ) ;
      }
    }
  }
  return y ;
}
