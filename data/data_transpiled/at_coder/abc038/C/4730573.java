public static void print ( int n ) {
  int [ ] a = Integer . parseInt ( input ( ) ) ;
  int ans = 0 ;
  int before = a [ 0 ] ;
  int cnt = 1 ;
  for ( int i = 1 ;
  i < n ;
  i ++ ) {
    if ( before < a [ i ] ) {
      ans += cnt ;
      cnt ++ ;
    }
    else {
      cnt = 1 ;
    }
    before = a [ i ] ;
  }
  System . out . println ( ans + n ) ;
}
