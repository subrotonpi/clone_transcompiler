@ input public static int T ( ) {
  /* Pass in the list of integers */
  int N = input . nextInt ( ) ;
  /* Pass in the list of integers */
  int [ ] [ ] adj = new int [ N ] [ N ] ;
  for ( int q = 0 ;
  q < N ;
  q ++ ) {
    adj [ q ] [ 0 ] = input . nextInt ( ) ;
  }
  /* Pass in the list of integers */
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    if ( adj [ nw ] [ i ] . equals ( "1" ) ) {
      return i ;
    }
  }
  /* Pass in the list of integers */
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    for ( int j = 0 ;
    j < N ;
    j ++ ) {
      if ( ! simul ( adj , w , 1 , m - {
        i }
        ) ) {
          return i ;
        }
      }
    }
    /* Pass in the list of integers */
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      for ( int j = 0 ;
      j < N ;
      j ++ ) {
        if ( adj [ i ] [ j ] . equals ( "1" ) && am [ i ] [ j ] . equals ( "0" ) ) {
          return 0 ;
        }
        if ( adj [ i ] [ j ] . equals ( "0" ) && am [ i ] [ j ] . equals ( "1" ) ) {
          m ++ ;
        }
      }
    }
    /* Pass in the list of integers */
    int mx = 10000 ;
    for ( String al : new String [ ] {
      "01" }
      ) {
        int [ ] [ ] am = new int [ N ] [ N ] ;
        for ( int i = 0 ;
        i < N ;
        i ++ ) {
          for ( int j = 0 ;
          j < N ;
          j ++ ) {
            am [ i ] [ j ] = al . charAt ( i * N + j ) ;
          }
          am [ i ] = StringUtils . leftPad ( am [ i ] , N , ' ' ) ;
        }
        int x = subs ( adj , am ) ;
        if ( x == 0 ) {
          continue ;
        }
        boolean ok = simul ( N , am ) ;
        if ( ok ) {
          mx = Math . min ( x , mx ) ;
        }
      }
      return mx ;
    }
    