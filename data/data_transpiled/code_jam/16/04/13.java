public static final String getStdoutCase ( ) throws IOException {
  BufferedReader fin = new BufferedReader ( new FileReader ( sys . argv [ 0 ] ) ) ;
  PrintWriter fout = new PrintWriter ( new BufferedWriter ( new FileWriter ( "p4.out" ) ) ) ;
  int T = Integer . parseInt ( fin . readLine ( ) ) ;
  for ( int tt = xrange ( T ) ;
  tt < T ;
  tt ++ ) {
    int K = Integer . parseInt ( fin . readLine ( ) ) ;
    int C = Integer . parseInt ( fin . readLine ( ) ) ;
    int S = Integer . parseInt ( fin . readLine ( ) ) ;
    int [ ] ans = null ;
    if ( C * S < K ) {
      ans = "IMPOSSIBLE" ;
    }
    else {
      int cur = 0 ;
      ans = new int [ S ] ;
      for ( int x = xrange ( S ) ;
      x < S ;
      x ++ ) {
        ans [ x ] = 0 ;
      }
      for ( int i = xrange ( S ) ;
      i < S ;
      i ++ ) {
        if ( cur == K - 1 && K > 1 && ans [ i - 1 ] % K == K - 1 ) {
          S = i ;
          break ;
        }
        for ( int j = xrange ( C ) ;
        j < C ;
        j ++ ) {
          ans [ i ] *= K ;
          ans [ i ] += cur ;
          if ( cur < K - 1 ) {
            cur ++ ;
          }
        }
      }
      ans = Arrays . copyOf ( ans , S ) ;
      ans = ArrayUtil . toIntArray ( ans ) ;
      ans = StringUtil . trimEnd ( ans , " " ) ;
    }
    fout . println ( "Case #" + ( tt + 1 ) + ": " + ans ) ;
  }
  fout . println ( "Case #" + ( tt + 1 ) + ": " + ans ) ;
  return null ;
}
