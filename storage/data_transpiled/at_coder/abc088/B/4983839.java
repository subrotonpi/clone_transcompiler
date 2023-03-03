public static void print ( int n ) {
  int [ ] a = new int [ n ] ;
  a = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    a [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  int [ ] b = new int [ n ] ;
  Arrays . sort ( b ) ;
  int alice = 0 ;
  int bob = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( i % 2 == 0 ) {
      alice += b [ i ] ;
    }
    else {
      bob += b [ i ] ;
    }
  }
  int dif = alice - bob ;
  System . out . println ( dif ) ;
}
