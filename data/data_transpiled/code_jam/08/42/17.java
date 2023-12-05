@ VisibleForTesting static String process ( int N , int M , int A ) throws IOException {
  long start = System . nanoTime ( ) ;
  InputStream inputf = new FileInputStream ( "B-large.in" ) ;
  OutputStream outputf = new FileOutputStream ( "B-large.out" ) ;
  BufferedReader reader = new BufferedReader ( new InputStreamReader ( inputf ) ) ;
  int N = Integer . parseInt ( reader . readLine ( ) ) ;
  /* length */
  double [ ] A = new double [ N ] ;
  int [ ] B = new int [ N ] ;
  /* area */
  int a = length ( B , C ) ;
  int b = length ( A , C ) ;
  int c = length ( A , B ) ;
  int s = ( a + b + c ) / 2 ;
  /* reduce max */
  if ( N >= M ) return ( N - 1 ) ;
  else return ( N ) ;
  /* inc min */
  if ( N <= M ) {
    if ( N + 1 <= M ) return ( N + 1 ) ;
    else if ( M + 1 <= M ) return ( N + 1 ) ;
    else if ( M + 1 <= M ) return ( N + 1 ) ;
    else if ( M + 1 <= M ) return ( N + 1 ) ;
    else System . out . println ( "ERROR!!!!!!!!!!!!!!!!!!!!!!" ) ;
  }
  /* process */
  if ( A > N * M ) return "IMPOSSIBLE" ;
  int maxN = N , maxM = M ;
  while ( A <= N * M ) {
    ( N ++ ) = reduceMax ( N , M ) ;
  }
  while ( A > N * M ) {
    ( N ++ ) = incMin ( N , M , maxN , maxM ) ;
  }
  for ( int x : xrange ( N + 1 ) ) {
    for ( int y : xrange ( M + 1 ) ) {
      if ( A == N * M - x * y ) return "0 0 " + x + " " + y + " " + M ;
    }
  }
  return "IMPOSSIBLE" ;
}
