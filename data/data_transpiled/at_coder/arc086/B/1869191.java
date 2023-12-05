public static void main ( String input ) {
  int n = Integer . parseInt ( input ) ;
  int [ ] a = Integer . parseInt ( input ) ;
  int [ ] seq ;
  for ( int i = 0 ;
  i <= n ;
  i ++ ) {
    Integer [ ] b = new Integer [ n ] ;
    for ( int j = 0 ;
    j <= n ;
    j ++ ) b [ j ] = a [ j ] ;
    seq = new int [ n - 1 ] ;
    for ( int j = i - 2 ;
    j >= 0 ;
    j -- ) {
      seq [ i ] = ( j + 1 ) ;
    }
    b [ i ] += 2 ;
  }
}
