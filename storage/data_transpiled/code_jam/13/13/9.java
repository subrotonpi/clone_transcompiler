@ VisibleForTesting static LinkedHashMap < Integer , Integer > solve ( int T ) {
  int tc = Integer . parseInt ( input ( ) ) ;
  for ( int tc = 0 ;
  tc < T ;
  tc ++ ) {
    int R = Integer . parseInt ( input ( ) ) ;
    int N = Integer . parseInt ( input ( ) ) ;
    int M = Integer . parseInt ( input ( ) ) ;
    int K = Integer . parseInt ( input ( ) ) ;
    {
      int [ ] fac = new int [ M + 1 ] ;
      for ( int d = 2 ;
      d <= M ;
      d ++ ) {
        while ( p % d == 0 ) {
          p /= d ;
          fac [ d ] ++ ;
        }
      }
      return fac ;
    }
  }
  System . out . println ( "Case #" + ( tc + 1 ) + ":" ) ;
  for ( int r = 0 ;
  r < R ;
  r ++ ) {
    int [ ] prod = Integer . parseInt ( input ( ) ) ;
    int [ ] [ ] factors = new int [ prod . length ] [ M + 1 ] ;
    for ( int p : prod ) factors [ p ] = p ;
    int [ ] numtimes = new int [ K ] ;
    for ( int k = 0 ;
    k < K ;
    k ++ ) {
      for ( int d = 2 ;
      d <= M ;
      d ++ ) numtimes [ d ] = Math . max ( numtimes [ d ] , factors [ k ] [ d ] ) ;
    }
    String ans = "" ;
    ans += "3" * numtimes [ 3 ] + "5" * numtimes [ 5 ] ;
    if ( 3 - ans . length ( ) == 1 ) {
      if ( numtimes [ 2 ] == 1 ) ans += '2' ;
      else ans += '4' ;
    }
    else if ( 3 - ans . length ( ) == 2 ) {
      if ( numtimes [ 2 ] == 4 ) ans += '44' ;
      else if ( numtimes [ 2 ] == 3 ) ans += '42' ;
      else ans += '22' ;
    }
    else {
      boolean has2 = any ( factors [ k ] [ 2 ] % 2 == 1 ) ;
      if ( has2 ) {
        ans += '2' ;
        numtimes [ 2 ] -- ;
      }
      int num4 = numtimes [ 2 ] / 2 ;
      if ( numtimes [ 2 ] % 2 == 1 ) ans += '2' ;
      ans += '4' * num4 ;
    }
    ans += '2' * ( 3 - ans . length ( ) ) ;
    System . out . println ( ans ) ;
  }
  return null ;
  