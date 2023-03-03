public static void main ( String input ) {
  int n = Integer . parseInt ( input ) ;
  int [ ] a = new int [ n ] , b = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int s = Integer . parseInt ( input ) ;
    int t = Integer . parseInt ( input ) ;
    a [ i ] = s ;
    b [ i ] = t ;
  }
  int res = 0 ;
  for ( int i = n - 1 ;
  i >= 0 ;
  i -- ) {
    if ( ! ( a [ i ] + res ) % b [ i ] == 0 ) {
      res += b [ i ] - ( a [ i ] + res ) % b [ i ] ;
    }
  }
  System . out . println ( res ) ;
}
