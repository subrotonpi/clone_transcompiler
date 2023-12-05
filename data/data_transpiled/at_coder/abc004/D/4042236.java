public static int R = Integer . parseInt ( input ) {
  int R = Integer . parseInt ( input . nextLine ( ) ) ;
  int G = Integer . parseInt ( input . nextLine ( ) ) ;
  int B = Integer . parseInt ( input . nextLine ( ) ) ;
  int ans = 10 * 10 ;
  {
    int prog = n -> n * ( n + 1 ) / 2 ;
    for ( int gLeft = - 49 - G ;
    gLeft < 51 ;
    gLeft ++ ) {
      int gRight = gLeft + G - 1 ;
      int rLeft ;
      int rRight ;
      int bLeft ;
      int rRight ;
      int rLeft ;
      int rRight ;
      int rRight ;
      int bRight ;
      int bLeft ;
      int bRight ;
      int res ;
      int res ;
      for ( gLeft = - 49 - G ;
      gLeft < 51 ;
      gRight = gLeft + G - 1 ) {
        gLeft = gLeft + G - 1 ;
        if ( - 100 + ( R - 1 ) / 2 < gLeft ) {
          rLeft = - 100 - R / 2 ;
          rRight = rLeft + R - 1 ;
        }
        else {
          rRight = gLeft - 1 ;
          rLeft = rRight - R + 1 ;
        }
        if ( gRight < 100 - ( B - 1 ) / 2 ) {
          bRight = 100 + B / 2 ;
          bLeft = bRight - B + 1 ;
        }
        else {
          bLeft = gRight + 1 ;
          bRight = bLeft + B - 1 ;
        }
        res = 0 ;
        if ( rLeft <= - 100 && rLeft <= rRight ) {
          res += prog ( - 100 - rLeft ) ;
          res += prog ( rRight - ( - 100 ) ) ;
        }
        else {
          res += prog ( R ) ;
          res += R * ( - 100 - rRight - 1 ) ;
        }
        if ( bLeft <= 100 && bRight <= bLeft ) {
          res += prog ( 100 - bLeft ) ;
          res += prog ( bRight - 100 ) ;
        }
        else {
          res += prog ( B ) ;
          res += B * ( bLeft - 100 - 1 ) ;
        }
        if ( gLeft <= 0 && gRight <= 0 ) {
          res += prog ( - gLeft ) ;
          res += prog ( gRight ) ;
        }
        else if ( gRight < 0 ) {
          res += prog ( G ) ;
          res += G * ( - gRight - 1 ) ;
        }
        else if ( 0 < gLeft ) {
          res += prog ( G ) ;
          res