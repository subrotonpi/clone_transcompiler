public static String input ( ) {
  for ( int t = 0 ;
  t < T ;
  t ++ ) {
    int N = Integer . parseInt ( readLine ( ) ) ;
    int M = Integer . parseInt ( readLine ( ) ) ;
    int [ ] [ ] B = new int [ N ] [ N ] ;
    for ( int y = 0 ;
    y < N ;
    y ++ ) {
      B [ y ] = Integer . parseInt ( readLine ( ) ) ;
    }
    boolean [ ] [ ] F = new boolean [ M ] [ N ] ;
    for ( int d = 0 ;
    d < 128 ;
    d ++ ) {
      for ( int y = 0 ;
      y < N ;
      y ++ ) {
        boolean f = true ;
        for ( int x = 0 ;
        x < M ;
        x ++ ) {
          if ( ! F [ y ] [ x ] && B [ y ] [ x ] != d ) {
            f = false ;
          }
        }
        if ( f ) {
          for ( int x = 0 ;
          x < M ;
          x ++ ) {
            F [ y ] [ x ] = true ;
          }
        }
      }
      for ( int x = 0 ;
      x < M ;
      x ++ ) {
        boolean f = true ;
        for ( int y = 0 ;
        y < N ;
        y ++ ) {
          if ( ! F [ y ] [ x ] && B [ y ] [ x ] != d ) {
            f = false ;
          }
        }
        if ( f ) {
          for ( int y = 0 ;
          y < N ;
          y ++ ) {
            F [ y ] [ x ] = true ;
          }
        }
      }
    }
    boolean f = true ;
    for ( int y = 0 ;
    y < N ;
    y ++ ) {
      for ( int x = 0 ;
      x < M ;
      x ++ ) {
        if ( ! F [ y ] [ x ] ) {
          f = false ;
        }
      }
    }
    String ans = f ? "YES" : "NO" ;
    System . out . println ( "Case #" + ( t + 1 ) + ": " + ans ) ;
  }
  return "" ;
}
