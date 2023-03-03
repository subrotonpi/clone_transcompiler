public static void print ( String input ) {
  int n = Integer . parseInt ( input ) ;
  int [ ] a = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    a [ i ] = Integer . parseInt ( input ) ;
  }
  int m = n / 2 ;
  int cnt = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( a [ i ] % 2 == 0 ) {
      cnt ++ ;
      if ( a [ i ] % 4 == 0 ) {
        cnt ++ ;
      }
    }
  }
  System . out . println ( cnt >= 2 * m ? "Yes" : "No" ) ;
}
