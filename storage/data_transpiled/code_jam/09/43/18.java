static void doOne ( int casenum ) throws IOException {
  final int N = Integer . parseInt ( System . console ( ) . readLine ( ) . trim ( ) ) ;
  final int K = Integer . parseInt ( System . console ( ) . readLine ( ) . trim ( ) ) ;
  final boolean [ ] [ ] confl = new boolean [ N ] [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    confl [ i ] [ 0 ] = false ;
  }
  final int [ ] [ ] charts = new int [ N ] [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    if ( li . indexOf ( 'include(' ) != - 1 ) {
      best = N - li . length + 1 ;
    }
  }
  assert best != 99999 ;
  System . out . println ( "Case #" + casenum + ": " + best ) ;
  {
    final int T = Integer . parseInt ( System . console ( ) . readLine ( ) . trim ( ) ) ;
    for ( int j = 1 ;
    j < T ;
    j ++ ) {
      doOne ( i ) ;
    }
  }
  doOne ( ) ;
}
