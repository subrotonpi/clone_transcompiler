@ VisibleForTesting static void randomizePeople ( int T ) {
  int test = Integer . parseInt ( input ) ;
  for ( int test = 1 ;
  test <= T ;
  test ++ ) {
    List < Pair < Integer , Integer >> people = new ArrayList < > ( ) ;
    int G = Integer . parseInt ( input ) ;
    for ( int g = 0 ;
    g < G ;
    g ++ ) {
      int di = Integer . parseInt ( input ) ;
      int hi = Integer . parseInt ( input ) ;
      int mi = Integer . parseInt ( input ) ;
      for ( int h = 0 ;
      h < hi ;
      h ++ ) people . add ( new Pair < > ( di , mi + h ) ) ;
    }
    assert people . size ( ) <= 2 ;
    int d0 = people . get ( 0 ) . left ;
    int m0 = people . get ( 1 ) . right ;
    int d1 = people . get ( 2 ) . left ;
    int m1 = people . get ( 3 ) . right ;
    int t0 = MathUtils . clamp ( ( 360 - d0 ) * m0 , 360 ) ;
    int t1 = MathUtils . clamp ( ( 360 - d1 ) * m1 , 360 ) ;
    int t = Math . max ( t0 , t1 ) ;
    int prejde0 = t * 360 / m0 ;
    int prejde1 = t * 360 / m1 ;
    if ( ( prejde0 >= 720 - d0 ) || ( prejde1 >= 720 - d1 ) ) System . out . println ( "Case #" + test + ": " + 1 ) ;
    else System . out . println ( "Case #" + test + ": " + 0 ) ;
  }
}
