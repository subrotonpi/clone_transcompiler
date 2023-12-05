public static void print ( int n ) {
  int [ ] a = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) a [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  Arrays . sort ( a ) ;
  @ SuppressWarnings ( "unchecked" ) Counter < Integer > dic = new Counter < Integer > ( ) ;
  int ans = 0 ;
  for ( int k = a . length - 1 ;
  k >= 0 ;
  k -- ) {
    if ( dic . get ( a [ k ] ) == 0 ) continue ;
    dic . get ( a [ k ] ) -- ;
    int t = 2 * a [ k ] - a [ k ] ;
    if ( dic . get ( t ) != 0 ) {
      dic . get ( t ) -- ;
      ans ++ ;
    }
  }
  System . out . println ( ans ) ;
}
