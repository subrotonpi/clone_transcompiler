@ VisibleForTesting static int solve ( ) {
  final int N = input . nextInt ( ) ;
  final List < Word > words = new ArrayList < > ( ) ;
  final Set < Word > w1s = new HashSet < > ( ) ;
  final Set < Word > w2s = new HashSet < > ( ) ;
  for ( int i : xrange ( N ) ) {
    final Word w1 = input . nextWord ( ) ;
    final Word w2 = input . nextWord ( ) ;
    words . add ( new Word ( w1 , w2 ) ) ;
    w1s . add ( w1 ) ;
    w2s . add ( w2 ) ;
  }
  final int [ ] c = new int [ N ] ;
  final List < List < Integer >> A = new ArrayList < > ( ) ;
  for ( final Word w1 : w1s ) {
    final int [ ] row = new int [ N ] ;
    for ( int i : xrange ( N ) ) {
      if ( w1 . equals ( words . get ( i ) . word ) ) {
        row [ i ] = - 1 ;
      }
    }
    A . add ( row ) ;
  }
  for ( final Word w2 : w2s ) {
    final int [ ] row = new int [ N ] ;
    for ( int i : xrange ( N ) ) {
      if ( w2 . equals ( words . get ( i ) . word ) ) {
        row [ i ] = - 1 ;
      }
    }
    A . add ( row ) ;
  }
  final int [ ] b = new int [ A . size ( ) ] ;
  final Solution res = new Solution ( c , A , b , new Bounds ( 0 , 1 ) , new Options ( ) . setDisp ( false ) . setBland ( false ) . setTolerance ( 1e-12 ) . setmaxiter ( 100000000 ) ) ;
  return N - sum ( res . x ) ;
}
