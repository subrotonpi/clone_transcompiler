static final String getBest ( ) throws IOException {
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
      int B = Integer . parseInt ( br . readLine ( ) ) ;
      int N = Integer . parseInt ( br . readLine ( ) ) ;
      List < Integer > _bets = CollectionUtils . newArrayList ( ) ;
      assert _bets . size ( ) == N ;
      while ( _bets . size ( ) < 37 ) _bets . add ( 0 ) ;
      Collections . sort ( _bets ) ;
      double best = 0.0 ;
      double totalBet = 0 ;
      for ( int num_min : xrange ( 1 , 37 ) ) {
        List < Integer > _bets = new ArrayList < Integer > ( _bets ) ;
        /* cost */
        double c = 0 ;
        for ( int i : xrange ( num_min ) ) {
          assert _bets . get ( i ) >= _bets . get ( i ) ;
          t += _bets . get ( i ) - _bets . get ( i ) ;
        }
        for ( int i : xrange ( num_min , 37 ) ) {
          if ( _bets . get ( i ) <= _bets . get ( i ) ) {
            t += ( _bets . get ( i ) + 1 ) - _bets . get ( i ) ;
          }
        }
        int low = Collections . max ( _bets , 0 , _bets . size ( ) ) - 1 ;
        int high = 10000000000000 ;
        while ( high > low ) {
          int g = ( high + low + 1 ) / 2 ;
          c = cost ( g ) ;
          if ( c > B ) high = g - 1 ;
          else {
            low = g ;
            double amountBet = g * num_min - sum ( _bets , 0 , _bets . size ( ) ) ;
            best = Math . max ( amountBet * 36.0 / num_min - c , best ) ;
          }
        }
      }
      System . out . println ( "Case #" + ( _T + 1 ) + ": " + best )