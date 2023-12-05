public static int [ ] [ ] x , y = Integer [ ] [ ] y . toArray ( new int [ 0 ] [ ] ) {
  @ Override public int [ ] [ ] divide ( int [ ] [ ] in ) {
    int a = Math . abs ( in [ 0 ] [ 0 ] ) ;
    int b = Math . abs ( in [ 0 ] [ 0 ] ) ;
    if ( a == b ) {
      System . out . println ( 1 ) ;
    }
    else if ( y == 0 ) {
      if ( in [ 0 ] [ 0 ] > 0 ) {
        System . out . println ( in [ 0 ] [ 0 ] + 1 ) ;
      }
      else {
        System . out . println ( a ) ;
      }
    }
    else if ( in [ 0 ] [ 0 ] >= 0 && in [ 0 ] [ 0 ] < 0 ) {
      if ( in [ 0 ] [ 0 ] < in [ 0 ] [ 0 ] ) {
        System . out . println ( in [ 0 ] [ 0 ] - in [ 0 ] [ 0 ] ) ;
      }
      else {
        System . out . println ( in [ 0 ] [ 0 ] - in [ 0 ] [ 0 ] + 2 ) ;
      }
    }
    else if ( in [ 0 ] [ 0 ] >= 0 || in [ 0 ] [ 0 ] >= 0 ) {
      System . out . println ( Math . abs ( in [ 0 ] [ 0 ] - in [ 0 ] [ 0 ] ) + 1 ) ;
    }
    else {
      if ( in [ 0 ] [ 0 ] > in [ 0 ] [ 0 ] ) {
        System . out . println ( in [ 0 ] [ 0 ] - in [ 0 ] [ 0 ] ) ;
      }
      else {
        System . out . println ( in [ 0 ] [ 0 ] - in [ 0 ] [ 0 ] + 2 ) ;
      }
    }
    return new int [ ] [ ] {
      in [ 0 ] [ 0 ] , in [ 1 ] [ 1 ] }
      ;
    }
  }
  