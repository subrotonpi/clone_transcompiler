static final String getSortingString ( ) throws IOException {
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
      int Hd = Integer . parseInt ( br . readLine ( ) ) ;
      int Ad = Integer . parseInt ( br . readLine ( ) ) ;
      int Hk = Integer . parseInt ( br . readLine ( ) ) ;
      int Ak = Integer . parseInt ( br . readLine ( ) ) ;
      int B = Integer . parseInt ( br . readLine ( ) ) ;
      int D = Integer . parseInt ( br . readLine ( ) ) ;
      if ( 1 != _T ) {
        /* turns */
        int nd = Hd ;
        int ad = Ad ;
        int ak = Ak ;
        int hk = Hk ;
        int n = 0 ;
        for ( int i = xrange ( nd ) ;
        i < nd ;
        i ++ ) {
          if ( hd <= ak - D ) {
            hd = Hd - ak ;
            n ++ ;
          }
          ak = Math . max ( 0 , ak - D ) ;
          hd -= ak ;
          if ( hd <= 0 ) {
            return Double . POSITIVE_INFINITY ;
          }
          n ++ ;
        }
        for ( int i = xrange ( nb ) ;
        i < nd ;
        i ++ ) {
          if ( hd <= ak ) {
            hd = Hd - ak ;
            n ++ ;
          }
          ad += B ;
          hd -= ak ;
          if ( hd <= 0 ) {
            return Double . POSITIVE_INFINITY ;
          }
          n ++ ;
        }
        while ( hk > 0 ) {
          if ( hd <= ak && hk > ad ) {
            hd = Hd - ak ;
            n ++ ;
          }
          hk -= ad ;
          if ( hk > 0 ) {
            hd -= ak ;
            if ( hd <= 0 ) {
              return Double . POSITIVE_INFINITY ;
            }
          }
          n ++ ;
        }
      }
      double best = Double . POSITIVE_INFINITY ;
      for ( int i = 0 ;
      i < 101 ;
      i ++ ) {
        for ( int j = xrange ( 101 ) ;
        j < nd ;
        j ++ ) {
          double r = turns ( i , j ) ;
          best = Math . min ( r , best ) ;
        }
      }
      final String ans ;
      if ( Double . isIn @ @