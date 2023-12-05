static final int [ ] [ ] getWordList ( ) {
  final double INF = Double . MAX_VALUE ;
  final double MOD = 10 * 9 + 7 ;
  final double [ ] dy = new double [ ] {
    0 , - 1 , 0 , 1 }
    ;
    final double [ ] dx = new double [ ] {
      1 , 0 , - 1 , 0 }
      ;
      /* LI */
      for ( int i = 0 ;
      i < 6 ;
      i ++ ) {
        for ( int j = 0 ;
        j < 6 ;
        j ++ ) {
          int hs = i ;
          int ws = j ;
          int hg = i ;
          int wg = j ;
          /* LS */
          for ( int i = 0 ;
          i < 6 ;
          i ++ ) {
            int h = i ;
            int w = i ;
            char [ ] src = new char [ h ] ;
            for ( int i = 0 ;
            i < h ;
            i ++ ) {
              char [ ] C = SI . toCharArray ( ) ;
              for ( int j = 0 ;
              j < C . length ;
              j ++ ) {
                if ( C [ i ] == 's' ) {
                  hs = i ;
                  ws = j ;
                }
                if ( C [ i ] == 'g' ) {
                  hg = i ;
                  wg = j ;
                }
              }
              src [ i ] = C ;
            }
          }
        }
      }
      int h = 0 ;
      int w = 0 ;
      char [ ] [ ] src = new char [ h ] [ w ] ;
      for ( int i = 0 ;
      i < h ;
      i ++ ) {
        char [ ] C = SI . toCharArray ( ) ;
        for ( int j = 0 ;
        j < C . length ;
        j ++ ) {
          char c = C [ j ] ;
          if ( c == 's' ) {
            hs = i ;
            ws = j ;
          }
          if ( c == 'g' ) {
            hg = i ;
          }
          else {
            wg = j ;
          }
        }
      }
      src [ i ] [ h ] = 3 ;
      visited [ h ] [ ws ] = 0 ;
      Deque < Integer > que = new LinkedList < Integer > ( ) ;
      que . add ( new Integer ( hs ) ) ;
      while ( que . size ( ) > 0 ) {
        int y = que . poll ( ) ;
        int x = que . poll ( ) ;
        for ( int k = 0 ;
        k < 4 ;
        k ++ ) {
          int yy = y + dy [ k ] ;
          int xx = x + dx [ k ] ;
          if ( yy < 0 || yy >= h || xx < 0 || xx >= w