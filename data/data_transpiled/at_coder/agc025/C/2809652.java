public static void print ( int n ) {
  int [ ] l = new int [ n ] ;
  int [ ] r = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int l1 = Integer . parseInt ( input . nextLine ( ) ) ;
    int r1 = Integer . parseInt ( input . nextLine ( ) ) ;
    l [ i ] = l1 ;
    r [ i ] = r1 ;
  }
  Arrays . sort ( l ) ;
  Arrays . sort ( r ) ;
  int result = 0 ;
  for ( int i = 0 ;
  i < n + 1 ;
  i ++ ) {
    if ( l [ i ] > r [ i ] ) {
      result += l [ i ] - r [ i ] ;
    }
  }
  System . out . println ( result * 2 ) ;
}
