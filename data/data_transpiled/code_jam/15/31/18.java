private static boolean check ( int R , int C , int W , int [ ] [ ] B ) {
  int c = Integer . valueOf ( B [ 0 ] [ 0 ] ) . intValue ( ) ;
  for ( int y = 0 ;
  y < R ;
  y ++ ) {
    for ( int x = 0 ;
    x < C - W + 1 ;
    x ++ ) {
      if ( B [ y ] [ x ] . length == 1 && B [ y ] [ x ] . length == c && B [ y ] [ x ] . length == 0 && B [ y ] [ x ] . length == 0 && B [ y ] [ x ] . length == 0 && B [ y ] [ x ] . length == 0 && B [ y ] [ x ] . length == 0 && B [ y ] [ x ] . length == 0 && B [ y ] [ x ] . length == 0 && B [ y ] [ x ] . length == 0 && B [ y ] [ x ] . length == 0 && B [ y ] [ x ] . length == 0 && B [ y ] [ x ] . length == 0 && B [ y ] [ x ] . length == 0 && B [ y ] [ x ] . length == 0 && B [ y ] [ x ] . length == 0 && B [ y ] [ x ] . length == 0 && B [ y ] [ x ] . length == 0 && B [ y ] [ x ] . length == 0 && B [ y ] [ x ] . length == 0 ) {
        int Bt = Integer . valueOf ( B [ y ] [ x ] ) ;
        if ( memo . containsKey ( Bt ) ) return memo . get ( Bt ) ;
        int ans = 9999 ;
        for ( int y = 0 ;
        y < R ;
        y ++ ) {
          for ( int x = 0 ;
          x < C ;
          x ++ ) {
            if ( B [ y ] [ x ] == 0 ) {
              int ans2 = 0 ;
              B [ y ] [ x ] = 1 ;
              if ( check ( R , C , W , B ) ) {
                if ( Integer . valueOf ( B [ y ] [ x ] ) . intValue ( ) == W ) ans2 = Math . max ( ans2 , 1 ) ;
                else ans2 = Math . max ( ans2 , BT ( R , C , W , B ) + 1 ) ;
              }
              B [ y ] [ x ] = 0 ;
              ans = Math . min ( ans