static final String solve ( ) throws IOException {
  if ( __name__ == "solve" ) {
    BufferedReader br = new BufferedReader ( new InputStreamReader ( System . in ) ) ;
    if ( args . length >= 2 ) {
      String fn = args [ 1 ] ;
      if ( fn != null ) {
        br = new BufferedReader ( new FileReader ( fn ) ) ;
      }
    }
    int t = Integer . parseInt ( br . readLine ( ) ) ;
    for ( int _t = 0 ;
    _t < t ;
    ++ _t ) {
      int n = Integer . parseInt ( br . readLine ( ) ) ;
      int stages [ ] = new int [ n ] ;
      for ( int i = 0 ;
      i < n ;
      ++ i ) {
        stages [ i ] = Integer . parseInt ( br . readLine ( ) ) ;
      }
      int stars = 0 ;
      int [ ] progress = new int [ n ] ;
      for ( int i = 0 ;
      i < n ;
      ++ i ) {
        progress [ i ] = 0 ;
      }
      int games = 0 ;
      boolean bad = false ;
      while ( stars < 2 * n ) {
        boolean found = false ;
        for ( int j = 0 ;
        j < n ;
        ++ j ) {
          if ( progress [ j ] < 2 && stages [ j ] . intValue ( ) <= stars ) {
            ++ games ;
            stars += 2 - progress [ j ] ;
            progress [ j ] = 2 ;
            found = true ;
            break ;
          }
        }
        if ( found ) continue ;
        int best = - 1 ;
        int bestSize = - 1 ;
        for ( int j = 0 ;
        j < n ;
        ++ j ) {
          if ( progress [ j ] == 0 && stages [ j ] . intValue ( ) <= stars ) {
            if ( stages [ j ] . intValue ( ) > bestSize ) {
              best = j ;
              bestSize = stages [ j ] . intValue ( ) ;
            }
          }
        }
        if ( bestSize == - 1 ) {
          bad = true ;
          break ;
        }
        assert bestSize >= 0 ;
        progress [ best ] = 1 ;
        ++ stars ;
        ++ games ;
      }
      if ( bad ) System . out . println ( "Case #" + ( _t + 1 ) + ": Too Bad" ) ;
      else System . out . println ( "Case #" + ( _t + 1 ) + ": " + games ) ;
    }
  }
  return null ;
}
