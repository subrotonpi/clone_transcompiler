public static int aMovingWalkway ( int L , int X , int Y , int S , int D ) {
  int distanceStartToGoal = S <= D ? D - S : D + ( L - S ) ;
  int ans ;
  if ( X < Y ) {
    ans = Math . min ( distanceStartToGoal / ( X + Y ) , ( L - distanceStartToGoal ) / ( Y - X ) ) ;
  }
  else {
    ans = distanceStartToGoal / ( X + Y ) ;
  }
  ans = Math . round ( ans ) ;
  return ans ;
}
