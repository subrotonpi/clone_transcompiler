public static void print ( int n ) {
  int [ ] l = new int [ n ] ;
  int [ ] r = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int lt = Integer . parseInt ( input . nextLine ( ) ) ;
    int rt = Integer . parseInt ( input . nextLine ( ) ) ;
    l [ i ] = lt ;
    r [ i ] = rt ;
  }
  l [ 0 ] = 0 ;
  r [ 0 ] = 0 ;
  Arrays . sort ( l ) ;
  Arrays . sort ( r ) ;
  Collections . reverse ( r ) ;
  int ans = 0 ;
  int i = 0 ;
  while ( r [ i ] < l [ i ] ) {
    ans += 2 * ( l [ i ] - r [ i ] ) ;
    i ++ ;
  }
  System . out . println ( ans ) ;
}
