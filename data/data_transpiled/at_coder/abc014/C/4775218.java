public static int [ ] getCustomersNumber ( ) {
  int n = Integer . parseInt ( input ( ) ) ;
  int [ ] a = new int [ n ] ;
  int [ ] b = new int [ n ] ;
  int [ ] diff = new int [ 1000002 ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    a [ i ] = Integer . parseInt ( input ( ) ) ;
    b [ i ] = Integer . parseInt ( input ( ) ) ;
    diff [ a [ i ] ] ++ ;
    diff [ b [ i ] + 1 ] -- ;
  }
  int maxCustomer = 0 ;
  int customer = 0 ;
  for ( int i = 0 ;
  i < 1000001 ;
  i ++ ) {
    if ( diff [ i ] != 0 ) {
      customer += diff [ i ] ;
      maxCustomer = Math . max ( maxCustomer , customer ) ;
    }
  }
  System . out . println ( maxCustomer ) ;
  return a ;
}
