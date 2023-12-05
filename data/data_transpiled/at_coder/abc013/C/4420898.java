public static void main ( String input ) {
  int n = Integer . parseInt ( input ) ;
  int h = Integer . parseInt ( input ) ;
  int a = Integer . parseInt ( input ) ;
  int b = Integer . parseInt ( input ) ;
  int c = Integer . parseInt ( input ) ;
  int d = Integer . parseInt ( input ) ;
  int e = Integer . parseInt ( input ) ;
  int res = 10 * 100 ;
  for ( int x = 0 ;
  x < n + 1 ;
  x ++ ) {
    int y = Math . max ( 0 , ( ( n - x ) * e - h - b * x ) / ( d + e ) + 1 ) ;
    res = Math . min ( res , x * a + y * c ) ;
  }
  System . out . println ( res ) ;
}
