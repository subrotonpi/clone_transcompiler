public static int N ( Scanner input ) {
  int N = input . nextInt ( ) ;
  int H = input . nextInt ( ) ;
  int A = input . nextInt ( ) ;
  int B = input . nextInt ( ) ;
  int C = input . nextInt ( ) ;
  int D = input . nextInt ( ) ;
  int E = input . nextInt ( ) ;
  float inf = Float . POSITIVE_INFINITY ;
  float [ ] dp = new float [ N + 1 ] ;
  dp [ 0 ] = inf ;
  dp [ 1 ] = C * N ;
  for ( int i = 1 ;
  i <= 1 ;
  i ++ ) {
    float cost = C * ( N - i ) ;
    int hung = H + D * ( N - i ) - E * i ;
    if ( hung > 0 ) dp [ i ] = cost ;
    else {
      int inc = 1 + ( Math . abs ( hung ) ) / ( B - D ) ;
      if ( inc > N - i ) break ;
      cost += ( A - C ) * inc ;
      dp [ i ] = cost ;
    }
  }
  System . out . println ( min ( dp ) ) ;
  return N ;
}
