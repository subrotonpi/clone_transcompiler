static final int lc = 0 ;
String line ;
try {
  BufferedReader in = new BufferedReader ( new InputStreamReader ( System . in ) ) ;
  while ( ( line = in . readLine ( ) ) != null ) {
    String [ ] tok = line . split ( " " ) ;
    if ( tok . length == 1 ) continue ;
    lc ++ ;
    int r = Integer . parseInt ( tok [ 0 ] ) ;
    int t = Integer . parseInt ( tok [ 1 ] ) ;
    int lo = 0 ;
    int hi = t ;
    while ( hi - lo > 1 ) {
      int m = ( lo + hi ) / 2 ;
      if ( 2 * m * r + ( 1 + 4 * m - 3 ) / 2 * m <= t ) lo = m ;
      else hi = m ;
    }
    System . out . println ( "Case #" + lc + ": " + lo ) ;
  }
}
