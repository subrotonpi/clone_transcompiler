static void worstRecord ( int p , int n ) throws IOException {
  final int better = 0 ;
  final String [ ] record = new String [ n ] ;
  for ( int i : xrange ( n ) ) {
    if ( better >= p - 1 ) record [ better ++ ] = "W" ;
  }
  if ( className . equals ( "org.apache.commons.codec.binary" ) ) {
    BufferedReader br = new BufferedReader ( new InputStreamReader ( System . in ) ) ;
    if ( args . length >= 2 ) {
      String fn = args [ 1 ] ;
      if ( fn != null ) br . readLine ( ) ;
    }
    int T = Integer . parseInt ( br . readLine ( ) ) ;
    for ( int _T = xrange ( T ) ;
    _T < T ;
    _T ++ ) {
      int N = Integer . parseInt ( br . readLine ( ) ) ;
      int P = Integer . parseInt ( br . readLine ( ) ) ;
      p = 2 * N - 1 ;
      r = 2 * N - 1 ;
      int b = 0 ;
      for ( int i : xrange ( N ) ) {
        if ( r < P ) b = Math . max ( b , p ) ;
        p -= 2 * i ;
        r -= 2 * ( N - i - 1 ) ;
      }
      int g = 0 ;
      p = 0 ;
      r = 0 ;
      if ( P == 2 * N ) g = 2 * N - 1 ;
      for ( int i : xrange ( N ) ) {
        if ( r < P ) g = Math . max ( g , p ) ;
        p += 2 * ( i + 1 ) ;
        r += 2 * ( N - i - 1 ) ;
      }
      System . out . println ( "Case #" + ( _T + 1 ) + ": " + g + " " + b ) ;
    }
  }
}
