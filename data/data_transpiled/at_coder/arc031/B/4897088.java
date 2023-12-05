private static void dfs ( int [ ] [ ] map , int [ ] start ) {
  int startRow = start [ 0 ] ;
  int startColumn = start [ 1 ] ;
  map [ startRow ] [ startColumn ] = 0 ;
  if ( startRow != 0 && map [ startRow - 1 ] [ startColumn ] == 1 ) {
    map = dfs ( map , new int [ ] {
      startRow - 1 , startColumn }
      ) ;
    }
    if ( startRow != 9 && map [ startRow + 1 ] [ startColumn ] == 1 ) {
      map = dfs ( map , new int [ ] {
        startRow + 1 , startColumn }
        ) ;
      }
      if ( startColumn != 0 && map [ startRow ] [ startColumn - 1 ] == 1 ) {
        map = dfs ( map , new int [ ] {
          startRow , startColumn - 1 }
          ) ;
        }
        if ( startColumn != 9 && map [ startRow ] [ startColumn + 1 ] == 1 ) {
          map = dfs ( map , new int [ ] {
            startRow , startColumn + 1 }
            ) ;
          }
          /* boolean isClosed = true */
          int [ ] [ ] closedMap = new int [ 10 ] [ 10 ] ;
          for ( int i = 0 ;
          i < closedMap . length ;
          i ++ ) {
            closedMap [ i ] [ 0 ] = i ;
          }
          if ( map == closedMap ) {
            /* return true */
          }
          else {
            /* return false */
          }
          /* make map of rawMap */
          int [ ] [ ] newMap = new int [ 10 ] [ 10 ] ;
          for ( int i = 0 ;
          i < newMap . length ;
          i ++ ) {
            newMap [ i ] [ 0 ] = i ;
            for ( int row = 0 ;
            row < newMap [ i ] . length ;
            row ++ ) {
              for ( int column = 0 ;
              column < newMap [ i ] . length ;
              column ++ ) {
                if ( rawMap [ i ] [ column ] == 'x' ) {
                  newMap [ i ] [ column ] = 0 ;
                }
                else {
                  newMap [ i ] [ column ] = 1 ;
                }
              }
            }
            /* return newMap; */
          }
          if ( getClass ( ) . equals ( "com.mysql.jdbc.Driver" ) ) {
            boolean isCovered = false ;
            start = new int [ 10 ] [ 10 ] ;
            int [ ] [ ] orgMap = new int