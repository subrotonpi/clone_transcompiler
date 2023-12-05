public static int abs ( int m ) {
  if ( m >= 0 ) return m ;
  else return - m ;
  int testCase = Integer . parseInt ( readLine ( ) ) ;
  for ( int repeat : xrange ( testCase ) ) {
    String [ ] line = readLine ( ) . split ( " " ) ;
    int [ ] bTask = new int [ 2 ] ;
    int [ ] oTask = new int [ 2 ] ;
    String [ ] taskOrder = new String [ 2 ] ;
    for ( int i = 1 ;
    i < line . length ;
    i += 2 ) {
      if ( line [ i ] . equals ( "O" ) ) oTask [ 0 ] = Integer . parseInt ( line [ i + 1 ] ) ;
      if ( line [ i ] . equals ( "B" ) ) bTask [ 0 ] = Integer . parseInt ( line [ i + 1 ] ) ;
      taskOrder [ 0 ] = line [ i ] ;
    }
    int t = 0 ;
    int bCurrent = 0 ;
    int oCurrent = 0 ;
    int bPos = 1 ;
    int oPos = 1 ;
    int taskCurrent = 0 ;
    while ( taskCurrent < taskOrder . length ) {
      if ( taskOrder [ taskCurrent ] . equals ( "B" ) ) {
        if ( bPos < bTask [ bCurrent ] ) bPos ++ ;
        else {
          if ( bPos > bTask [ bCurrent ] ) bPos -- ;
          else {
            bCurrent ++ ;
            taskCurrent ++ ;
          }
        }
        if ( oCurrent < oTask . length ) {
          if ( oPos < oTask [ oCurrent ] ) oPos ++ ;
          else {
            if ( oPos > oTask [ oCurrent ] ) oPos -- ;
          }
        }
      }
      else {
        if ( bCurrent < bTask . length ) {
          if ( bPos < bTask [ bCurrent ] ) bPos ++ ;
          else {
            if ( bPos > bTask [ bCurrent ] ) bPos -- ;
            else }
          }
          if ( oPos < oTask [ oCurrent ] ) oPos ++ ;
          else {
            if ( oPos > oTask [ oCurrent ] ) oPos -- ;
            else {
              oCurrent ++ ;
              taskCurrent ++ ;
            }
          }
        }
        t ++ ;
      }
      System . out . println ( "Case #" + ( repeat + 1 ) + ": " + t ) ;
      return t ;
    }
    