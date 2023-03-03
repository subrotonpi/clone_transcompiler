public static void print ( int n ) {
  int [ ] list = new int [ n + 1 ] ;
  list [ 0 ] = 2 ;
  list [ 1 ] = 1 ;
  for ( int i = 2 ;
  i <= n ;
  i ++ ) {
    list [ i ] = list [ i - 1 ] + list [ i - 2 ] ;
  }
  System . out . println ( list [ n ] ) ;
}
