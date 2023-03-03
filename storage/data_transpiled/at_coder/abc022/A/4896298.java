public static int n ( ) {
  int s = Integer . parseInt ( input . nextLine ( ) ) ;
  int t = Integer . parseInt ( input . nextLine ( ) ) ;
  int w = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] a_array = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    a_array [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  int cnt = s <= w && w <= t ? 1 : 0 ;
  for ( int a : a_array ) {
    w += a ;
    if ( s <= w && a <= t ) {
      cnt ++ ;
    }
  }
  System . out . println ( cnt ) ;
  return cnt ;
}
