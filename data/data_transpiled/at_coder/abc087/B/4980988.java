public static void main ( String input ) {
  int a = Integer . parseInt ( input ) ;
  int b = Integer . parseInt ( input ) ;
  int c = Integer . parseInt ( input ) ;
  int x = Integer . parseInt ( input ) ;
  int ans = 0 ;
  for ( int i = 0 ;
  i < a + 1 ;
  i ++ ) {
    for ( int j = 0 ;
    j < b + 1 ;
    j ++ ) {
      if ( 0 <= ( x - 500 * i - 100 * j ) / 50 <= c ) {
        ans ++ ;
      }
    }
  }
  System . out . println ( ans ) ;
}
