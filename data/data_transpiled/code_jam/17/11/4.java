static final String getExample ( ) throws IOException {
  if ( __name__ == "__main__" ) {
    BufferedReader br = new BufferedReader ( new InputStreamReader ( System . in ) ) ;
    if ( args . length >= 2 ) {
      String fn = args [ 1 ] ;
      if ( fn != null ) {
        br = new BufferedReader ( new FileReader ( fn ) ) ;
      }
    }
    int T = Integer . parseInt ( br . readLine ( ) ) ;
    for ( int _T = xrange ( T ) ;
    _T < T ;
    _T ++ ) {
      int R = Integer . parseInt ( br . readLine ( ) ) ;
      int C = Integer . parseInt ( br . readLine ( ) ) ;
      List < List < String >> grid = new ArrayList < List < String >> ( ) ;
      for ( int i = xrange ( R ) ;
      i < C ;
      i ++ ) {
        grid . add ( new LinkedList < String > ( ) ) ;
      }
      for ( List < String > l : grid ) {
        for ( int i = xrange ( 1 , C ) ;
        i < l . size ( ) ;
        i ++ ) {
          if ( l . get ( i ) . equals ( "?" ) && l . get ( i - 1 ) . equals ( "?" ) ) l . set ( i , l . get ( i - 1 ) ) ;
        }
        for ( int i = xrange ( C - 2 , - 1 , - 1 ) ;
        i < l . size ( ) ;
        i ++ ) {
          if ( l . get ( i ) . equals ( "?" ) && l . get ( i + 1 ) . equals ( "?" ) ) l . set ( i , l . get ( i + 1 ) ) ;
        }
      }
      for ( int r = xrange ( 1 , R ) ;
      r < C ;
      r ++ ) {
        for ( int c = xrange ( C ) ;
        c < l . size ( ) ;
        c ++ ) {
          if ( grid . get ( r ) . get ( c ) . equals ( "?" ) && grid . get ( r - 1 ) . get ( c ) . equals ( "?" ) ) grid . get ( r , c ) ;
        }
      }
      for ( int r = xrange ( R ) ;
      r < C ;
      r ++ ) {
        for ( int c = xrange ( C ) ;
        c < l . size ( ) ;
        c ++ ) assert grid . get ( r ) . get ( c ) != "?" ;
      }
      System . out . println (