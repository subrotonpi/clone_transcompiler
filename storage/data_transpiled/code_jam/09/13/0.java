@ Sys public static double [ ] [ ] readInput ( ) {
  COMB = new double [ 45 ] [ ] ;
  COMB [ 0 ] = new double [ ] {
    1 }
    ;
    for ( int i = 1 ;
    i <= 45 ;
    i ++ ) {
      double [ ] row = new double [ i ] ;
      row [ 0 ] = 1 ;
      for ( int j = 1 ;
      j < i ;
      j ++ ) {
        row [ j ] = COMB [ i - 1 ] [ j - 1 ] + COMB [ i - 1 ] [ j ] ;
      }
      row [ 1 ] = 1 ;
      COMB [ i ] = row ;
    }
    {
      int n = Integer . parseInt ( readLine ( ) ) ;
      int k = Integer . parseInt ( readLine ( ) ) ;
      if ( k >= 0 && k <= n ) {
        return COMB [ n ] [ k ] ;
      }
      else {
        return 0 ;
      }
    }
    int T = Integer . parseInt ( readLine ( ) ) ;
    for ( int t = 1 ;
    t <= T ;
    t ++ ) {
      int C = Integer . parseInt ( readLine ( ) ) ;
      int N = Integer . parseInt ( readLine ( ) ) ;
      if ( N >= C ) {
        System . out . println ( "Case #" + t + ": 1" ) ;
        continue ;
      }
      double [ ] E = new double [ C + 1 ] ;
      double total = 1. * COMB [ C ] [ N ] ;
      for ( int c = 1 ;
      c <= C ;
      c ++ ) {
        double change = 0. ;
        double ec = 0. ;
        for ( int good = 1 ;
        good <= c ;
        good ++ ) {
          double prob = ( 1. * get ( c , good ) * get ( C - c , N - good ) ) / total ;
          change += prob ;
          ec += prob * E [ c - good ] ;
        }
        E [ c ] = ( 1 + ec ) / change ;
      }
      System . out . println ( "Case #" + t + ": " + E [ C ] ) ;
    }
    return E ;
  }
  