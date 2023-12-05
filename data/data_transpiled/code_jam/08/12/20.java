static final void print ( ) throws IOException {
  System . in = new FileInputStream ( "B.in" ) ;
  System . out = new PrintStream ( "B.out" ) ;
  {
    int cnt = 0 ;
    while ( n != 0 ) {
      cnt ++ ;
      n = n & ( n - 1 ) ;
    }
    return cnt ;
  }
  int C = Integer . parseInt ( readLine ( ) ) ;
  for ( int T = xrange ( C ) ;
  T <= N ;
  T ++ ) {
    int N = Integer . parseInt ( readLine ( ) ) ;
    int M = Integer . parseInt ( readLine ( ) ) ;
    int [ ] [ ] likes = new int [ M ] [ M ] ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      likes [ i ] = new int [ M ] ;
      String [ ] temp = readLine ( ) . trim ( ) . split ( " " ) ;
      int num = Integer . parseInt ( temp [ 0 ] ) ;
      for ( int j = 0 ;
      j < num ;
      j ++ ) {
        likes [ i ] [ j ] = new int [ M ] ;
      }
      Arrays . fill ( likes [ i ] , - 1 ) ;
    }
    int [ ] possible = new int [ N ] ;
    for ( int k = xrange ( 2 * N ) ;
    k <= N ;
    k ++ ) {
      int [ ] satis = new int [ M ] ;
      for ( int h = 0 ;
      h <= N ;
      h ++ ) {
        if ( ( k & ( 1 << h ) ) != 0 ) {
          for ( int i = 0 ;
          i <= M ;
          i ++ ) {
            if ( ( likes [ i ] [ h + 1 ] == 1 ) || ( likes [ i ] [ h ] [ i ] == 0 ) ) {
              satis [ i ] = 1 ;
            }
          }
        }
        else {
          for ( int i = 0 ;
          i <= M ;
          i ++ ) {
            if ( ( likes [ i ] [ h + 1 ] == 0 ) || ( likes [ i ] [ h ] [ i ] == 0 ) ) {
              satis [ i ] = 1 ;
            }
          }
        }
      }
      if ( Arrays . fill ( satis , - 1 ) ) possible [ k ] = k ;
    }
    if ( possible . length > 0 ) {
      int res = 0 ;
      int cnt = bit ( possible [ 0 ] ) ;
      for ( int i = xrange ( possible . length ) ;
      i >= N ;
      i -- ) {
        if ( cnt > bit ( possible [ i ] )