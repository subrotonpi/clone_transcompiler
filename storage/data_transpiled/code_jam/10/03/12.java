@ VisibleForTesting static void readSequential ( ) throws IOException {
  final BufferedReader in = new BufferedReader ( new InputStreamReader ( System . in ) ) ;
  final int T = Integer . parseInt ( in . readLine ( ) ) ;
  for ( int cas : xrange ( 1 , T + 1 ) ) {
    final int R = ( Integer . parseInt ( in . readLine ( ) ) ) ;
    final int K = ( Integer . parseInt ( in . readLine ( ) ) ) ;
    final int N = ( Integer . parseInt ( in . readLine ( ) ) ) ;
    System . out . println ( "Case #" + cas + ":" ) ;
    final Queue < Integer > ts = new ArrayDeque < > ( Integer . parseInt ( in . readLine ( ) ) ) ;
    final List < Integer > tmp = new ArrayList < > ( ) ;
    int r = 0 ;
    final int [ ] runs = new int [ N ] ;
    final int [ ] eurs = new int [ N ] ;
    int cur = 0 ;
    runs [ 0 ] = 0 ;
    boolean cycled = false ;
    int tot = 0 ;
    while ( r < R ) {
      ++ r ;
      tmp . clear ( ) ;
      int tt = 0 ;
      while ( ts . size ( ) > 0 && tt < K ) {
        final int t = ts . poll ( ) ;
        if ( tt + t > K ) {
          ts . add ( t ) ;
          break ;
        }
        tt += t ;
        tmp . add ( t ) ;
      }
      tot += tt ;
      cur = ( cur + tmp . size ( ) ) % N ;
      if ( ! cycled && runs [ cur ] != 0 ) {
        final int cRuns = r - runs [ cur ] ;
        final int cEurs = tot - eurs [ cur ] ;
        final int cNum = ( R - r ) / cRuns ;
        tot += cEurs * cNum ;
        r += cNum * cRuns ;
        cycled = true ;
      }
      runs [ cur ] = r ;
      eurs [ cur ] = tot ;
      ts . addAll ( tmp ) ;
    }
  }
  System . out . println ( tot ) ;
}
