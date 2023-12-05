public static void main ( String input ) {
  int N = Integer . parseInt ( input ) ;
  int K = Integer . parseInt ( input ) ;
  int answer = ( ( K - 1 ) * 1 * ( N - K ) * 6 + 1 * 1 * ( N - K ) * 3 + ( K - 1 ) * 1 * 1 * 3 + 1 ) / N * 3 ;
  System . out . println ( answer ) ;
}
