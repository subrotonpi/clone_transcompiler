@ Sys public static void main ( String in ) {
  int dr [ ] = {
    - 1 , 0 , 0 , 1 }
    ;
    int dc [ ] = {
      0 , - 1 , 1 , 0 }
      ;
      int T = Integer . parseInt ( in . nextLine ( ) ) ;
      /* color #*/
      if ( C [ r ] [ c ] == null ) {
        int rn = 0 , cn = 0 ;
        for ( int i : xrange ( 4 ) ) {
          int r2 = r + dr [ i ] ;
          int c2 = c + dc [ i ] ;
          if ( 0 <= r2 && r2 < H && 0 <= c2 && c2 < W ) {
            if ( ( A [ r2 ] [ c2 ] < A [ r ] [ c ] ) && ( rn == 0 || A [ r2 ] [ c2 ] < A [ rn ] [ cn ] ) ) {
              rn = r2 ;
              cn = c2 ;
            }
          }
        }
        if ( rn == 0 ) {
          C [ r ] [ c ] = ( char ) ( 'a' + label ++ ) ;
        }
        else {
          C [ r ] [ c ] = color ( rn , cn ) ;
        }
      }
      for ( int i = 1 ;
      i <= T ;
      i ++ ) {
        String line = in . nextLine ( ) ;
        String [ ] parts = line . split ( " " ) ;
        H = Integer . parseInt ( parts [ 0 ] ) ;
        W = Integer . parseInt ( parts [ 1 ] ) ;
        A = new int [ H ] ;
        C = new int [ W ] ;
        for ( int r = 0 ;
        r < H ;
        r ++ ) {
          line = in . nextLine ( ) ;
          String [ ] parts = line . split ( " " ) ;
          int a [ ] = new int [ W ] ;
          for ( int s = 0 ;
          s < W ;
          s ++ ) {
            a [ s ] = Integer . parseInt ( parts [ s ] ) ;
          }
          A [ r ] = a ;
          C [ r ] = new int [ W ] ;
        }
        label = 0 ;
        for ( int r = 0 ;
        r < H ;
        r ++ ) {
          for ( int c = 0 ;
          c < W ;
          c ++ ) {
            if ( C [ r ] [ c ] == null ) {
              color ( r , c ) ;
            }
          }
        }
        System . out . printf ( "Case #%d:%n" , i ) ;
        for ( int r = 0 ;
        r < H ;
        r ++ ) {
          System . out . printf (