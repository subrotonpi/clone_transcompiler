@ VisibleForTesting static void from ( LinkedHashMap < String , Double > input ) {
  final double INF = Double . MAX_VALUE ;
  final int mod = 10 * 9 + 7 ;
  {
    final int N = input . size ( ) ;
    final int X = input . get ( ) ;
    final int [ ] xx = input . get ( ) . split ( " " ) ;
    final int [ ] sum_xx = new int [ N ] ;
    sum_xx [ 0 ] = 0 ;
    double tmp = 0 ;
    for ( int x : xx ) {
      tmp += x ;
      sum_xx [ r ] = tmp ;
    }
    double ans = INF ;
    for ( int k = 1 ;
    k <= N ;
    k ++ ) {
      tmp = X * ( k + N ) ;
      int i = 0 ;
      int l = N - k ;
      int r = N ;
      do {
        int cost ;
        if ( i <= 1 ) cost = 5 ;
        else cost = 3 + i * 2 ;
        if ( l >= 0 ) tmp += ( sum_xx [ r ] - sum_xx [ l ] ) * cost ;
        else {
          tmp += ( sum_xx [ r ] - sum_xx [ 0 ] ) * cost ;
          break ;
        }
        l -= k ;
        r -= k ;
        i ++ ;
      }
      while ( true ) ;
      ans = Math . min ( ans , tmp ) ;
    }
  }
  System . out . println ( ans ) ;
}
