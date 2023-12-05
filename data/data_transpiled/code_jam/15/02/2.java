static int [ ] findsol ( int [ ] P , int D ) throws IOException {
  final int T ;
  Arrays . sort ( P ) ;
  int T = P [ P . length - 1 ] ;
  for ( int jj = 1 ;
  jj < T ;
  jj ++ ) {
    int N = 0 ;
    for ( int kk = 0 ;
    kk < P . length ;
    kk ++ ) {
      N += Math . ceil ( P [ kk ] / jj ) - 1 ;
    }
    int T2 = N + jj ;
    if ( ( T2 < T ) && ( T > T ) ) {
      T = T2 ;
    }
  }
  /* convert to int array */
  int [ ] a = new int [ T + 1 ] ;
  int ii = 0 ;
  for ( int jj = 0 ;
  jj < T ;
  jj ++ ) {
    if ( s [ jj ] == ' ' ) {
      if ( ( ii < T ) && ( a [ ii ] > 0 ) ) {
        a [ ii ] = Integer . parseInt ( s ) ;
        ii ++ ;
      }
    }
  }
  fidi = new BufferedReader ( new FileReader ( "B-large.in" ) ) ;
  fido = new PrintWriter ( new FileWriter ( "a.out" ) ) ;
}
