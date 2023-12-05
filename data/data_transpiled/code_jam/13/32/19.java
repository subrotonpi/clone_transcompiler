static int [ ] getPosition ( String s ) {
  int [ ] pos = {
    0 , 0 }
    ;
    for ( int i = 0 ;
    i < s . length ( ) ;
    i ++ ) {
      if ( s . charAt ( i ) == 'N' ) pos [ 1 ] += ( i + 1 ) ;
      if ( s . charAt ( i ) == 'W' ) pos [ 0 ] -= ( i + 1 ) ;
      if ( s . charAt ( i ) == 'E' ) pos [ 0 ] += ( i + 1 ) ;
      if ( s . charAt ( i ) == 'S' ) pos [ 1 ] -= ( i + 1 ) ;
    }
    for ( int T = 0 ;
    T < Integer . parseInt ( readLine ( ) ) ;
    T ++ ) {
      int finalPos = Integer . parseInt ( readLine ( ) . split ( " " ) [ 0 ] ) ;
      String res = "" ;
      pos [ 0 ] = 0 ;
      pos [ 1 ] = 0 ;
      int i = 1 ;
      while ( pos != finalPos ) {
        if ( pos [ 0 ] != finalPos ) {
          if ( pos [ 0 ] > finalPos [ 0 ] ) {
            res += "EW" ;
            pos [ 0 ] -- ;
          }
          else {
            res += "WE" ;
            pos [ 0 ] ++ ;
          }
        }
        else {
          if ( pos [ 1 ] > finalPos [ 1 ] ) {
            res += "NS" ;
            pos [ 1 ] -- ;
          }
          else {
            res += "SN" ;
            pos [ 1 ] ++ ;
          }
        }
        i += 2 ;
      }
      System . out . println ( "Case #" + ( T + 1 ) + ": " + res ) ;
    }
    return pos ;
  }
  