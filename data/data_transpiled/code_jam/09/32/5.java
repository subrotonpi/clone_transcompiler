public static double sq ( double [ ] p ) {
  return sq ( p ) * .5 ;
  /* Case # */
  int T = Integer . parseInt ( input ( ) ) ;
  for ( int X = 1 ;
  X <= T ;
  X ++ ) {
    int N = Integer . parseInt ( input ( ) ) ;
    double [ ] t0t = {
      0 , 0 , 0 }
      ;
      double [ ] t1t = {
        0 , 0 , 0 }
        ;
        for ( int f = 0 ;
        f < N ;
        f ++ ) {
          int x = Integer . parseInt ( input ( ) ) ;
          int y = Integer . parseInt ( input ( ) ) ;
          int z = Integer . parseInt ( input ( ) ) ;
          int vx = Integer . parseInt ( input ( ) ) ;
          int vy = Integer . parseInt ( input ( ) ) ;
          int vz = Integer . parseInt ( input ( ) ) ;
          t0t [ 0 ] += x ;
          t0t [ 1 ] += y ;
          t0t [ 2 ] += z ;
          t1t [ 0 ] += x + vx ;
          t1t [ 1 ] += y + vy ;
          t1t [ 2 ] += z + vz ;
        }
        double [ ] t0m = new double [ 3 ] ;
        double [ ] t1m = new double [ 3 ] ;
        for ( int i = 0 ;
        i < 3 ;
        i ++ ) {
          t0t [ i ] = Double . parseDouble ( input ( ) ) ;
          t0t [ i ] = Double . parseDouble ( input ( ) ) ;
        }
        double [ ] U = new double [ 3 ] ;
        for ( int i = 0 ;
        i < 3 ;
        i ++ ) {
          U [ i ] = t1m [ i ] - t0m [ i ] ;
        }
        double tmin = 0.0 ;
        double denom = sq ( U ) ;
        if ( denom > 0 ) {
          double num = Math . pow ( - t0m [ i ] , U [ i ] ) ;
          tmin = num / denom ;
        }
        if ( tmin < 0 ) tmin = 0.0 ;
        double [ ] newp = new double [ 3 ] ;
        for ( int i = 0 ;
        i < 3 ;
        i ++ ) newp [ i ] = t0m [ i ] + tmin * U [ i ] ;
        double dmin = dist ( newp ) ;
        System . out . println ( "Case #" + X + ": " + dmin + " " + tmin ) ;
      }
      return 0 ;
    }
    