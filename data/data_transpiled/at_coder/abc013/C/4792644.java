public static void main ( String input ) {
  int n = Integer . parseInt ( input ) ;
  int h = Integer . parseInt ( input ) ;
  int a = Integer . parseInt ( input ) ;
  int b = Integer . parseInt ( input ) ;
  int c = Integer . parseInt ( input ) ;
  int d = Integer . parseInt ( input ) ;
  int e = Integer . parseInt ( input ) ;
  int ans = 10 * 20 ;
  for ( int i = 0 ;
  i < n + 1 ;
  i ++ ) {
    int j = Math . max ( 0 , ( - h - b * i + e * ( n - i ) ) / ( d + e ) + 1 ) ;
    ans = Math . min ( ans , a * i + c * j ) ;
  }
  System . out . println ( ans ) ;
}
