public static void main ( String input ) {
  int MOD = 10 * 9 + 7 ;
  int a = Integer . parseInt ( input ) ;
  int b = Integer . parseInt ( input ) ;
  int res = 1 ;
  for ( int i = 1 ;
  i < b ;
  i ++ ) {
    res = res * ( a + b - i - 1 ) * Math . pow ( i , MOD - 2 , MOD ) % MOD ;
  }
  System . out . println ( res ) ;
}
