public static double bAnt ( int X , int Y , int N , int [ ] [ ] Pos ) {
  final double [ ] posInitial = new double [ ] {
    X , Y }
    ;
    double ans = Double . MIN_VALUE ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      final double [ ] v1 = new double [ ] {
        Pos [ i ] }
        ;
        final double [ ] v2 = new double [ ] {
          Pos [ ( i + 1 ) % N ] }
          ;
          final double [ ] vecEdge = v2 . clone ( ) ;
          final double [ ] vecInit = posInitial . clone ( ) ;
          final double vecEdgeNorm = vecEdge [ 0 ] ;
          final double vecInitNorm = vecInit [ 1 ] ;
          final double theta = Math . acos ( Math . dot ( vecEdge , vecInit ) / ( vecEdgeNorm * vecInitNorm ) ) ;
          ans = Math . min ( ans , vecInitNorm * Math . sin ( theta ) ) ;
        }
        ans = Math . round ( ans ) ;
        return ans ;
      }
      