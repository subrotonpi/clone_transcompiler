static final double [ ] [ ] solve ( ) {
  final int T = Integer . parseInt ( readLine ( ) ) ;
  for ( int tt : xrange ( 1 , T + 1 ) ) {
    int n = Integer . parseInt ( readLine ( ) ) ;
    int [ ] [ ] a = new int [ n ] [ n ] ;
    for ( int i : xrange ( 0 , n ) ) {
      a [ i ] = new int [ n ] ;
      for ( int j = 0 ;
      j < n ;
      j ++ ) {
        a [ i ] [ j ] = readLine ( ) . equals ( "." ) ? - 1 : Integer . parseInt ( readLine ( ) ) ;
        a [ i ] [ j ] = - 1 ;
      }
    }
    final double [ ] wp = new double [ n ] ;
    final double [ ] [ ] wp2 = new double [ n ] [ n ] ;
    final double [ ] owp = new double [ n ] ;
    final double [ ] oowp = new double [ n ] ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      wp2 [ i ] = new double [ n ] ;
      int total = 0 ;
      int won = 0 ;
      for ( int j = 0 ;
      j < n ;
      j ++ ) {
        if ( a [ i ] [ j ] != - 1 ) {
          total ++ ;
          if ( a [ i ] [ j ] != - 1 ) won ++ ;
        }
      }
      if ( total > 0 ) wp [ i ] = won / ( 1.0 * total ) ;
      for ( int k = 0 ;
      k < n ;
      k ++ ) {
        total = 0 ;
        won = 0 ;
        for ( int j = 0 ;
        j < n ;
        j ++ ) {
          if ( j != k && a [ i ] [ j ] != - 1 ) {
            total ++ ;
            if ( a [ i ] [ j ] != - 1 ) won ++ ;
          }
        }
        if ( total > 0 ) wp2 [ i ] [ k ] = won / ( 1.0 * total ) ;
      }
    }
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      total = 0 ;
      for ( int j = 0 ;
      j < n ;
      j ++ ) {
        if ( a [ i ] [ j ] != - 1 ) {
          total ++ ;
          owp [ i ] += wp2 [ j ] [ i ] ;
        }
      }
      if ( total > 0 ) owp [ i ] /= total ;
    }
    for ( int i = 0 ;
    i < n ;
    i ++