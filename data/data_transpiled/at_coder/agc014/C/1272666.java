static int solve ( ) {
  final int mod = 10 * 9 + 7 ;
  final int inf = 1 << 30 ;
  {
    final int H = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
    final int W = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
    final int K = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
    final boolean [ ] [ ] A = new boolean [ H ] [ W ] ;
    for ( int i = 0 ;
    i < H ;
    i ++ ) {
      A [ i ] [ i ] = false ;
    }
    int si = 0 ;
    int sj = - 1 ;
    for ( int i = 0 ;
    i < H ;
    i ++ ) {
      final char ai = Character . toUpperCase ( ai ) ;
      for ( int j = 0 ;
      j < W ;
      j ++ ) {
        if ( ai == 'S' ) {
          si = i ;
          sj = j ;
          A [ i ] [ j ] = true ;
        }
        else if ( ai == '.' ) {
          A [ i ] [ j ] = true ;
        }
      }
    }
    final int ans = bfs ( H , W , K , A , si , sj ) ;
    System . out . println ( ans ) ;
  }
  {
    final int [ ] dx = new int [ ] {
      1 , 0 , - 1 , 0 , }
      ;
      final int [ ] dy = new int [ ] {
        0 , 1 , 0 , - 1 , }
        ;
        int min_step = inf ;
        final boolean [ ] [ ] visited = new boolean [ W ] [ W ] ;
        for ( int i = 0 ;
        i < H ;
        i ++ ) {
          visited [ i ] [ i ] = false ;
        }
        visited [ si ] [ sj ] = true ;
        final Queue < Integer > nxts = new ArrayDeque < Integer > ( ) ;
        nxts . add ( new Integer ( si ) ) ;
        nxts . add ( new Integer ( sj ) ) ;
        while ( nxts . size ( ) > 0 ) {
          final int r = nxts . poll ( ) ;
          final int c = nxts . poll ( ) ;
          final int d = nxts . poll ( ) ;
          min_step = Math . min ( min_step , r , H - 1 - r , c , W - 1 - c ) ;
          if ( min_step == 0 ) return 1 ;
          if ( d + 1 > K ) continue ;
          for ( int k = 0 ;
          k < dx