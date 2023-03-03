public static void input ( ) {
  String day = input . substring ( 0 , day . length ( ) - 3 ) ;
  String [ ] weekday = {
    "Mon" , "Tues" , "Wednes" , "Thurs" , "Fri" }
    ;
    for ( int i = 0 ;
    i < weekday . length ;
    i ++ ) {
      if ( day . substring ( 0 , day . length ( ) - 3 ) . equals ( weekday [ i ] ) ) {
        System . out . println ( 5 - i ) ;
        exit ( ) ;
      }
    }
    System . out . println ( 0 ) ;
  }
  