public static void print ( ) {
  n = Integer . parseInt ( input ( ) ) ;
  l = new boolean [ 10 * 5 + 1 ] ;
  int ans = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int a = Integer . parseInt ( input ( ) ) ;
    if ( l [ a ] ) ans ++ ;
    l [ a ] = true ;
  }
  System . out . println ( ans ) ;
}
