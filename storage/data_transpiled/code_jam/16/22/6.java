static final int solve ( ) {
  int tn = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
  for ( int ti = 0 ;
  ti < tn ;
  ti ++ ) {
    char [ ] a = new char [ tn ] , b = new char [ tn ] ;
    int n = a . length ;
    char [ ] best = new char [ ] {
      2 * 80 , '' , '' }
      ;
      /* Check for a and b */
      if ( k == a . length ) {
        int i = Integer . parseInt ( new String ( a ) ) ;
        int j = Integer . parseInt ( new String ( b ) ) ;
        int d = Math . abs ( i - j ) ;
        if ( d < best [ 0 ] || ( d == best [ 0 ] && ( i < Integer . MAX_VALUE ) || ( i == Integer . MIN_VALUE && j < Integer . MAX_VALUE ) ) ) {
          best = new char [ ] {
            d , '?' }
            ;
          }
        }
        /* Check for a and b */
        if ( k == a . length ) {
          if ( b [ 0 ] == '?' ) {
            if ( an == 0 ) {
              a [ k ] = b [ k ] = '0' ;
              bt ( k + 1 , 0 ) ;
              a [ k ] = '1' ;
              bt ( k + 1 , 1 ) ;
              a [ k ] = '0' ;
              b [ k ] = '1' ;
              bt ( k + 1 , - 1 ) ;
            }
            else if ( an > 0 ) {
              a [ k ] = '0' ;
              b [ k ] = '9' ;
              bt ( k + 1 , 1 ) ;
            }
            else {
              a [ k ] = '9' ;
              b [ k ] = '0' ;
              bt ( k + 1 , - 1 ) ;
            }
            a [ k ] = '?' ;
          }
        }
        else {
          if ( b [ 0 ] == '?' ) {
            if ( an == 0 ) {
              a [ k ] = b [ k ] ;
              bt ( k + 1 , 0 ) ;
              if ( b [ k ] != '0' ) {
                a [ k ] = ( char ) ( b [ k ] - 1 ) ;
                bt ( k + 1 , - 1 ) ;
              }
            }
            else if ( b [ 0 ] != '?' ) {
              a [ k ] = '0' ;
              bt ( k + 1 , 1 ) ;
            }
          }
          else if ( b [ 0 ] == '?' ) {
            bt ( k + 1 , 0 )