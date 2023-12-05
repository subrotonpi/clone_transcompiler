@ VisibleForTesting static int [ ] [ ] getRoundedPoints ( ) {
  final String [ ] lines = new String [ ] {
    "line #" + t + ": " + line }
    ;
    final int T = Integer . parseInt ( lines [ 0 ] ) ;
    final int [ ] [ ] ropes = new int [ T ] [ ] ;
    for ( int i = 0 ;
    i < T ;
    i ++ ) {
      if ( lines [ i ] . length < 2 ) {
        return ropes [ i ] [ 1 ] > ropes [ i ] [ 1 ] ? 1 : - 1 ;
      }
      else if ( lines [ i ] . length > 2 ) {
        return ropes [ i ] [ 1 ] < ropes [ i ] [ 1 ] ? 1 : - 1 ;
      }
      else {
        System . err . println ( "error" + lines [ i ] + " " + lines [ i ] ) ;
        System . exit ( 0 ) ;
      }
    }
    int idx = 1 ;
    for ( int t = 1 ;
    t <= T ;
    t ++ ) {
      final int N = Integer . parseInt ( lines [ idx ] ) ;
      ropes [ 0 ] = new int [ N ] ;
      for ( int n = 0 ;
      n < N ;
      n ++ ) {
        final String [ ] l = lines [ idx + 1 + n ] . split ( " " ) ;
        final int [ ] ints = new int [ l . length ] ;
        for ( int i = 0 ;
        i < l . length ;
        i ++ ) {
          ints [ i ] = Integer . parseInt ( l [ i ] ) ;
        }
        ropes [ n ] [ 0 ] = ints [ n ] ;
      }
    }
    int answer = 0 ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      for ( int j = i + 1 ;
      j < N ;
      j ++ ) {
        if ( simpleIntersect ( ropes [ i ] , ropes [ j ] ) ) {
          answer ++ ;
        }
      }
    }
    idx += 1 + N ;
    System . out . println ( "Case #" + t + ": " + answer ) ;
    return ropes ;
  }
  