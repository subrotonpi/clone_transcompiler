public static void print ( String input ) {
  int n = Integer . parseInt ( input ) ;
  int k = Integer . SIZE - 2 ;
  int t = 0 ;
  int x = 1 ;
  while ( x <= n ) {
    t ++ ;
    if ( ( t % 2 ) ^ ( k % 2 ) ) x = x * 2 ;
    else x = x * 2 + 1 ;
  }
  System . out . println ( t % 2 ? "Aoki" : "Takahashi" ) ;
}
