@ Test public static void gcjt ( ) {
  for ( Test t : tests ( ) ) {
    int n = ( int ) t . rl ( ) ;
    int [ ] a = new int [ 6 ] ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      int [ ] aa = new int [ 6 ] ;
      t . ri ( ) ;
      for ( int j = 0 ;
      j < 6 ;
      j ++ ) a [ i ] += aa [ j ] ;
    }
    for ( int i = 0 ;
    i < 6 ;
    i ++ ) a [ i ] /= n ;
    int x = a [ 0 ] ;
    int y = a [ 1 ] ;
    int z = a [ 2 ] ;
    int vx = a [ 3 ] ;
    int vy = a [ 4 ] ;
    int vz = a [ 5 ] ;
    int d = vx * vx + vy * vy + vz * vz ;
    int tt ;
    if ( d == 0 ) tt = 0 ;
    else {
      tt = - ( x * vx + y * vy + z * vz ) / ( vx * vx + vy * vy + vz * vz ) ;
      if ( tt < 0 ) tt = 0 ;
    }
    x = x + vx * tt ;
    y = y + vy * tt ;
    z = z + vz * tt ;
    double s = Math . sqrt ( x * x + y * y + z * z ) ;
    t . answer ( s + "{0:.8f} {1:.8f}" , tt ) ;
  }
}
