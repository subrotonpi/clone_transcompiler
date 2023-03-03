public static void print ( int n ) {
  int [ ] l = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    l [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  Arrays . sort ( l , Collections . reverseOrder ( ) ) ;
  int ans = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    ans += l [ 2 * i + 1 ] ;
  }
  System . out . println ( ans ) ;
}
