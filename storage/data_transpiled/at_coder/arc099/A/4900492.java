public static void print ( String input ) {
  int N = Integer . parseInt ( input ) ;
  int K = Integer . parseInt ( input ) ;
  int ans = ( N - 1 ) / ( K - 1 ) == 0 ? N : ( N - 1 ) / ( K - 1 ) + 1 ;
  System . out . println ( ans ) ;
}
