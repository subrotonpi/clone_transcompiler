public static void print ( int n ) {
  int [ ] l = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) l [ i ] = Integer . parseInt ( input ( ) ) ;
  Arrays . sort ( l ) ;
  int cnt = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    cnt += l [ 2 * i ] ;
  }
  System . out . println ( cnt ) ;
}
