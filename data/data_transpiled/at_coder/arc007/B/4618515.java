private static void print ( String input ) {
  int n = Integer . parseInt ( input . substring ( 0 , 1 ) ) ;
  int m = Integer . parseInt ( input . substring ( 1 , n ) ) ;
  int [ ] L = new int [ n + 1 ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    L [ i ] = i ;
  }
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    int i = Integer . parseInt ( input . substring ( 0 , i ) ) ;
    int j = L . indexOf ( i ) ;
    L [ 0 ] = L [ j ] = i ;
  }
  for ( int i = 1 ;
  i <= n ;
  i ++ ) {
    System . out . println ( L [ i ] ) ;
  }
}
