public static void print ( int n ) {
  int [ ] a = Integer . parseInt ( input ( ) ) ;
  int m = - 5000 ;
  for ( int x = 0 ;
  x < n ;
  x ++ ) {
    int k = - 5000 ;
    int l = - 5000 ;
    for ( int y = 0 ;
    y < x + 1 ;
    y ++ ) {
      int p = Integer . parseInt ( a [ Math . min ( x , y ) ] ) ;
      int q = Integer . parseInt ( a [ Math . min ( x , y ) + 1 ] ) ;
      if ( q > l ) {
        k = p ;
        l = q ;
      }
    }
    m = Math . max ( m , k ) ;
  }
  System . out . println ( m ) ;
}
