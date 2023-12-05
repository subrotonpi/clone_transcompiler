public static void print ( int n ) {
  int [ ] visited = new int [ 100001 ] ;
  for ( int x = 0 ;
  x < n ;
  x ++ ) visited [ x ] = 0 ;
  int ans = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int a = Integer . parseInt ( input ( ) ) ;
    if ( visited [ a - 1 ] != 0 ) ans ++ ;
    else visited [ a - 1 ] ++ ;
  }
  System . out . println ( ans ) ;
}
