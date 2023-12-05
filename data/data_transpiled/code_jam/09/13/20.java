static final String getWordString ( ) throws IOException {
  BufferedReader in = new BufferedReader ( new InputStreamReader ( System . in ) ) ;
  int [ ] [ ] choose = new int [ 41 ] [ 41 ] ;
  for ( int i = 0 ;
  i < choose . length ;
  i ++ ) {
    for ( int j = 0 ;
    j < choose [ i ] . length ;
    j ++ ) {
      choose [ i ] [ j ] = 1 ;
    }
  }
  /* fchoose */
  for ( int n = 1 ;
  n < choose . length ;
  n ++ ) {
    for ( int k = 1 ;
    k < choose [ n ] . length ;
    k ++ ) {
      choose [ n ] [ k ] = choose [ n - 1 ] [ k - 1 ] + choose [ n - 1 ] [ k ] ;
    }
  }
  /* U */
  int k = choose [ n ] [ 0 ] - s ;
  int r = N ;
  int n = C ;
  /* M */
  int r = N ;
  int n = C ;
  for ( int s = C - 1 ;
  s >= N - 1 ;
  s -- ) {
    int S = Integer . parseInt ( in . readLine ( ) ) ;
    for ( int t = s + 1 ;
    t <= Math . min ( n , s + r ) ;
    t ++ ) {
      m [ s ] = ( 1 + S ) / ( 1 - U ( s , s ) ) ;
    }
  }
  if ( className . equals ( "java.util.Scanner" ) ) {
    /* fchoose */
    int T = Integer . parseInt ( in . readLine ( ) ) ;
    for ( int i = 0 ;
    i < T ;
    i ++ ) {
      C = Integer . parseInt ( in . readLine ( ) ) ;
      N = Integer . parseInt ( in . readLine ( ) ) ;
      m = new int [ C + 1 ] ;
      for ( int j = 0 ;
      j < N ;
      j ++ ) {
        m [ j ] = 0 ;
      }
      /* M */
      System . out . println ( "Case #" + ( i + 1 ) + ": " + ( 1 + m [ N ] ) ) ;
    }
  }
  return null ;
}
