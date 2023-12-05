@ VisibleForTesting static int getCase ( String line ) {
  final String [ ] lines = line . split ( " " ) ;
  final int T = Integer . parseInt ( lines [ 0 ] ) ;
  done = new HashMap < > ( ) ;
  {
    int ret ;
    {
      if ( P <= L * C ) return 0 ;
      if ( L != 1 ) return testsNeeded ( 1 , ( int ) Math . ceil ( P / L ) , C ) ;
      ret = 0 ;
      while ( P > L * C ) {
        C *= C ;
        ret ++ ;
      }
      return ret ;
    }
  }
  ;
  int idx = 1 ;
  for ( int t = 1 ;
  t <= T ;
  t ++ ) {
    final String [ ] l = lines [ t ] . split ( " " ) ;
    final int [ ] ints = new int [ l . length ] ;
    for ( int x = 0 ;
    x < l . length ;
    x ++ ) {
      ints [ x ] = Integer . parseInt ( l [ x ] ) ;
    }
    final int L = ints [ 0 ] ;
    final int P = ints [ 1 ] ;
    final int C = ints [ 2 ] ;
    done . put ( ints [ 0 ] , P ) ;
    final int answer = testsNeeded ( L , P , C ) ;
    System . out . println ( "Case #" + t + ": " + answer ) ;
  }
  return idx ;
}
