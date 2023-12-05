public static int Q = Integer . parseInt ( input ) {
  int Q = Integer . parseInt ( input . readLine ( ) ) ;
  int H = Integer . parseInt ( input . readLine ( ) ) ;
  int S = Integer . parseInt ( input . readLine ( ) ) ;
  int D = Integer . parseInt ( input . readLine ( ) ) ;
  int N = Integer . parseInt ( input . readLine ( ) ) ;
  int efficientNum = 0 , efficientCost = 8 * Q ;
  if ( ( efficientCost > 4 * H ) && ( efficientCost < 1 ) ) efficientNum = 1 , efficientCost = 4 * H ;
  if ( ( efficientCost > 2 * S ) && ( efficientCost < 2 ) ) efficientNum = 2 , efficientCost = 2 * S ;
  if ( ( efficientCost > D ) && ( efficientCost < 3 ) ) efficientNum = 3 , efficientCost = D ;
  int minCost = 0 ;
  if ( ( N % 2 ) == 0 ) {
    if ( ( efficientNum == 0 ) && ( efficientCost < 1 ) ) minCost = ( int ) ( N / 0.25 ) * Q ;
    else if ( ( efficientNum == 1 ) && ( efficientCost < 2 ) ) minCost = ( int ) ( N / 0.50 ) * H ;
    else if ( ( efficientNum == 2 ) && ( efficientCost < 3 ) ) minCost = N * S ;
    else if ( ( efficientNum == 3 ) && ( efficientCost < 2 ) ) minCost = ( N / 2 ) * D ;
  }
  else {
    N = 2 * ( N / 2 ) ;
    if ( ( efficientNum == 0 ) && ( efficientCost < 1 ) ) minCost = ( int ) ( N / 0.25 ) * Q ;
    else if ( ( efficientNum == 1 ) && ( efficientCost < 2 ) ) minCost = ( int ) ( N / 0.50 ) * H ;
    else if ( ( efficientNum == 2 ) && ( efficientCost < 3 ) ) minCost = ( N / 2 ) * D ;
  }
  System . out . println ( minCost ) ;
  return minCost ;
}
