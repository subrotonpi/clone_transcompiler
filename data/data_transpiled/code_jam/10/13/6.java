static final int [ ] solve ( int x ) {
  final int [ ] fst = {
    1 , 1 }
    ;
    /* pre loop */
    for ( int i : xrange ( 2 , 1000001 ) ) {
      fst [ i ] = i + 1 - fst [ fst [ i - 1 ] ] ;
    }
    /* solve the first element */
    int A1 = ( Integer ) ( System . in . readLine ( ) . trim ( ) ) ;
    int A2 = ( Integer ) ( System . in . readLine ( ) . trim ( ) ) ;
    int B1 = ( Integer ) ( System . in . readLine ( ) . trim ( ) ) ;
    int B2 = ( Integer ) ( System . in . readLine ( ) . trim ( ) ) ;
    int ans = 0 ;
    for ( int i : xrange ( A1 , A2 + 1 ) ) {
      int f = fst [ i ] , l = fst [ i ] + i - 1 ;
      if ( B2 < f || B1 > l ) {
        ans += ( B2 - B1 + 1 ) ;
      }
      else {
        if ( B1 >= f && B2 <= l ) {
        }
        else if ( B1 <= f && B2 >= l ) {
        }
        else if ( B1 <= f && B2 >= l ) {
          ans += ( B2 - B1 + 1 ) - ( l - f + 1 ) ;
        }
        else if ( B1 > f ) {
          ans += ( B2 - l ) ;
        }
        else {
          ans += ( f - B1 ) ;
        }
      }
    }
    System . out . println ( "Case #" + x + ":" + ans ) ;
    if ( __name__ . equals ( "solve" ) ) {
      /* pre loop */
      int T = Integer . parseInt ( System . in . readLine ( ) . trim ( ) ) ;
      for ( int i : xrange ( 1 , T + 1 ) ) {
        /* solve the first element */
        solve ( i ) ;
      }
    }
    return fst ;
  }
  