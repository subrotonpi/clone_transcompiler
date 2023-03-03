private static void CrazyRows ( ) {
  int N = Integer . parseInt ( readLine ( ) ) ;
  int [ ] m = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    m [ i ] = readLine ( ) . lastIndexOf ( "1" ) ;
  }
  int count = 0 ;
  for ( int i = 0 ;
  i <= N ;
  i ++ ) {
    int s = 0 ;
    while ( m [ i + s ] > i ) {
      s ++ ;
    }
    if ( s > 0 ) {
      count += s ;
      m [ i ] = m [ i + s ] + 1 ;
    }
  }
  System . out . println ( count ) ;
  int T = Integer . parseInt ( readLine ( ) ) ;
  for ( int testcase = 0 ;
  testcase < T ;
  testcase ++ ) {
    System . out . println ( "Case #" + ( testcase + 1 ) + ":" ) ;
    CrazyRows ( ) ;
  }
}
