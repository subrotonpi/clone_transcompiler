public static int input ( ) {
  int n = Integer . parseInt ( input . readLine ( ) ) ;
  int m = Integer . parseInt ( input . readLine ( ) ) ;
  int [ ] [ ] l = new int [ n ] [ 2 ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    l [ i ] [ 0 ] = 1 ;
  }
  l [ 0 ] [ 0 ] = 1 ;
  for ( int i = 0 ;
  i < n - 1 ;
  i ++ ) {
    l [ i + 1 ] [ 1 ] = 1 ;
  }
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    int a = Integer . parseInt ( input . readLine ( ) ) ;
    int b = Integer . parseInt ( input . readLine ( ) ) ;
    a = a - 1 ;
    b = b - 1 ;
    if ( l [ a ] [ 0 ] > 0 ) {
      l [ a ] [ 0 ] -- ;
      l [ b ] [ 0 ] ++ ;
    }
    else {
      l [ a ] [ 1 ] -- ;
      l [ b ] [ 1 ] ++ ;
    }
    if ( l [ b ] [ 0 ] > 0 ) {
      l [ b ] [ 0 ] += l [ b ] [ 1 ] ;
      l [ b ] [ 1 ] = 0 ;
    }
  }
  int ans = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( l [ i ] [ 0 ] > 0 ) ans ++ ;
  }
  System . out . println ( ans ) ;
  return ans ;
}
