static int w = 0 ;
int qn = 0 ;
int [ ] m = new int [ 25 ] ;
int [ ] dir = new int [ ] {
  1 , 0 }
  ;
  int [ ] mv = new int [ ] {
    0 , 1 }
    ;
    int [ ] [ ] vec = new int [ ] {
      - 1 , 0 }
      ;
      Set < Integer > nums = new HashSet < Integer > ( ) ;
      for ( int i = 0 ;
      i < vec . length ;
      i ++ ) {
        nums . add ( Collections . singleton ( "0123456789" ) ) ;
      }
      {
        int loopN = Integer . parseInt ( readLine ( ) ) ;
        for ( int q : xrange ( loopN ) ) {
          System . out . println ( "Case #" + ( q + 1 ) + ":" ) ;
          m = new int [ w ] ;
          w = Integer . parseInt ( readLine ( ) ) ;
          qn = Integer . parseInt ( readLine ( ) ) ;
          for ( int i : xrange ( w ) ) {
            m [ i ] = readLine ( ) ;
          }
        }
        HashMap < Integer , Integer > c = new HashMap < Integer , Integer > ( ) ;
        for ( int i : xrange ( w ) ) {
          for ( int j : xrange ( w ) ) {
            if ( m [ i ] [ j ] >= '0' ) {
              c . put ( new Integer ( i ) , new Integer ( m [ i ] [ j ] ) ) ;
            }
          }
        }
        int [ ] qs = new int [ qn ] ;
        int [ ] oqs = qs . clone ( ) ;
        Map < Integer , Integer > qm = new HashMap < Integer , Integer > ( ) ;
        for ( int i = qs . length ;
        -- i >= 0 ;
        ) {
          if ( qm . get ( qs [ i ] ) != null ) {
            qs [ i ] -- ;
          }
        }
        if ( qs . length == 0 ) break ;
        HashMap < Integer , Integer > nc = new HashMap < Integer , Integer > ( ) ;
        for ( int k : c . keySet ( ) ) {
          int y = k ;
          int x = k ;
          mv = Integer . parseInt ( m [ y ] [ x ] ) ;
          nc . put ( k , new Integer ( ) ) ;
          for ( int dx = 0 ;
          dx < vec . length ;
          ++ dx ) {
            int dy = vec [ dx ] ;
            int nx = x + dx ;
            int ny = y + dy ;
            if ( nx < 0 || ny < 0 || nx >= w || ny >= w )