public static String T = input . nextLine ( ) {
  String row ;
  for ( int i = 0 ;
  i < 4 ;
  i ++ ) {
    row = StringUtils . toString ( new String [ ] {
      b . get ( i ) }
      ) ;
      if ( row . equals ( "TXXX" ) || row . equals ( "OOOT" ) || row . equals ( "XXXX" ) || row . equals ( "OOOO" ) ) {
        return row . substring ( 2 ) + " won" ;
      }
    }
    for ( int i = 0 ;
    i < 4 ;
    i ++ ) {
      row = StringUtils . toString ( new String [ ] {
        b . get ( j ) }
        ) ;
        if ( row . equals ( "TXXX" ) || row . equals ( "OOOT" ) || row . equals ( "XXXX" ) || row . equals ( "OOOO" ) ) {
          return row . substring ( 2 ) + " won" ;
        }
      }
      row = StringUtils . toString ( new String [ ] {
        b . get ( i ) }
        ) ;
        if ( row . equals ( "TXXX" ) || row . equals ( "OOOT" ) || row . equals ( "XXXX" ) || row . equals ( "OOOO" ) ) {
          return row . substring ( 2 ) + " won" ;
        }
        row = StringUtils . toString ( new String [ ] {
          b . get ( i ) [ 3 - i ] }
          ) ;
          if ( row . equals ( "TXXX" ) || row . equals ( "OOOT" ) || row . equals ( "XXXX" ) || row . equals ( "OOOO" ) ) {
            return row . substring ( 2 ) + " won" ;
          }
          for ( int i = 0 ;
          i < 4 ;
          i ++ ) {
            for ( int j = 0 ;
            j < 4 ;
            j ++ ) {
              if ( b . get ( i ) [ j ] == '.' ) {
                return "Game has not completed" ;
              }
            }
          }
          return "Draw" ;
        }
        for ( int testCase = 0 ;
        testCase < T ;
        testCase ++ ) {
          char [ ] [ ] board = new char [ 4 ] [ 4 ] ;
          for ( int i = 0 ;
          i < 4 ;
          i ++ ) {
            String x = new String ( board [ i ] ) ;
            board [ i ] = new char [ x . length ( ) ] ;
            board [ i ] [ j ] = blank ;
          }
          