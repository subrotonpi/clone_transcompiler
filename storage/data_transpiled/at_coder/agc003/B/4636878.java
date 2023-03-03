public static void print ( int n ) {
  int [ ] alist = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) alist [ i ] = Integer . parseInt ( input ( ) ) ;
  int np = 0 ;
  int remain = 0 ;
  for ( int a : alist ) {
    if ( a == 0 ) remain = 0 ;
    else if ( remain == 0 ) {
      np += a / 2 ;
      remain = a % 2 ;
    }
    else {
      np += ( a + remain ) / 2 ;
      remain = ( a + remain ) % 2 ;
    }
  }
  System . out . println ( np ) ;
}
