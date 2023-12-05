public static void print ( String input ) {
  int n = Integer . parseInt ( input ) ;
  int a = 0 ;
  int b = 0 ;
  for ( int i = 2 ;
  i <= n ;
  i ++ ) {
    System . out . print ( "? 1" + i ) ;
    int temp = Integer . parseInt ( input ) ;
    if ( temp > b ) {
      b = temp ;
      a = i ;
    }
  }
  int ans = 0 ;
  for ( int i = 1 ;
  i <= n ;
  i ++ ) {
    if ( i == a ) continue ;
    System . out . print ( "?" + a + " " + i ) ;
    int temp = Integer . parseInt ( input ) ;
    if ( temp > ans ) {
      ans = temp ;
    }
  }
  System . out . println ( "!" + ans ) ;
}
