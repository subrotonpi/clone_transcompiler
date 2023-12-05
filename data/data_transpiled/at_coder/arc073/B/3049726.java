public static void main ( String input ) {
  int N = Integer . parseInt ( input ) , W = Integer . parseInt ( input ) ;
  int [ ] [ ] WV = new int [ N ] [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    WV [ i ] = new int [ N ] ;
    for ( int j = 0 ;
    j < N ;
    j ++ ) {
      WV [ i ] [ j ] = Integer . parseInt ( input ) ;
    }
  }
  @ SuppressWarnings ( "unchecked" ) LinkedHashMap < Integer , Integer > cs = new LinkedHashMap < Integer , Integer > ( ) ;
  for ( int w : WV ) {
    cs . put ( w , w ) ;
  }
  int minw = Collections . min ( cs . keySet ( ) ) ;
  for ( int k = minw ;
  k < minw + 4 ;
  k ++ ) {
    cs . put ( k , new ArrayList < Integer > ( 0 ) ) ;
  }
  int result = 0 ;
  for ( int w0 = 0 ;
  w0 < cs . get ( minw ) ;
  w0 ++ ) {
    int t0 = cs . get ( minw ) ;
    for ( int w1 = 0 ;
    w1 < cs . get ( minw + 1 ) ;
    w1 ++ ) {
      int t1 = cs . get ( minw + 1 ) ;
      int tw1 = w0 * minw + w1 * ( minw + 1 ) ;
      int tv1 = t0 + t1 ;
      if ( tw1 > W ) break ;
      for ( int w2 = 0 ;
      w2 < cs . get ( minw + 2 ) ;
      w2 ++ ) {
        int t2 = cs . get ( minw + 2 ) ;
        int tw2 = tw1 + w2 * ( minw + 2 ) ;
        int tv2 = tv1 + t2 ;
        if ( tw2 > W ) break ;
        for ( int w3 = 0 ;
        w3 < cs . get ( minw + 3 ) ;
        w3 ++ ) {
          int tw3 = tw2 + w3 * ( minw + 3 ) ;
          int tv3 = tv2 + t3 ;
          if ( tw3 > W ) break ;
          result = Math . max ( result , tv3 ) ;
        }
      }
    }
  }
  System . out . println ( result ) ;
}
