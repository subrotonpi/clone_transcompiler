public static void print ( int n ) {
  int [ ] a = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) a [ i ] = Integer . parseInt ( input ( ) ) ;
  int [ ] [ ] b = new int [ n ] [ ] , ans = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) b [ i ] [ 0 ] = a [ i ] ;
  Arrays . sort ( b ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( i % 2 != b [ i ] [ 1 ] % 2 ) ans ++ ;
  }
  System . out . println ( ans / 2 ) ;
}
