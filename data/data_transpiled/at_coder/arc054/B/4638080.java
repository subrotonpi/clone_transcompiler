@ Nullable public static double nextDouble ( ) {
  double p = input . nextDouble ( ) ;
  double t = - 1.5 * ( Math . log ( 1.5 / ( p * Math . log ( 2 ) ) ) ) / Math . log ( 2 ) ;
  if ( t > 0 ) {
    System . out . println ( t + p / ( 2 * ( t / 1.5 ) ) ) ;
  }
  else {
    System . out . println ( p ) ;
  }
  return t ;
}
