public static int [ ] cookiesDivide ( int numOfPer , int [ ] A ) {
  if ( ( A [ 0 ] == A [ 1 ] == A [ 2 ] ) && ( A [ 0 ] % 2 + A [ 1 ] % 2 + A [ 2 ] % 2 == 0 ) ) return new int [ ] {
    - 1 , A }
    ;
    if ( ( A [ 0 ] % 2 + A [ 1 ] % 2 + A [ 2 ] % 2 > 0 ) && ( A [ 0 ] % 2 + A [ 1 ] % 2 + A [ 2 ] % 2 > 0 ) ) return new int [ ] {
      0 , A }
      ;
      int [ ] R = new int [ numOfPer ] ;
      for ( int i = 0 ;
      i < numOfPer ;
      i ++ ) R [ i ] = 0 ;
      for ( int j = 0 ;
      j < numOfPer ;
      j ++ ) R [ i ] = A [ 1 ] / 2 + A [ 2 ] / 2 ;
      R [ 1 ] = A [ 0 ] / 2 + A [ 2 ] / 2 ;
      R [ 2 ] = A [ 0 ] / 2 + A [ 1 ] / 2 ;
      return new int [ ] {
        1 , R }
        ;
        if ( ( className == "java.lang.String" ) ) {
          int count = 0 ;
          A = new int [ 3 ] ;
          while ( true ) {
            int returnCode = cookiesDivide ( 3 , A ) ;
            if ( returnCode < 0 ) {
              System . out . println ( returnCode ) ;
              break ;
            }
            if ( returnCode == 0 ) {
              System . out . println ( count ) ;
              break ;
            }
            count += returnCode ;
          }
        }
        return new int [ ] {
          1 , R }
          ;
        }
        