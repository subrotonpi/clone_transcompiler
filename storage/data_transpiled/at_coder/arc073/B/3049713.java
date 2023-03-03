public static int [ ] [ ] solve ( int N , int W ) {
  int [ ] [ ] WV = new int [ N ] [ W ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    WV [ i ] = new int [ N ] ;
    for ( int j = 0 ;
    j < W ;
    j ++ ) WV [ i ] [ j ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  /* if (N == 0) {
  return 0;
  }*/
  @ SuppressWarnings ( "unchecked" ) LinkedHashMap < Integer , Integer > cs = new LinkedHashMap < Integer , Integer > ( ) ;
  for ( int w : WV ) {
    cs . put ( w , w ) ;
  }
  int minw = Collections . min ( cs . keySet ( ) ) ;
  for ( int k = minw ;
  k < minw + 4 ;
  k ++ ) {
    cs . put ( k , new int [ ] {
      0 }
      ) ;
    }
    ts = new TreeMap < Integer , Integer > ( ) ;
    int result = solve ( N , W , WV ) ;
    result = 0 ;
    for ( int w1 = 0 ;
    w1 < cs . get ( minw ) ;
    w1 ++ ) {
      int t1 = ts . get ( w1 ) ;
      for ( int w2 = 0 ;
      w2 < cs . get ( minw + 1 ) ;
      w2 ++ ) {
        int t2 = ts . get ( w2 ) ;
        int tw2 = w1 * minw + w2 * ( minw + 1 ) ;
        int tv2 = t1 + t2 ;
        if ( tw2 > W ) break ;
        for ( int w3 = 0 ;
        w3 < cs . get ( minw + 2 ) ;
        w3 ++ ) {
          int tw3 = tw2 + w3 * ( minw + 2 ) ;
          int tv3 = tv2 + t3 ;
          if ( tw3 > W ) break ;
          for ( int w4 = 0 ;
          w4 < cs . get ( minw + 3 ) ;
          w4 ++ ) {
            int t4 = ts . get ( w3 ) ;
            int tw4 = tw3 + w4 * ( minw + 3 ) ;
            int tv4 = tv3 + t4 ;
            if ( tw4 > W ) break ;
            result = Math . max ( result , tv4 ) ;
          }
        }
      }
    }
    System . out . println ( result ) ;
    return ts ;
  }
  