static final String getHeadString ( ) throws IOException {
  if ( __name__ . equals ( "__main__" ) ) {
    BufferedReader br = new BufferedReader ( new InputStreamReader ( System . in ) ) ;
    if ( args . length >= 2 ) {
      String fn = args [ 1 ] ;
      if ( fn != '-' ) {
        br = new BufferedReader ( new FileReader ( fn ) ) ;
      }
    }
    int T = Integer . parseInt ( br . readLine ( ) ) ;
    for ( int _T = Integer . parseInt ( br . readLine ( ) ) ;
    _T < T ;
    _T ++ ) {
      int R = Integer . parseInt ( br . readLine ( ) ) ;
      int C = Integer . parseInt ( br . readLine ( ) ) ;
      Set < Integer > turrets = new HashSet < Integer > ( ) ;
      Set < Integer > soldiers = new HashSet < Integer > ( ) ;
      List < String > themap = new ArrayList < String > ( ) ;
      for ( int i = 0 ;
      i < xrange ( R ) ;
      i ++ ) {
        themap . add ( Integer . parseInt ( br . readLine ( ) ) ) ;
        if ( ! themap . contains ( Integer . parseInt ( p ) ) ) {
          themap . add ( Integer . parseInt ( p ) ) ;
        }
        else if ( themap . contains ( Integer . parseInt ( p ) ) ) {
          themap . add ( Integer . parseInt ( p ) ) ;
        }
      }
      for ( int r = 0 ;
      r < xrange ( R ) ;
      r ++ ) {
        int c = Integer . parseInt ( q . readLine ( ) ) ;
        if ( themap . contains ( Integer . parseInt ( p ) ) ) {
          themap . add ( Integer . parseInt ( p ) ) ;
        }
        else {
          themap . add ( Integer . parseInt ( p ) ) ;
        }
      }
      System . out . println ( "" . join ( l ) ) ;
    }
  }
  else {
    int p = Integer . parseInt ( br . readLine ( ) ) ;
    int h = Integer . parseInt ( br . readLine ( ) ) ;
    int c = Integer . parseInt ( p ) ;
    int h = Integer . parseInt ( p ) ;
    int h = Integer . parseInt ( p ) ;
    int v = Integer . parseInt ( p ) ;
    int h1 = Integer . parseInt ( p ) ;
    int h2 = Integer . parseInt ( p ) ;
    if ( h == 0 || h == 0 ) {
      h = 0 ;
    }
    if ( h == 0 || h == 0 ) {
      h = 1 ;
      