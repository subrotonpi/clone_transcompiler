public static boolean isLeap ( int year ) {
  if ( year % 400 == 0 ) {
    return true ;
  }
  else if ( year % 100 == 0 ) {
    return false ;
  }
  else if ( year % 4 == 0 ) {
    return true ;
  }
  else {
    return false ;
  }
  /* main program */
  @ SuppressWarnings ( "resource" ) String ymd = input . nextLine ( ) ;
  int ymdMod [ ] = new int [ ] {
    Integer . parseInt ( ymd ) }
    ;
    int days [ ] = {
      31 , 29 , 31 , 30 , 31 , 30 , 31 , 31 , 30 , 31 , 30 , 31 }
      ;
      for ( int i = ymdMod [ 0 ] ;
      i < 3000 ;
      i ++ ) {
        for ( int month = 0 ;
        month < days . length ;
        month ++ ) {
          for ( int d = 1 ;
          d <= day ;
          d ++ ) {
            if ( isLeap ( i ) && month == 2 && d == 29 ) {
              String candidate = new SimpleDateFormat ( "yyyy/MM/dd" ) . format ( new Date ( year ) ) ;
              if ( year % ( month * d ) == 0 && candidate . compareTo ( ymd ) >= 0 ) {
                System . out . println ( candidate ) ;
                exit ( ) ;
              }
            }
            else if ( ! isLeap ( i ) && month == 2 && d == 29 ) {
            }
            else {
              String candidate = new SimpleDateFormat ( "yyyy/MM/dd" ) . format ( new Date ( year ) ) ;
              if ( year % ( month * d ) == 0 && candidate . compareTo ( ymd ) >= 0 ) {
                System . out . println ( candidate ) ;
                exit ( ) ;
              }
            }
          }
        }
        System . out . println ( "3000/01/01" ) ;
      }
      if ( className . equals ( "java.util.Date" ) ) {
        new Date ( ) ;
      }
      return false ;
    }
    