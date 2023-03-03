private static int solve ( int dsize , int [ ] fsizes ) {
  int cnt = 0 ;
  Arrays . sort ( fsizes , Collections . reverseOrder ( ) ) ;
  do {
    int s = 0 , k = 0 ;
    for ( int i = 0 ;
    i < fsizes . length ;
    i ++ ) {
      if ( fsizes [ i ] != - 1 ) {
        s = fsizes [ i ] ;
        k = i ;
        break ;
      }
    }
    if ( s == 0 ) return cnt ;
    if ( k > 100 ) {
      fsizes = Arrays . copyOf ( fsizes , k ) ;
      k = 0 ;
    }
    fsizes [ k ] = - 1 ;
    cnt ++ ;
    int d = 0 ;
    for ( int i = 0 ;
    i < fsizes . length ;
    i ++ ) {
      if ( dsize - s >= fsizes [ i ] && fsizes [ i ] != - 1 ) {
        d = fsizes [ i ] ;
        j = i ;
        break ;
      }
    }
    if ( d != 0 && d != - 1 ) fsizes [ j ] = - 1 ;
    return cnt ;
  }
  final String infname = System . getProperty ( "test.in" ) ;
  try ( BufferedReader inf = new BufferedReader ( new FileReader ( infname ) ) ;
  PrintWriter outf = new PrintWriter ( new FileWriter ( infname . replace ( ".in" , ".out" ) ) ) ) {
    int T = Integer . parseInt ( inf . readLine ( ) ) ;
    for ( int t = 1 ;
    t <= T ;
    t ++ ) {
      int n = Integer . parseInt ( inf . readLine ( ) ) ;
      dsize = dsize ;
      fsizes = Arrays . copyOf ( fsizes , n ) ;
      outf . println ( "Case #" + t + ": " + solve ( dsize , fsizes ) ) ;
    }
  }
  catch ( IOException e ) {
    e . printStackTrace ( ) ;
  }
  return cnt ;
}
