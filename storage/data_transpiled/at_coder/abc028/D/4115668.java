public static void main ( String input ) {
  int N = Integer . parseInt ( input ) ;
  int K = Integer . parseInt ( input ) ;
  int ans = 0 ;
  ans ++ ;
  ans += 3 * ( N - 1 ) ;
  ans += 6 * ( ( K - 1 ) * ( N - K ) ) ;
  System . out . println ( ans / ( N * * 3 ) ) ;
}
