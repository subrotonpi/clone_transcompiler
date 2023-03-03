public static int N ( int N , int H ) {
  int A = Integer . parseInt ( input . nextLine ( ) ) ;
  int B = Integer . parseInt ( input . nextLine ( ) ) ;
  int C = Integer . parseInt ( input . nextLine ( ) ) ;
  int D = Integer . parseInt ( input . nextLine ( ) ) ;
  int E = Integer . parseInt ( input . nextLine ( ) ) ;
  int minCost = C * N ;
  for ( int x = 0 ;
  x < N + 1 ;
  x ++ ) {
    int Y = Math . max ( ( ( N - x ) * E - H - B * x ) / ( D + E ) + 1 , 0 ) ;
    minCost = Math . min ( minCost , A * x + C * Y ) ;
  }
  System . out . println ( minCost ) ;
  return minCost ;
}
