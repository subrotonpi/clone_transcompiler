@ VisibleForTesting static void inpl ( ) {
  final double INF = Double . MAX_VALUE ;
  final double mod = 10 * 9 + 7 ;
  final double eps = 10 * - 7 ;
  {
    final int inpl = Integer . parseInt ( input . readLine ( ) ) ;
  }
  {
    final int inplS = Integer . parseInt ( input . readLine ( ) ) ;
    final int H = inpl >>> 1 ;
    final int W = inpl >>> 1 ;
    final int K = inpl >>> 1 ;
    final List < List < String >> MAP = new ArrayList < > ( ) ;
    for ( int i = 0 ;
    i < H ;
    i ++ ) {
      MAP . add ( Collections . singletonList ( input . readLine ( ) ) ) ;
    }
    final int [ ] [ ] MAP2 = new int [ W + 2 * K + 1 ] [ ] ;
    for ( int i = 0 ;
    i < MAP2 . length ;
    i ++ ) {
      MAP2 [ i ] = new int [ W ] ;
    }
    for ( int i = 0 ;
    i < MAP2 [ 0 ] . length ;
    i ++ ) {
      MAP2 [ 0 ] [ i ] = 0 ;
    }
  }
  {
    int i ;
  }
}
