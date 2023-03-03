static final String getTestName ( ) throws IOException {
  if ( __name__ == null ) {
    BufferedReader br = new BufferedReader ( new InputStreamReader ( System . in ) ) ;
    if ( args . length >= 2 ) {
      String fn = args [ 1 ] ;
      if ( fn != null ) {
        br = new BufferedReader ( new FileReader ( fn ) ) ;
      }
    }
    int T = Integer . parseInt ( br . readLine ( ) ) ;
    for ( int _T = xrange ( T ) ;
    _T > 0 ;
    _T -- ) {
      char C = br . readLine ( ) ;
      char J = br . readLine ( ) ;
      int c , j ;
      assert c != '?' ;
      if ( larger == 'e' ) {
        char [ ] totry = new char [ ] {
          ( char ) ( fc ) , ( char ) ( fc + 1 ) , 'j' }
          ;
          if ( fc != '0' ) {
            totry [ 0 ] = ( char ) ( fc - 1 ) , ( char ) ( fc + 1 ) , 'c' }
            ;
            return tryall ( c , j , totry ) ;
          }
          if ( larger == 'c' ) {
            char [ ] totry = new char [ ] {
              ( char ) ( fc + 1 ) , ( char ) ( fc + 1 ) , ( char ) ( fc - 1 ) }
              ;
              int c , j ;
              int bestC , bestJ ;
              bestC = run ( C , J , 'e' ) ;
              System . out . println ( "Case #%d: %s %s" , ( T + 1 ) , bestC , bestJ ) ;
            }
            if ( bestC == 'c' ) {
              int [ ] results = new int [ 3 ] ;
              for ( int i = 0 ;
              i < results . length ;
              i ++ ) {
                int nc = totry [ i ] ;
                int nj = totry [ i ] ;
                int ne = totry [ i ] ;
                bc = run ( c , j , 1 , ne ) ;
                results [ i ] = ( nc + bc , nj + bj ) ;
              }
              return Collections . min ( results , bestC ) ;
            }
          }
        }
        return null ;
      }
      