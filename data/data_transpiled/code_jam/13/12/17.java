static final int [ ] getStdErr ( ) {
  final int [ ] [ ] data = new int [ ] [ ] {
    Integer . MIN_VALUE , Integer . MAX_VALUE , Integer . MIN_VALUE , Integer . MAX_VALUE , Integer . MIN_VALUE }
    ;
    final int [ ] [ ] data = new int [ ] [ ] {
      Integer . MIN_VALUE , Integer . MAX_VALUE , Integer . MIN_VALUE }
      ;
      final int [ ] token = data [ 0 ] ;
      final int T = Integer . parseInt ( data [ 1 ] [ 0 ] ) ;
      /* Case #*/
      mainLarge ( ) ;
      /* Case #*/
      int E = data [ 0 ] [ 0 ] ;
      final int R = data [ 1 ] [ 0 ] ;
      final int N = data [ 1 ] [ 0 ] ;
      final int [ ] v = new int [ N ] ;
      for ( int i = 0 ;
      i < N ;
      i ++ ) {
        v [ i ] = data [ i ] [ 0 ] ;
      }
      int res = 0 ;
      final int [ ] rng = new int [ E + 1 ] ;
      /* Case #*/
      for ( int i = 0 ;
      i < E ;
      i ++ ) {
        rng [ i ] = rng [ i ] ;
      }
      /* Case #*/
      int cur = 0 ;
      int e = E ;
      for ( int i = 0 ;
      i < E ;
      i ++ ) {
        int j = rng [ i ] ;
        if ( e < j ) return - 1 ;
        cur += j * v [ i ] ;
        e = Math . min ( E , e - j + R ) ;
      }
      /* Case #*/
      for ( int i = 0 ;
      i < N ;
      i ++ ) {
        rng [ i ] = rng [ i ] ;
        res = Math . max ( res , rng [ i ] ) ;
      }
      /* Case #*/
      setRecursionLimit ( 100000 ) ;
      /* Case #*/
      int E = data [ 0 ] [ 0 ] ;
      final int R = data [ 0 ] [ 0 ] ;
      final int N = data [ 1 ] [ 0 ] ;
      final int [ ] v = new int [ N ] ;
      for ( int i = 0 ;
      i < N ;
      i ++ ) {
        rng [ i ] = rng [ i ] ;
      }
      /* Case #*/
      for ( int i = 0 ;
      i < N ;
      i ++ ) {
        rng [ i ] = rng [ i ] ;
      }
      /* Case #*/
      return v ;
    }
    