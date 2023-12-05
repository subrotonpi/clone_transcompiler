@ VisibleForTesting static int [ ] [ ] erase ( int h , int w ) {
  int [ ] [ ] c = new int [ h ] [ w ] ;
  int [ ] dx = {
    0 , 0 , 1 , 1 , 1 , - 1 , - 1 , - 1 }
    ;
    int [ ] dy = {
      - 1 , 1 , - 1 , 0 , 1 , - 1 , 0 , 1 }
      ;
      int maxScale = Math . min ( h , w ) / 7 ;
      for ( int i = 0 ;
      i < h ;
      i ++ ) {
        String cc = input . nextLine ( ) ;
        c [ i ] = new int [ ] {
          cc }
          ;
        }
        boolean inside = 0 <= y && y < h && 0 <= x && x < w ;
        /* Erase all the elements of the list */
        int cnt = 0 ;
        while ( q . length > 0 ) {
          int [ ] qq = q . pop ( ) ;
          int y = qq [ 0 ] ;
          int x = qq [ 1 ] ;
          if ( ! inside ) continue ;
          if ( c [ y ] [ x ] == '.' ) continue ;
          c [ y ] [ x ] = '.' ;
          cnt ++ ;
          for ( int i = 0 ;
          i < dx . length ;
          i ++ ) {
            q [ cnt ] = new int [ ] {
              y + dy [ i ] , x + dx [ i ] }
              ;
            }
          }
          /* Clasify */
          while ( cnt > 9 && cnt % 9 == 0 ) cnt /= 9 ;
          while ( cnt > 121 && cnt % 121 == 0 ) cnt /= 121 ;
          if ( cnt % 3 == 0 ) return 0 ;
          if ( cnt % 11 == 0 ) return 2 ;
          int [ ] [ ] abc = new int [ 3 ] [ 3 ] ;
          for ( int y = 0 ;
          y < h ;
          y += 3 ) {
            for ( int x = 0 ;
            x < w ;
            x += 3 ) {
              q = new int [ ] {
                y , x }
                ;
                cnt = erase ( q , c ) ;
                if ( cnt == 0 ) continue ;
                abc [ clasify ( cnt ) ] ++ ;
              }
            }
            System . out . println ( abc [ 0 ] + " " + abc [ 1 ] + " " + abc [ 2 ] ) ;
            return abc ;
          }
          