public static void fin ( File fin ) throws IOException {
  File fout = new File ( "d.in" ) ;
  /* CArray */
  if ( dims != null ) {
    /* Convert the dims to the cc array */
    carray ( dims . length - 1 , init ) ;
  }
  else {
    /* Convert the dims to the cc array */
    int S = 105 ;
    int [ ] [ ] cc = carray ( new int [ S + 2 ] [ S + 2 ] , 0 ) ;
    cc [ 0 ] [ 0 ] = 1 ;
    for ( int i : xrange ( S ) ) {
      for ( int j : xrange ( S ) ) {
        cc [ i + 1 ] [ j + 2 ] += cc [ i ] [ j ] ;
        cc [ i + 2 ] [ j + 1 ] += cc [ i ] [ j ] ;
      }
    }
    /* comb the x and y */
    int w = cc [ 0 ] [ 0 ] ;
    int h = cc [ 0 ] [ 1 ] ;
    int w = cc [ 1 ] [ 2 ] ;
    int r = cc [ 2 ] [ 3 ] ;
    for ( int i = 0 ;
    i < w ;
    i ++ ) {
      int j = cc [ i ] [ j ] ;
      cc [ i ] [ j ] = cc [ i ] [ j ] ;
      if ( h > 2 * h || w > w * w ) {
        /* 0 */
      }
      else if ( h == 2 * h || w == w * w ) {
        /* 1 */
      }
      else {
        /* 10 */
      }
    }
    /* Calculate the result of the two rocks */
    int M = 10007 ;
    if ( rocks != null ) {
      /* (calc(start,end,rocks.length)-calc(rocks[0],end,rocks.length)*calc(start,rocks[0],newint[0])) % M */
    }
    else {
      int xd = end [ 1 ] - start [ 1 ] ;
      int yd = end [ 0 ] - start [ 0 ] ;
      /* comb the result of the two rocks */
      int result = calc ( new int [ ] {
        1 , 1 }
        , new int [ ] {
          h , w }
          , rocks ) ;
        }
      }
    }
    