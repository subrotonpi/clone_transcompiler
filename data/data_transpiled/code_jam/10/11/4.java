static boolean check ( int [ ] [ ] B , int color , int K ) {
  int [ ] dx = {
    1 , 0 , 1 , 1 }
    ;
    int [ ] dy = {
      0 , 1 , 1 , - 1 }
      ;
      /* Check if the color is not specified */
      for ( int i = 0 ;
      i < B . length ;
      i ++ ) {
        for ( int j = 0 ;
        j < B . length ;
        j ++ ) {
          for ( int d = 0 ;
          d < 4 ;
          d ++ ) {
            boolean found = true ;
            for ( int k = 0 ;
            k < K ;
            k ++ ) {
              int ni = i + k * dx [ d ] ;
              int nj = j + k * dy [ d ] ;
              if ( ni < 0 || nj < 0 || ni >= B . length || nj >= B [ ni ] . length || B [ ni ] [ nj ] != color ) {
                found = false ;
                break ;
              }
            }
            if ( found ) {
              return true ;
            }
          }
        }
      }
      /* Check if the color is not specified */
      int T = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
      for ( int t = 0 ;
      t < T ;
      t ++ ) {
        String [ ] s = System . console ( ) . readLine ( ) . split ( " " ) ;
        int N = Integer . parseInt ( s [ 0 ] ) ;
        int K = Integer . parseInt ( s [ 1 ] ) ;
        B = new int [ N ] [ K ] ;
        for ( int i = 0 ;
        i < N ;
        i ++ ) {
          int [ ] l = new int [ N ] ;
          s = System . console ( ) . readLine ( ) . split ( " " ) ;
          for ( int j = 0 ;
          j < N ;
          j ++ ) {
            if ( s [ j ] == 'R' ) {
              l [ j ] = 1 ;
            }
            else if ( s [ j ] == 'B' ) {
              l [ j ] = 2 ;
            }
            else {
              l [ j ] = 0 ;
            }
          }
          B [ i ] = l ;
        }
      }
      int [ ] [ ] C = new int [ N ] [ N ] ;
      for ( int i = 0 ;
      i < N ;
      i ++ ) {
        int [ ] l = new int [ N ] ;
        for ( int j = 0 ;
        j < N ;
        j ++ ) {
          l [ j ]