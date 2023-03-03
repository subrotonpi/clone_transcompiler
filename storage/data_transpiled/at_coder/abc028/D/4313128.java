public static void main ( String input ) {
  int N = Integer . parseInt ( input ) , K = Integer . parseInt ( input ) ;
  int cA = 1 ;
  int cB = ( N - 1 ) * 3 ;
  int cC = 6 * ( N - K ) * ( K - 1 ) ;
  System . out . println ( ( cA + cB + cC ) / N * N ) ;
}
