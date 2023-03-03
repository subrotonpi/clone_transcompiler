private static int [ ] [ ] a ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int m = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] [ ] a = new int [ n ] [ m ] ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    int x = Integer . parseInt ( input . nextLine ( ) ) ;
    int y = Integer . parseInt ( input . nextLine ( ) ) ;
    x -- ;
    y -- ;
    a [ x ] [ 0 ] -- ;
    a [ y ] [ 0 ] ++ ;
    a [ y ] [ 1 ] += a [ x ] [ 1 ] ;
    if ( a [ x ] [ 0 ] == 0 ) a [ x ] [ 1 ] = 0 ;
  }
  int cnt = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( a [ i ] [ 1 ] > 0 ) cnt ++ ;
  }
  System . out . println ( cnt ) ;
  return a ;
}
