public static int N = Integer . parseInt ( input ) {
  int [ ] s = {
    0 , 0 , 31 , 60 , 91 , 121 , 152 , 182 , 213 , 244 , 274 , 305 , 335 }
    ;
    int [ ] d = new int [ 366 ] ;
    for ( int i = 0 ;
    i < 366 ;
    i ++ ) {
      if ( i % 7 == 0 || i % 7 == 6 ) {
        d [ i ] = 1 ;
      }
    }
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      int [ ] md = Lists . newArrayList ( ) . stream ( ) . mapToInt ( Integer :: parseInt ) . toArray ( ) ;
      int dd = s [ md [ 0 ] ] + md [ 1 ] ;
      while ( d [ dd - 1 ] == 1 ) {
        dd ++ ;
        if ( dd == 367 ) {
          dd = 366 ;
          break ;
        }
      }
      d [ dd - 1 ] = 1 ;
    }
    int ans = 0 ;
    int ansb = 0 ;
    for ( int i = 0 ;
    i < 366 ;
    i ++ ) {
      if ( d [ i ] == 1 ) {
        ansb ++ ;
      }
      else {
        ansb = 0 ;
      }
      ans = Math . max ( ans , ansb ) ;
    }
    System . out . println ( ans ) ;
    return ans ;
  }
  