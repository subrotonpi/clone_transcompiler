public static void main ( String input ) {
  int n = Integer . parseInt ( input ) ;
  int a = Integer . parseInt ( input ) ;
  int b = Integer . parseInt ( input ) ;
  int ans = 1 ;
  if ( n <= a ) {
    ans = 0 ;
  }
  else if ( ( a == b && n % ( a + 1 ) != 0 ) || a > b ) {
    ans = 0 ;
  }
  System . out . println ( new String [ ] {
    "Takahashi" , "Aoki" }
    [ ans ] ) ;
  }
  