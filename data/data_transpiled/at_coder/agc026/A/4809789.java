public static void print ( int n ) {
  int [ ] a = Integer . parseInt ( input ( ) ) ;
  int ans = 0 ;
  int pre = 0 ;
  for ( int i = 0 ;
  i < n - 1 ;
  i ++ ) {
    if ( a [ i ] == a [ i + 1 ] ) {
      if ( pre != 1 ) {
        pre = 1 ;
        ans ++ ;
      }
      else {
        pre = 0 ;
      }
    }
    else {
      pre = 0 ;
    }
  }
  System . out . println ( ans ) ;
}
