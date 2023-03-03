public static void main ( String input ) {
  int N = Integer . parseInt ( input ) ;
  int H = Integer . parseInt ( input ) ;
  int A = Integer . parseInt ( input ) ;
  int B = Integer . parseInt ( input ) ;
  int C = Integer . parseInt ( input ) ;
  int D = Integer . parseInt ( input ) ;
  int E = Integer . parseInt ( input ) ;
  int minCost = A * N ;
  for ( int i = 0 ;
  i <= N ;
  i ++ ) {
    int j = Math . max ( 0 , ( N * E - H - i * ( B + E ) ) / ( D + E ) + 1 ) ;
    int k = N - i - j ;
    minCost = Math . min ( minCost , A * i + C * j ) ;
  }
  System . out . println ( minCost ) ;
}
