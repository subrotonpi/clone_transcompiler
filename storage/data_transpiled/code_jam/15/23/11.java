static final int [ ] solve ( int [ ] [ ] args ) {
  int tc = Integer . parseInt ( args [ 0 ] [ 0 ] ) ;
  for ( int tmpTC = xrange ( tc ) ;
  tmpTC < tc ;
  tmpTC ++ ) {
    Arrays . fill ( args , ( ) -> {
      int N = Integer . parseInt ( args [ tmpTC ] [ 0 ] ) ;
      int [ ] hikers = new int [ N ] ;
      for ( int _n = xrange ( N ) ;
      _n < N ;
      _n ++ ) {
        Arrays . fill ( args [ N ] [ 0 ] , ( ) -> {
          int D = Integer . parseInt ( args [ N ] [ 0 ] ) ;
          int H = Integer . parseInt ( args [ N ] [ 1 ] ) ;
          int M = Integer . parseInt ( args [ N ] [ 2 ] ) ;
          for ( int h : xrange ( H ) ) {
            hikers [ _n ] = new int [ ] {
              D , M + h }
              ;
            }
          }
          return hikers ;
        }
        return new int [ ] {
          D , M + h }
          ;
        }
        ) ;
      }
      int res = 0 ;
      if ( hikers . length == 2 ) {
        Arrays . fill ( hikers , ( ) -> {
          int d1 = Integer . parseInt ( args [ tmpTC ] [ 0 ] ) ;
          int m1 = Integer . parseInt ( args [ tmpTC ] [ 1 ] ) ;
          int d2 = Integer . parseInt ( args [ tmpTC ] [ 2 ] ) ;
          int m2 = Integer . parseInt ( args [ tmpTC ] [ 3 ] ) ;
          int t1 = m1 * ( 360 - d1 ) ;
          int t2 = m2 * ( 360 - d2 ) ;
          if ( t1 < t2 ) {
            if ( m1 * d1 + t2 >= 720 * m1 ) res = 1 ;
            else res = 0 ;
          }
          else {
            if ( m2 * d2 + t1 >= 720 * m2 ) res = 1 ;
            else res = 0 ;
          }
        }
        ) ;
      }
      System . out . println ( "Case #" + ( tmpTC + 1 ) + ": " + res ) ;
      return new int [ ] {
        res }
        ;
      }
      