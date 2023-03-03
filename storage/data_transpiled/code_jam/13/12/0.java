static final String getBase ( ) throws IOException {
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
      int E = Integer . parseInt ( br . readLine ( ) ) ;
      int R = Integer . parseInt ( br . readLine ( ) ) ;
      int N = Integer . parseInt ( br . readLine ( ) ) ;
      int [ ] days = Integer . parseInt ( br . readLine ( ) ) ;
      if ( R > E ) {
        R = E ;
      }
      int total = 0 ;
      int first = 0 ;
      int [ ] energyAt = new int [ N ] ;
      for ( int cur = 0 ;
      cur < N ;
      cur ++ ) {
        int amount = ( cur != N - 1 ) ? R : E ;
        while ( amount > 0 ) {
          int bestIdx = - 1 ;
          int best = 0 ;
          for ( int i : xrange ( first , cur + 1 ) ) {
            assert energyAt [ i ] != - 1 ;
            if ( energyAt [ i ] > 0 && days [ i ] > best ) {
              bestIdx = i ;
              best = days [ i ] ;
            }
          }
          assert best > 0 ;
          int used = Math . min ( energyAt [ bestIdx ] , amount ) ;
          assert used > 0 ;
          for ( int i : xrange ( bestIdx , cur + 1 ) ) {
            energyAt [ i ] -= used ;
            if ( energyAt [ i ] == 0 ) {
              first = i + 1 ;
            }
          }
          amount -= used ;
          total += best * used ;
        }
        energyAt [ cur ] = E ;
      }
      System . out . println ( "Case #" + ( _T + 1 ) + ": " + total ) ;
    }
  }
  return null ;
}
