public static int [ ] [ ] read ( ) {
  return map . get ( input . nextLine ( ) ) ;
  final int N = read ( ) ;
  final int K = read ( ) ;
  final int [ ] [ ] dp = new int [ K + 1 ] [ K + 1 ] ;
  for ( int r = N - 1 ;
  r > 0 ;
  r -- ) {
    dp [ r & 1 ] [ 0 ] = dp [ ( r + 1 ) & 1 ] [ 0 ] ;
    for ( int s = 1 ;
    s <= K ;
    s ++ ) {
      dp [ r & 1 ] [ s ] = dp [ ( r + 1 ) & 1 ] [ s ] + max ( 1 / N + dp [ r ] [ K - 1 ] , dp [ r ] [ K ] ) ;
    }
  }
  return dp ;
}
