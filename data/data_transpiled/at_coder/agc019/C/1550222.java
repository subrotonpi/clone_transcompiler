@ VisibleForTesting static final Comparator < int [ ] > binarySort = new Comparator < int [ ] > ( ) {
  @ Override public int compare ( int [ ] input , int [ ] in ) {
    int [ ] in = new int [ in . length ] ;
    for ( int i = 0 ;
    i < in . length ;
    i ++ ) {
      in [ i ] = in [ i ] ;
    }
    int sx = in [ 0 ] ;
    int sy = in [ 1 ] ;
    int gx = in [ 2 ] ;
    int gy = in [ 3 ] ;
    boolean yrev = false ;
    if ( sx > gx ) {
      sx = sx ;
      sy = sy ;
      gx = sx ;
      gy = sy ;
    }
    if ( sy > gy ) {
      sy = 10 * 10 * 8 - 1 - sy ;
      gy = 10 * 10 * 8 - 1 - gy ;
      yrev = true ;
    }
    int N = in [ 0 ] ;
    int [ ] [ ] fountains = new int [ N ] [ ] ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      int x = in [ 0 ] ;
      int y = in [ 1 ] ;
      if ( yrev ) {
        y = 10 * 10 * 8 - 1 - y ;
      }
      if ( ( sx <= x && x <= gx ) & ( sy <= y && y <= gy ) ) {
        fountains [ i ] = new int [ ] {
          x , y }
          ;
        }
      }
      Arrays . sort ( fountains ) ;
      int [ ] L = new int [ N ] ;
      if ( fountains . length > 0 ) {
        L [ 0 ] = fountains [ 0 ] [ 1 ] ;
      }
      for ( int i = 0 ;
      i < L . length ;
      i ++ ) {
        int x = fountains [ i ] [ 0 ] ;
        int y = fountains [ i ] [ 1 ] ;
        if ( L [ i ] < y ) {
          L [ i ] = y ;
        }
        else {
          L [ i ] = y ;
        }
      }
      if ( Math . min ( gx - sx , gy - sy ) + 1 == L . length ) {
        System . out . println ( ( ( gx - sx ) + ( gy - sy ) ) * 100 - ( 20 - 5 * PI ) * ( L . length - 1 ) + ( 10 * PI - 20 ) ) ;
      }
      else {
        System . out . println ( ( ( gx - sx ) + ( gy