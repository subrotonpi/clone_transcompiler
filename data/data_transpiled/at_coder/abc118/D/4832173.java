private static int [ ] getDistance ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int m = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] A = new int [ n ] ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    A [ i ] = i ;
  }
  cost [ 0 ] = 0 ;
  cost [ 1 ] = 2 ;
  dp [ 0 ] = - 1 ;
  for ( int i = 1 ;
  i <= n ;
  i ++ ) {
    for ( int a : A ) {
      if ( i - cost [ a ] >= 0 ) dp [ i ] = Math . max ( dp [ i ] , a + dp [ i - cost [ a ] ] * 10 ) ;
    }
  }
  return dp ;
}
