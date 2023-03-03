@ GwtIncompatible ( "java.util.Scanner" ) public static int [ ] [ ] getInts ( ) {
  return new int [ ] [ ] {
    Integer . parseInt ( z ) , Integer . parseInt ( z ) }
    ;
    /* get the answer */
    String answer = "IMPOSSIBLE" ;
    int [ ] [ ] remainder = {
      {
        1 , R , 'R' , 0 }
        , {
          1 , Y , 'Y' , 1 }
          , {
            1 , B , 'B' , 2 }
          }
          ;
          for ( int t : xrange ( R + Y + B ) ) {
            final int p = Math . max ( remainder [ t ] [ 0 ] , 1 ) ;
            final int q = Math . max ( remainder [ t ] [ 1 ] , 1 ) ;
            final int r = Math . max ( remainder [ t ] [ 2 ] , 1 ) ;
            final int s = Math . max ( remainder [ t ] [ 3 ] , 1 ) ;
            for ( int k = 0 ;
            k < s ;
            k ++ ) {
              remainder [ k ] [ 0 ] = 1 ;
            }
            remainder [ s ] [ 0 ] = 0 ;
            x [ t ] = r ;
            remainder [ t ] [ 1 ] -- ;
          }
          final String [ ] remainder = remainder ;
          if ( remainder [ 0 ] . equals ( remainder [ -- i ] ) ) {
            final int v = remainder [ 0 ] ;
            int i = 1 ;
            while ( i + 1 < R + Y + B && ( remainder [ i ] == v || remainder [ i + 1 ] == v ) ) {
              i ++ ;
            }
            if ( i == R + Y + B - 1 ) {
              System . out . println ( >>> "TROUBLE" ) ;
            }
            else {
              remainder = Arrays . copyOf ( remainder , ( i + 1 ) + Arrays . asList ( v ) + remainder [ ( i + 1 ) ] . length ) ;
            }
          }
          /* get the answer */
          final int T = Integer . parseInt ( answer ) ;
          for ( int cn : xrange ( 1 , 1 + T ) ) {
            final int N = N - 1 ;
            final int R = R - G ;
            final int O = Y - V ;
            final int B = B - O ;
            if ( ( ( R2 < 0 ) || ( Y2 < 0 ) || ( B2 < 0 ) || ( R2 > Y2 + B2 ) || ( R2 > R2 + B2 ) ) ) {
              answer = "IMPOSSIBLE" ;
              