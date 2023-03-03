public static int bAachillesAndTurtle ( int N , int Va , int Vb , int L ) {
  double distance = L ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    double takahashiMovingDist = distance ;
    double turtleMovingDist = distance * ( 1 + ( Vb / Va ) ) ;
    distance = turtleMovingDist - takahashiMovingDist ;
    if ( distance <= 10 * ( - 10 ) ) {
      distance = 0 ;
      break ;
    }
  }
  int ans = Math . round ( distance ) ;
  return ans ;
}
