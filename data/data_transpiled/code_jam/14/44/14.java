static final String [ ] getStrings ( ) throws IOException {
  final long P = 1000000007 ;
  if ( __name__ . equals ( "__main__" ) ) {
    BufferedReader br = new BufferedReader ( new InputStreamReader ( System . in ) ) ;
    if ( args . length >= 2 ) {
      String fn = args [ 1 ] ;
      if ( fn != null ) {
        br = new BufferedReader ( new FileReader ( fn ) ) ;
      }
    }
    final int T = Integer . parseInt ( br . readLine ( ) ) ;
    for ( int _T = xrange ( T ) ;
    _T < T ;
    _T ++ ) {
      final int M = Integer . parseInt ( br . readLine ( ) ) ;
      final int N = Integer . parseInt ( br . readLine ( ) ) ;
      final String [ ] strings = new String [ M ] ;
      for ( int i = 0 ;
      i < M ;
      i ++ ) {
        strings [ i ] = br . readLine ( ) . trim ( ) ;
      }
      int worst = 0 ;
      int nworst = 0 ;
      for ( int k = xrange ( N * M ) ;
      k > 0 ;
      k = xrange ( N ) ) {
        final List < List < String >> servers = new ArrayList < > ( ) ;
        for ( int i = 0 ;
        i < N ;
        i ++ ) {
          servers . add ( new ArrayList < > ( ) ) ;
        }
        for ( int i = 0 ;
        i < M ;
        i ++ ) {
          servers . get ( k % N ) . add ( strings [ i ] ) ;
          k /= N ;
        }
        if ( CollectionUtils . isEmpty ( servers ) ) {
          continue ;
        }
        int total = 0 ;
        for ( final List < String > strset : servers ) {
          final Set < String > prefixes = new HashSet < > ( ) ;
          prefixes . add ( "" ) ;
          for ( final String s : strset ) {
            for ( int i = xrange ( s . length ( ) ) ;
            i < N ;
            i ++ ) {
              prefixes . add ( s . substring ( 0 , i + 1 ) ) ;
            }
          }
          total += prefixes . size ( ) ;
        }
        if ( total > worst ) {
          worst = total ;
          nworst = 0 ;
        }
        if ( total == worst ) {
          nworst ++ ;
        }
      }
      System . out . println ( "Case #" + ( _T + 1 ) + ": " + worst + " " + ( nworst % P ) ) ;
    }
  }
  return null ;
}
