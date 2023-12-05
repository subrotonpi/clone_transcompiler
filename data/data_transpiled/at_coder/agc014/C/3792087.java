@ VisibleForTesting static void solve ( ) {
  int [ ] dr = new int [ ] {
    0 , 1 , 0 , - 1 }
    ;
    int [ ] dc = new int [ ] {
      1 , 0 , - 1 , 0 }
      ;
      /* solve */
      int H = Integer . parseInt ( input . nextLine ( ) ) ;
      int W = Integer . parseInt ( input . nextLine ( ) ) ;
      int K = Integer . parseInt ( input . nextLine ( ) ) ;
      boolean [ ] [ ] a = new boolean [ W ] [ H ] ;
      for ( int i = 0 ;
      i < H ;
      i ++ ) {
        a [ i ] [ i ] = false ;
      }
      int sy = - 1 , sx = - 1 ;
      for ( int r = 0 ;
      r < H ;
      r ++ ) {
        String s = input . nextLine ( ) ;
        for ( int c = 0 ;
        c < s . length ( ) ;
        c ++ ) {
          if ( s . charAt ( c ) == '.' ) {
            a [ r ] [ c ] = true ;
          }
          else if ( s . charAt ( c ) == 'S' ) {
            a [ r ] [ c ] = true ;
            sy = r ;
            sx = c ;
          }
        }
      }
      boolean [ ] [ ] visited = new boolean [ W ] [ H ] ;
      for ( int i = 0 ;
      i < H ;
      i ++ ) {
        visited [ i ] [ 0 ] = false ;
      }
      visited [ sy ] [ sx ] = true ;
      int t = Math . max ( H , W ) ;
      Queue < Integer > q = new ArrayDeque < > ( ) ;
      q . add ( new Integer ( sy ) ) ;
      q . add ( new Integer ( sx ) ) ;
      while ( q . size ( ) > 0 ) {
        int r = q . poll ( ) ;
        int c = q . poll ( ) ;
        int k = q . poll ( ) ;
        t = Math . min ( t , r , H - 1 - r , c , W - 1 - c ) ;
        if ( t == 0 ) {
          System . out . println ( 1 ) ;
          return ;
        }
        for ( int d_i = 0 ;
        d_i < 4 ;
        d_i ++ ) {
          int nr = r + dr [ d_i ] , nc = c + dc [ d_i ] ;
          if ( 0 <= nr && nr < H && 0 <= nc && nc < W && a [ nr ] [ nc ] && ! visited [ nr ] [ nc ] && k +