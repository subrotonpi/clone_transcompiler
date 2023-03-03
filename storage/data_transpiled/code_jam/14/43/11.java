public static int T = Integer . parseInt ( Scanner in ) {
  for ( int tt = 0 ;
  tt < T ;
  tt ++ ) {
    String [ ] ii = in . nextLine ( ) . split ( "\\s+" ) ;
    int W = Integer . parseInt ( ii [ 0 ] ) ;
    int H = Integer . parseInt ( ii [ 1 ] ) ;
    int B = Integer . parseInt ( ii [ 2 ] ) ;
    int result = 0 ;
    int [ ] [ ] river = new int [ W ] [ H ] ;
    for ( int bb = 0 ;
    bb < B ;
    bb ++ ) {
      int [ ] block = Integer . parseInt ( in . nextLine ( ) ) ;
      for ( int xx = block [ 1 ] ;
      xx <= block [ 3 ] ;
      xx ++ ) {
        for ( int yy = block [ 0 ] ;
        yy <= block [ 2 ] ;
        yy ++ ) {
          river [ xx ] [ yy ] = 1 ;
        }
      }
    }
    for ( int xx = 0 ;
    xx < W ;
    xx ++ ) {
      int x = xx ;
      int y = 0 ;
      if ( river [ y ] [ x ] == 1 ) {
        continue ;
      }
      List < Integer > used = new ArrayList < Integer > ( ) ;
      while ( ( x < W - 1 && river [ y ] [ x + 1 ] == 0 && ( y = x + 1 ) != 0 ) || ( y < H - 1 && river [ y + 1 ] [ x ] == 0 && ( y = y + 1 ) != 0 ) || ( x > 0 && river [ y ] [ x - 1 ] == 0 && ( y = x - 1 ) != 0 ) || ( y > 0 && river [ y - 1 ] [ x ] == 0 && ( y = y - 1 ) != 0 ) ) {
        used . add ( new Integer ( y ) ) ;
        if ( x < W - 1 && river [ y ] [ x + 1 ] == 0 && ( y = x + 1 ) != 0 ) {
          x = x + 1 ;
        }
        else if ( y < H - 1 && river [ y + 1 ] [ x ] == 0 && ( y = y + 1 ) != 0 ) {
          y = y + 1 ;
          if ( y == H - 1 ) {
            result ++ ;
            for ( Integer u : used ) {
              river [ u . intValue ( ) ] [ u . intValue ( ) ] = 1 ;
            }
          }
        }
        else if ( x > 0 && river [ y ] [ x - 1