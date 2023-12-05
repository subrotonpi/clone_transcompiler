static final class StreamReader2 implements StreamReader2 {
  int t = ( int ) ( Runtime . getRuntime ( ) . availableProcessors ( ) ) ;
  StreamReader2 . Reader sr = new StreamReader2 . Reader ( new StringReader ( s ) ) ;
  for ( int tc = 0 ;
  tc < xrange ( sr . nextInt ( ) ) ;
  tc ++ ) {
    int n = sr . nextInt ( ) ;
    int l = sr . nextInt ( ) ;
    int h = sr . nextInt ( ) ;
    int [ ] fr = new int [ n ] ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) fr [ i ] = sr . nextInt ( ) ;
    String answer = "NO" ;
    for ( int x = xrange ( l , h + 1 ) ;
    x < h ;
    x ++ ) {
      boolean ok = true ;
      for ( int f = 0 ;
      f < fr . length ;
      f ++ ) {
        if ( fr [ f ] % x != 0 && fr [ x ] % f != 0 ) {
          ok = false ;
          break ;
        }
      }
      if ( ok ) {
        answer = fr [ x ] ;
        break ;
      }
    }
    System . out . println ( "Case #" + ( tc + 1 ) + ":" + answer ) ;
  }
  return new StreamReader2 ( sr ) ;
}
