public static int [ ] readIntList ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) , m = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] cnt = new int [ m ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    cnt [ i ] = 0 ;
  }
  for ( int j = 0 ;
  j < a . length ;
  j ++ ) {
    cnt [ j ] = 1 ;
  }
  int ans = 0 ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    if ( cnt [ i ] == n ) ans ++ ;
  }
  return ans ;
}
