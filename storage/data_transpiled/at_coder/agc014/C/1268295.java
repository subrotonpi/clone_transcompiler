static final int [ ] [ ] solve ( ) {
  final int [ ] dx = new int [ ] {
    1 , 0 , - 1 , 0 , }
    ;
    final int [ ] dy = new int [ ] {
      0 , 1 , 0 , - 1 , }
      ;
      final int inf = 1 << 60 ;
      {
        int h = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
        int w = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
        int k = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
        int si = - 1 ;
        int sj = - 1 ;
        boolean [ ] [ ] a = new boolean [ h ] [ w ] ;
        for ( int i = 0 ;
        i < h ;
        i ++ ) {
          String s = System . console ( ) . readLine ( ) ;
          for ( int j = 0 ;
          j < s . length ( ) ;
          j ++ ) {
            char ch = s . charAt ( j ) ;
            if ( ch == '.' ) {
              a [ i ] [ j ] = true ;
            }
            else if ( ch == 'S' ) {
              a [ i ] [ j ] = true ;
              si = i ;
              sj = j ;
            }
          }
        }
        boolean [ ] [ ] visited = new boolean [ w ] [ h ] ;
        visited [ si ] [ sj ] = true ;
        Queue < Integer > nxts = new ArrayDeque < > ( ) ;
        nxts . add ( new Integer [ ] {
          si , sj , 0 }
          ) ;
          int ans = inf ;
          while ( nxts . size ( ) > 0 ) {
            int i = nxts . poll ( ) ;
            int j = nxts . poll ( ) ;
            ans = min ( ans , i , h - 1 - i , j , w - 1 - j ) ;
            if ( ans == 0 ) {
              System . out . println ( 1 ) ;
              return null ;
            }
            for ( int l = 0 ;
            l < dx . length ;
            l ++ ) {
              int ni = i + dy [ l ] ;
              int nj = j + dx [ l ] ;
              if ( 0 <= ni && ni < h && 0 <= nj && nj < w && ! visited [ ni ] [ nj ] && a [ ni ] [ nj ] && d + 1 <= k ) {
                visited [ ni ] [ nj ] = true ;
                nxts . add ( new Integer ( ni ) ) ;
              }
            }
          }
          ans = (