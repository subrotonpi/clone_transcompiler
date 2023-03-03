public static void input ( ) {
  String d ;
  if ( d . equals ( "Sunday" ) || d . equals ( "Saturday" ) ) {
    System . out . println ( 0 ) ;
  }
  else {
    String [ ] D = {
      "Monday" , "Tuesday" , "Wednesday" , "Thursday" , "Friday" }
      ;
      for ( int i = 0 ;
      i < 5 ;
      i ++ ) {
        if ( D [ i ] . equals ( d ) ) {
          System . out . println ( 5 - i ) ;
        }
      }
    }
  }
  