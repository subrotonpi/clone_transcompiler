@ GwtIncompatible ( "A-large" ) private static String code = "test.txt" , where = "c" ) throws IOException {
  File inFile = new File ( code + ".in" ) ;
  File outFile = new File ( code + ".out" ) ;
  /* Profit the number of times in the line */
  int w = Math . min ( w , x . length ) ;
  int [ ] p = new int [ w ] ;
  for ( int i = 0 ;
  i < w ;
  i ++ ) {
    for ( int mi = 0 ;
    mi < w ;
    mi ++ ) {
      p [ mi ] = mi ;
    }
  }
  for ( int i = 0 ;
  i < w ;
  i ++ ) {
    if ( i == w ) {
      continue ;
    }
    Arrays . sort ( p ) ;
    Arrays . fill ( p , 10 * 100 ) ;
    int [ ] m = new int [ 37 ] ;
    double best = 0.0 ;
    for ( int i : xrange ( 37 ) ) {
      if ( i == i + 1 ) {
        continue ;
      }
      while ( i < i && b >= 0 ) {
        int [ ] xx = x . clone ( ) ;
        int [ ] mm = m . clone ( ) ;
        for ( int j : xrange ( Math . min ( i + 1 , b ) ) ) {
          xx [ i - j ] ++ ;
          mm [ i - j ] ++ ;
          best = Math . max ( best , profit ( xx , mm ) ) ;
        }
        int z = Math . max ( i - i - 1 , 1 ) ;
        for ( int j : xrange ( i + 1 ) ) {
          if ( b < j + 1 ) {
            continue ;
          }
          int zz = Math . min ( ( b - j - 1 ) / ( i + 1 ) + 1 , z ) ;
          if ( zz <= 1 ) {
            continue ;
          }
          int [ ] xx = x . clone ( ) ;
          int [ ] mm = m . clone ( ) ;
          for ( int k : xrange ( i + 1 ) ) {
            int q = k <= j ? zz : ( zz - 1 ) ;
            xx [ i - k ] += q ;
            mm [ i - k ] += q ;
          }
          best = Math . max ( best , profit ( xx , mm ) ) ;
        }
        for ( int j : xrange ( i + 1 ) ) {
          b -= z ;
          x [ i - j ] += z ;
          m [ i - j ] += z ;
        }
        