@ VisibleForTesting static long start ( ) throws IOException {
  long start = System . nanoTime ( ) ;
  InputStream inputf = new FileInputStream ( "D-small-attempt1.in" ) ;
  OutputStream outputf = new FileOutputStream ( "D-small1.out" ) ;
  BufferedReader reader = new BufferedReader ( new InputStreamReader ( inputf ) ) ;
  int N = Integer . parseInt ( reader . readLine ( ) ) ;
  int marker = 1 ;
  /* binom */
  int n , k , mod ;
  if ( k == 0 ) return 1 ;
  else if ( n == 0 || k > n ) return 0 ;
  int numer = 1 , denom = 1 ;
  k = Math . min ( k , n - k ) ;
  for ( int i = 1 ;
  i <= k ;
  i ++ ) {
    numer *= ( n - k + i ) ;
    denom *= i ;
  }
  int res = numer / denom ;
  return res % mod ;
  /* rightDown */
  if ( ( 2 * x - y ) % 3 != 0 || ( 2 * y - x ) % 3 != 0 ) return - 1 ;
  /* process */
  int [ ] [ ] table = new int [ W ] [ H ] ;
  table [ 0 ] [ 0 ] = 1 ;
  for ( int r = 0 ;
  r < H ;
  r ++ ) {
    for ( int c = 0 ;
    c < W ;
    c ++ ) {
      if ( rocks [ r + 1 ] [ c + 1 ] >= 0 ) table [ r ] [ c ] = 0 ;
      else if ( r > 2 * c || c > 2 * r ) table [ r ] [ c ] = 0 ;
      else {
        int [ ] u = new int [ ] {
          r - 1 , c - 2 }
          ;
          int [ ] l = new int [ ] {
            r - 2 , c - 1 }
            ;
            if ( u [ 0 ] >= 0 && u [ 1 ] >= 0 ) table [ r ] [ c ] += table [ u [ 0 ] ] [ u [ 1 ] ] ;
            if ( l [ 0 ] >= 0 && l [ 1 ] >= 0 ) table [ r ] [ c ] += table [ l [ 0 ] ] [ l [ 1 ] ] ;
          }
        }
      }
      /* print */
      System . out . println ( "Total time: " + ( System . nanoTime ( ) - start ) ) ;
      for ( int testCase : xrange ( 1 , N + 1 ) ) {
        Arrays . sort ( testCase )