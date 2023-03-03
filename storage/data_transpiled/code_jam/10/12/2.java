static final int [ ] [ ] range ( int i , int j ) {
  int T = Integer . parseInt ( System . in ) ;
  int INF = 999999999 ;
  {
    int [ ] nums = new int [ 256 ] ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      int D = Integer . parseInt ( System . in ) ;
      int I = Integer . parseInt ( System . in ) ;
      int M = Integer . parseInt ( System . in ) ;
      int N = Integer . parseInt ( System . in ) ;
      nums [ i ] = Integer . parseInt ( System . in ) ;
      if ( N == 1 ) {
        System . out . println ( "Case #" + ( _t + 1 ) + ": 0" ) ;
        continue ;
      }
      int [ ] ninsert = new int [ N + 1 ] ;
      int _m = 0 ;
      if ( M == 0 ) {
        ninsert [ 0 ] = INF ;
      }
      else {
        while ( ninsert . length < 256 ) {
          for ( int j = 0 ;
          j < M ;
          j ++ ) {
            ninsert [ j ] = _m ;
          }
          _m ++ ;
        }
      }
      int [ ] [ ] cheapest = new int [ N + 1 ] [ 256 ] ;
      for ( int j = 0 ;
      j < N ;
      j ++ ) {
        cheapest [ j ] = new int [ 256 ] ;
        cheapest [ j + 1 ] [ j ] = INF ;
      }
      for ( int j = 0 ;
      j < N ;
      j ++ ) {
        int n = nums [ j ] ;
        int [ ] cn = cheapest [ j + 1 ] ;
        int [ ] c = cheapest [ j ] ;
        for ( int j = 0 ;
        j < N ;
        j ++ ) {
          cn [ j ] = INF ;
        }
        int themin = 256 ;
        int themax = - 1 ;
        themin = Math . min ( nums [ j ] , themin ) ;
        themax = Math . max ( nums [ j ] , themax ) ;
        if ( i > 0 ) {
          themin = Math . min ( nums [ i - 1 ] , themin ) ;
          themax = Math . max ( nums [ i - 1 ] , themax ) ;
        }
        if ( i < N - 1 ) {
          themin = Math . min ( nums [ i + 1 ] , themin ) ;
          themax = Math . max ( nums [ i + 1 ] , themax ) ;
        }
        for ( int j = 0 ;
        