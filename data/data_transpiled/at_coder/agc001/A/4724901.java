public static void print ( int n ) {
  int [ ] L = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    L [ i ] = Integer . parseInt ( input ( ) ) ;
  }
  int ans = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    ans += L [ i * 2 ] ;
  }
  System . out . println ( ans ) ;
}
