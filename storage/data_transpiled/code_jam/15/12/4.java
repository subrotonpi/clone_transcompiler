static int readInteger ( ) throws IOException {
  return Integer . parseInt ( readLine ( ) ) ;
  /* read from input stream */
  int B = readInt ( ) ;
  int N = readInt ( ) ;
  int M = readInt ( ) ;
  if ( N <= B ) return N ;
  int a = 0 , b = Math . max ( M , N ) ;
  while ( a + 1 < b ) {
    int m = ( a + b ) / 2 ;
    int s = 0 ;
    for ( int t = 0 ;
    t < M ;
    t ++ ) s += m / M [ t ] + 1 ;
    if ( s < N ) a = m ;
    else b = m ;
  }
  int sa = 0 , sb = 0 ;
  for ( int t = 0 ;
  t < M ;
  t ++ ) {
    sa += a / M [ t ] + 1 ;
    sb += b / M [ t ] + 1 ;
  }
  for ( int i = 0 ;
  i < B ;
  i ++ ) {
    if ( b % M [ i ] == 0 ) {
      sa ++ ;
      if ( sa == N ) return ( i + 1 ) ;
    }
  }
  int T = readInt ( ) ;
  for ( int t = 0 ;
  t < T ;
  t ++ ) {
    System . out . println ( "Case #" + ( t + 1 ) + ": " + solve ( ) ) ;
  }
  return T ;
}
