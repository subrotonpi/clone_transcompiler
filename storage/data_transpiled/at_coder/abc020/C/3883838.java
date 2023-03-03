static final int [ ] [ ] getStdOut ( ) {
  final int stdin = System . in ;
  System . setOut ( stdin ) ;
  {
    int [ ] [ ] li = map ( Integer . parseInt ( stdin ) , new int [ ] {
    }
    ) ;
    int [ ] [ ] li = map ( Integer . parseInt ( stdin ) , new int [ ] {
    }
    ) ;
    int low = 0 ;
    int high = 10 * 9 + 1 ;
    while ( high - low > 1 ) {
      int mid = ( high + low ) / 2 ;
      int [ ] dist = dijkstra ( graph , hs , ws , mid ) ;
      if ( dist [ hg ] [ wg ] <= t ) {
        low = mid ;
      }
      else {
        high = mid ;
      }
    }
    System . out . println ( low ) ;
  }
  {
    int [ ] ls = map ( Integer . parseInt ( stdin ) , new int [ ] {
    }
    ) ;
  }
  {
    int [ ] ns = map ( Integer . parseInt ( stdin ) , new int [ ] {
    }
    ) ;
  }
  {
    int [ ] lc = map ( Integer . parseInt ( stdin ) , new int [ ] {
    }
    ) ;
  }
  {
    int [ ] ni = map ( Integer . parseInt ( stdin ) , new int [ ] {
    }
    ) ;
  }
  {
    int [ ] nf = map ( Float . parseFloat ( stdin ) , new int [ ] {
    }
    ) ;
    @ SuppressWarnings ( "unused" ) {
      int [ ] [ ] dist = new int [ W ] [ ] ;
      for ( int i = 0 ;
      i < H ;
      i ++ ) {
        dist [ i ] [ 0 ] = Double . POSITIVE_INFINITY ;
        dist [ i ] [ 1 ] = Double . POSITIVE_INFINITY ;
      }
    }
  }
  {
    int [ ] dhs = {
      0 , 1 , 0 , - 1 }
      ;
      int [ ] dws = {
        1 , 0 , - 1 , 0 }
        ;
        while ( que . length > 0 ) {
          int dcur = map ( Integer . parseInt ( que [ 0 ] ) , new int [ ] {
            hs , wcur }
            ) ;
            int hcur = map ( Integer . parseInt ( stra_tree ( dhs , wcur ) ) , new int [ ] {
              hs , wcur }
              ) ;
              int [ ] [ ] dhs = {
                0 , 1 , 0 , - 1 }
                ;
                int [ ] [ ] dws = {
                  1 , 0 , - 1 , 0 }
                  ;
                  while ( hcur < H ) {
                    int [ ] dcur = map (