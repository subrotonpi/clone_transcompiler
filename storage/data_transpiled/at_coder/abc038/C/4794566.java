public static void print ( int n ) {
  int [ ] a = Integer . parseInt ( input ( ) ) ;
  int cnt = 1 ;
  int temp = 1 ;
  for ( int i = 0 ;
  i < n - 1 ;
  i ++ ) {
    if ( a [ i ] < a [ i + 1 ] ) {
      temp ++ ;
      cnt += temp ;
    }
    else {
      cnt ++ ;
      temp = 1 ;
    }
  }
  System . out . println ( cnt ) ;
}
