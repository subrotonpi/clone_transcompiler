@ VisibleForTesting static int cal ( int N , List < Integer > bridges ) {
  int mod = 10 * 9 + 7 ;
  final Counter < Integer > bridgeCnt = new ClassicCounter < > ( ) ;
  final double [ ] [ ] bwArray = new double [ N + 1 ] [ N + 1 ] ;
  final List < Integer > [ ] conList = new ArrayList [ N + 1 ] ;
  for ( int l = 0 ;
  l < N ;
  l ++ ) {
    int r = bridges . get ( l ) ;
    bridgeCnt . setCount ( r ) ;
    bridgeCnt . setCount ( l ) ;
    conList [ l ] [ r ] = 1 ;
    conList [ r ] [ l ] = 1 ;
  }
  for ( int l = 0 ;
  l < N ;
  l ++ ) {
    int r = bridges . get ( l ) ;
    bridgeCnt . setCount ( r ) ;
    bridgeCnt . setCount ( l ) ;
    conList [ l ] [ r ] = 1 ;
  }
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int root = bridges . get ( i ) . intValue ( ) ;
    /*update root */
    for ( int j = 0 ;
    j < conList [ i ] [ j ] . intValue ( ) ;
    j ++ ) {
      int child = conList [ i ] [ j ] . intValue ( ) ;
      if ( child == parent ) continue ;
      else update ( child , cur ) ;
      bwArray [ i ] [ j ] = ( bwArray [ i ] [ j ] * bwArray [ child ] [ 0 ] ) ;
      bwArray [ i ] [ j ] = ( bwArray [ i ] [ j ] * ( bwArray [ child ] [ 0 ] + bwArray [ child ] [ 1 ] ) ) ;
    }
  }
  update ( root , 0 ) ;
  return Math . max ( Arrays . stream ( bwArray ) . mapToInt ( bw -> bw ) . sum ( ) , mod ) % mod ;
}
