@ VisibleForTesting static BigFraction from ( String input ) {
  int A = Integer . parseInt ( input ) ;
  int B = Integer . parseInt ( input ) ;
  int C = Integer . parseInt ( input ) ;
  int D = Integer . parseInt ( input ) ;
  int E = Integer . parseInt ( input ) ;
  int F = Integer . parseInt ( input ) ;
  BigFraction ans = new BigFraction ( A * 100 , 0 ) ;
  /* density = 100 * sugar / (water+sugar) */
  int G = gcd ( C , D ) ;
  for ( int a = 0 ;
  a < 31 ;
  a ++ ) {
    for ( int b = 0 ;
    b < 31 ;
    b ++ ) {
      int water = ( a * A + b * B ) * 100 ;
      if ( water > F ) continue ;
      int sugar = ( int ) ( G * ( b + 1 ) * G ) ;
      ans . add ( water , sugar ) ;
    }
  }
  return ans ;
}
