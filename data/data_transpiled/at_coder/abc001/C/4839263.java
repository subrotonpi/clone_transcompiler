public static float myRound ( float x , int d ) {
  final float p = 10 * d ;
  return ( float ) Math . floor ( ( x * p ) + Math . copySign ( 0.5 , x ) ) / p ;
}
