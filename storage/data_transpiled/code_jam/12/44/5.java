{
  BACKWARD = new int [ ] {
    - 1 , 0 }
    ;
    FORWARD = new int [ ] {
      1 , 0 }
      ;
      FORWARD = new int [ ] {
        1 , 0 }
        ;
        CaveMap [ ] caves = new int [ H ] ;
        for ( int y = 0 ;
        y < H ;
        y ++ ) {
          caveMap [ y ] = file . readLine ( ) . trim ( ) ;
          for ( int x = 0 ;
          x < W ;
          x ++ ) {
            if ( Character . isDigit ( caves [ y ] [ x ] ) ) {
              caves [ ( int ) x ] = new int [ x + 1 ] ;
            }
          }
        }
        {
          System . out . println ( "Case #" + testCase ) ;
        }
        {
          for ( int i = 0 ;
          i < caves . length ;
          i ++ ) {
            int px = caves [ i ] ;
            int py = caves [ i ] ;
            if ( 0 <= x + px && x + px < W && 0 <= y + py && y + py < H ) {
              return new int [ ] {
                x + px , y + py }
                ;
              }
            }
          }
          {
            Set < Point > frontier = new HashSet < Point > ( ) ;
            frontier . add ( p ) ;
            Set < Point > points = new HashSet < Point > ( frontier ) ;
            while ( frontier . size ( ) > 0 ) {
              final int x = frontier . remove ( 0 ) ;
              final int y = frontier . remove ( 0 ) ;
              frontier . remove ( 0 ) ;
              for ( int i = 0 ;
              i < x + 1 ;
              i ++ ) {
                final int px = caves [ i ] ;
                final int py = caves [ i ] ;
                if ( caveMap [ py ] [ px ] != '#' ) {
                  if ( ! points . contains ( new Point ( px , py ) ) ) {
                    frontier . add ( new Point ( px , py ) ) ;
                    points . add ( new Point ( px , py ) ) ;
                  }
                }
              }
            }
            return points ;
          }
          {
            Set < Point > res = new HashSet < Point > ( ) ;
            final int dx = move . x ;
            final int dy = move . y ;
            for ( int i = 0 ;
            i < x ;
            i ++ ) {
              final int x = points . remove ( i ) ;
              if ( caveMap [ y + dy ] [ x + dx ] != ' #