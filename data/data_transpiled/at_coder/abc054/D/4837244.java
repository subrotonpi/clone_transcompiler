public static int mixingExperiment ( @ Nonnegative int N , int Ma , int Mb , List < Integer > drags ) {
  final double INF = Double . POSITIVE_INFINITY ;
  final int maxA = Math . min ( 100 , N * Math . max ( a , maxA ) ) ;
  final int maxB = Math . min ( 100 , N * Math . max ( b , maxB ) ) ;
  final int [ ] [ ] dp = new int [ maxB + 1 ] [ maxA ] ;
  for ( int a = 0 ;
  a < dp . length ;
  a ++ ) {
    dp [ a ] [ b ] = INF ;
  }
  dp [ 0 ] [ 0 ] = 0 ;
  final Iterator < Integer > it = drags . iterator ( ) ;
  for ( int a = maxA - a ;
  a >= 0 ;
  a -- ) {
    for ( int cb = maxB - b ;
    b >= 0 ;
    cb -- ) {
      dp [ ca + a ] [ cb + b ] = Math . min ( dp [ ca + a ] [ cb + b ] , dp [ ca ] [ cb ] + c ) ;
    }
  }
  dp [ a ] [ b ] = Math . min ( dp [ a ] [ b ] , c ) ;
  int ans = INF ;
  for ( int ca = 1 ;
  ca <= maxA ;
  ca ++ ) {
    for ( int cb = 1 ;
    cb <= maxB ;
    cb ++ ) {
      if ( ca * Mb != cb * Ma ) continue ;
      ans = Math . min ( ans , dp [ ca ] [ cb ] ) ;
    }
  }
  return 0 < ans && ans < INF ? ans : - 1 ;
}
